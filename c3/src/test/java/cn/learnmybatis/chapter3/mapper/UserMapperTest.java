package cn.learnmybatis.chapter3.mapper;

import cn.learnmybatis.chapter3.model.SysRole;
import cn.learnmybatis.chapter3.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/9/22 0022.
 */
public class UserMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper sysUserMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=sysUserMapper.selectById(1l);
        Assert.assertNotNull(user);
        Assert.assertEquals("admin",user.getUser_name());

        sqlSession.close();
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession=getSqlSession();

        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        List<SysUser> userList=userMapper.selectAll();
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size()>0);

        sqlSession.close();

    }

    @Test
    public void testSelectRolesByUserId(){
        SqlSession sqlSession=getSqlSession();

        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        List<SysRole> userList=userMapper.selectRolesByUserId(1l);
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size()>0);

        sqlSession.close();
    }

    @Test
    public void testSelectRolesByUserId2(){
        SqlSession sqlSession=getSqlSession();

        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        List<SysRole> roleList=userMapper.selectRolesByUserId2(1l);
        Assert.assertNotNull(roleList);
        Assert.assertTrue(roleList.size()>0);

        sqlSession.close();
    }

    @Test
    public void testInsert(){
        SqlSession sqlSession=getSqlSession();

        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=new SysUser();
        user.setUser_name("test1");
        user.setUser_password("123456");
        user.setUser_email("fuck@fuck.fuck");
        user.setCreate_time(new Date());

        int result=userMapper.myInsert(user);

        Assert.assertEquals(1,result);

        Assert.assertNull(user.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsert2(){
        SqlSession sqlSession=getSqlSession();

        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=new SysUser();
        user.setUser_name("test2");
        user.setUser_password("123456");
        user.setUser_email("fuck@fuck.fuck");
        user.setCreate_time(new Date());

        int result=userMapper.myInsert2(user);

        Assert.assertEquals(1,result);
        Assert.assertNotNull(user.getId());
        System.out.println(user.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsert3(){
        SqlSession sqlSession=getSqlSession();

        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=new SysUser();
        user.setUser_name("test3");
        user.setUser_password("123456");
        user.setUser_email("fuck@fuck.fuck");
        user.setCreate_time(new Date());

        int result=userMapper.myInsert3(user);

        Assert.assertEquals(1,result);
        Assert.assertNotNull(user.getId());
        System.out.println(user.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateById(){
        SqlSession sqlSession=getSqlSession();

        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=userMapper.selectById(1002l);
        Assert.assertEquals("test3",user.getUser_name());
        user.setUser_name("fucking test3");
        user.setUser_email("@.com");
        int result=userMapper.updateById(user);

        Assert.assertEquals(1,result);

        user=userMapper.selectById(user.getId());
        Assert.assertEquals("fucking test3",user.getUser_name());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user1=userMapper.selectById(1003l);
        Assert.assertNotNull(user1);
        Assert.assertEquals(1,userMapper.deleteById(user1.getId()));
        Assert.assertNull(userMapper.selectById(1003l));

        SysUser user2=userMapper.selectById(1004l);
        Assert.assertNotNull(user2);
        Assert.assertEquals(1,userMapper.deleteById(user2.getId()));
        Assert.assertNull(userMapper.selectById(1004l));

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testSelectRolesByUserIdAndRoleEnabled(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        List<SysRole> userList=userMapper.selectRolesByUserIdAndRoleEnabled(1l,1);
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size()>0);

        sqlSession.close();
    }

    @Test
    public void testSelectRolesByUserAndRole(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=new SysUser();
        SysRole role=new SysRole();

        user.setId(1l);
        role.setEnabled(1);

        List<SysRole> userList=userMapper.selectRolesByUserAndRole(user,role);

        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size()>0);

        sqlSession.close();
    }



}
