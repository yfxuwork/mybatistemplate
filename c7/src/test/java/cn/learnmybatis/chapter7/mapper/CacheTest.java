package cn.learnmybatis.chapter7.mapper;

import cn.learnmybatis.chapter7.model.SysRole;
import cn.learnmybatis.chapter7.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/11/7 0007.
 */
public class CacheTest extends BaseMapperTest{

    @Test
    public void testDirtyData(){

        System.out.println("新sqlSession1");

        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=userMapper.selectUserAndRoleByid(1002l);
        System.out.println("角色名"+user.getRole().getRole_name());
        sqlSession.close();

        System.out.println("新sqlSession2");

        sqlSession=getSqlSession();
        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);
        SysRole role=roleMapper.selectById(3l);
        role.setRole_name("脏数据");
        roleMapper.updateById(role);
        sqlSession.commit();
        sqlSession.close();

        System.out.println("新sqlSession3");

        sqlSession=getSqlSession();

        userMapper=sqlSession.getMapper(SysUserMapper.class);
        roleMapper=sqlSession.getMapper(SysRoleMapper.class);
        user=userMapper.selectUserAndRoleByid(1002l);
        role=roleMapper.selectById(3l);
        System.out.println("Assert普通用户:"+user.getRole().getRole_name());
        System.out.println("Assert脏数据:"+role.getRole_name());
        System.out.println("角色名:"+user.getRole().getRole_name());

        role.setRole_name("无用用户chapter7");
        roleMapper.updateById(role);
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void testL2Cache(){
        SqlSession sqlSession=getSqlSession();
        SysRole role1=null;
        try {
            SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);
            role1=roleMapper.selectById(1l);
            role1.setRole_name("New Name i am role1");
            SysRole role2=roleMapper.selectById(1l);
            System.out.println(role2.getRole_name());
            Assert.assertEquals(role1,role2);
        }finally {
            sqlSession.close();
        }
        System.out.println("新Session");

        sqlSession=getSqlSession();

        try {
            SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);
            SysRole role2=roleMapper.selectById(1l);
            System.out.println(role2.getRole_name());
//            Assert.assertNotEquals(role1,role2);
            Assert.assertEquals(role1,role2);
            SysRole role3=roleMapper.selectById(1l);
//            Assert.assertNotEquals(role2,role3);
            Assert.assertEquals(role2,role3);
        }finally {
            sqlSession.close();
        }

    }

    @Test
    public void testL1Cache(){
        SqlSession sqlSession=getSqlSession();
        SysUser user1=null;

        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        user1=userMapper.selectById(1002l);
        user1.setUser_name("New Name");
        SysUser user2=userMapper.selectById(1002l);
        System.out.println(user2.getUser_name());
        //Assert.assertEquals(user1,user2);
        sqlSession.close();

        //开始另一个新的session
        System.out.println("开始另一个新的session");
        sqlSession=getSqlSession();

        SysUserMapper userMapper1=sqlSession.getMapper(SysUserMapper.class);

        SysUser user5=userMapper1.selectById(1002l);
        //Assert.assertNotEquals("New Name",user5.getUser_name());
        System.out.println(user5.getUser_name());
        //Assert.assertNotEquals(user5,user2);

        userMapper1.deleteById(1004l);

        SysUser user3=userMapper1.selectById(1002l);

        //Assert.assertNotEquals(user5,user3);

        sqlSession.commit();
        sqlSession.close();

    }

}
