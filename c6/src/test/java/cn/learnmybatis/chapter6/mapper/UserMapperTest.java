package cn.learnmybatis.chapter6.mapper;

import cn.learnmybatis.chapter6.model.SysPrivilege;
import cn.learnmybatis.chapter6.model.SysRole;
import cn.learnmybatis.chapter6.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/22 0022.
 */
public class UserMapperTest extends BaseMapperTest{


    @Test
    public void testDeleteUserById(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        userMapper.deleteUserById(1003l);

        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testInsertUserAndRoles(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=new SysUser();
        user.setUser_name("test1");
        user.setUser_password("123456");
        user.setUser_email("test@mybatis.tk");
        //插入用户信息和角色关联信息
        userMapper.insertUserAndRoles(user,"1,2");
        Assert.assertNotNull(user.getId());
        Assert.assertNotNull(user.getCreate_time());

        sqlSession.commit();

        sqlSession.close();

        System.out.println(user.getId());
    }

    @Test
    public void testSelectUserPage(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        Map<String,Object> params=new HashMap<String,Object>();
        params.put("userName","ad");
        params.put("offset",0);
        params.put("limit",10);
        List<SysUser> userList=userMapper.selectUserPage(params);
        Long total=(Long)params.get("total");
        System.out.println("总数:"+total);
        for (SysUser user:userList){
            System.out.println("用户名:"+user.getUser_name());
        }

        sqlSession.close();
    }

    @Test
    public void testSelectUserById(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=new SysUser();
        user.setId(1L);

        userMapper.selectUserById(user);
        Assert.assertNotNull(user);
        System.out.println("用户名:"+user.getUser_name());

        sqlSession.close();
    }

    @Test
    public void testSelectAllUserAndRolesSelect(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=userMapper.selectAllUserAndRolesSelect(1l);
        System.out.println("用户名:"+user.getUser_name());
        for (SysRole role:user.getRoleList()){
            System.out.println("角色名:"+role.getRole_name());
            for (SysPrivilege privilege:role.getPrivilegeList()){
                System.out.println("权限名:"+privilege.getPrivilege_name());
            }
        }

        sqlSession.close();
    }


    @Test
    public void testSelectAllUserAndRoles2(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        List<SysUser> userList=userMapper.selectAllUserAndRoles2();

        System.out.println("用户数:"+userList.size());
        for (SysUser user:userList){
            System.out.println("用户名:"+user.getUser_name());
            for (SysRole role:user.getRoleList()){
                System.out.println("角色名:"+role.getRole_name());
                for (SysPrivilege privilege:role.getPrivilegeList()){
                    System.out.println("权限名:"+privilege.getPrivilege_name());
                }
            }
        }

        sqlSession.close();
    }

    @Test
    public void testSelectAllUserAndRoles(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        List<SysUser> userList=userMapper.selectAllUserAndRoles();

        System.out.println("用户数:"+userList.size());
        for (SysUser user:userList){
            System.out.println("用户名:"+user.getUser_name());
            for (SysRole role:user.getRoleList()){
                System.out.println("角色名:"+role.getRole_name());
            }
        }

        sqlSession.close();
    }

    @Test
    public void testLazyLoadTriggerMethods(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=userMapper.selectUserAndRoleByIdSelect(1001l);
        System.out.println("----------------调用user.equals---------------");
        user.equals(null);

        Assert.assertNotNull(user);
        System.out.println("----------------调用user.getRole()---------------");
        Assert.assertNotNull(user.getRole());

        sqlSession.close();
    }

    @Test
    public void testSelectUserAndRoleByIdSelect(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=userMapper.selectUserAndRoleByIdSelect(1001l);

        Assert.assertNotNull(user);
        System.out.println("----------------调用user.getRole()---------------");
        Assert.assertNotNull(user.getRole());

        sqlSession.close();
    }

    @Test
    public void testSelectUserAndRoleById3(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=userMapper.selectUserAndRoleById3(1001l);

        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getRole());

        sqlSession.close();
    }

    @Test
    public void testSelectUserAndRoleById2(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=userMapper.selectUserAndRoleById2(1001l);

        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getRole());

        sqlSession.close();
    }

    @Test
    public void testSelectUserAndRoleByid(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper userMapper=sqlSession.getMapper(SysUserMapper.class);

        SysUser user=userMapper.selectUserAndRoleByid(1001l);

        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getRole());

        sqlSession.close();
    }

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
