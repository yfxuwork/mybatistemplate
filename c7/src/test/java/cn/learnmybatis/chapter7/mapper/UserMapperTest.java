package cn.learnmybatis.chapter7.mapper;

import cn.learnmybatis.chapter7.model.SysRole;
import cn.learnmybatis.chapter7.model.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

/**
 * Created by Administrator on 2018/9/22 0022.
 */
public class UserMapperTest extends BaseMapperTest {



    @Test
    public void testUpdateByMap(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper sysUserMapper=sqlSession.getMapper(SysUserMapper.class);

        Map<String,Object> map=new HashMap<String,Object>();
        //查询条件,同样也是更新字段,必须保证该值存在
        map.put("id",1046l);
        //要更新的其他字段
        map.put("user_email","NoFuckLe");
        map.put("user_password","wocao");
        sysUserMapper.updateByMap(map);

        SysUser user=sysUserMapper.selectById(1046l);
        Assert.assertEquals("NoFuckLe",user.getUser_email());

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsertList(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper sysUserMapper=sqlSession.getMapper(SysUserMapper.class);

        List<SysUser> userList=new ArrayList<SysUser>();

        for (int i=0;i<10;i++){
            SysUser user=new SysUser();
            user.setUser_name("test"+i);
            user.setUser_password("123321");
            user.setUser_email("fuck@fuck.com");
            user.setCreate_time(new Date());
            userList.add(user);
        }
        int result=sysUserMapper.insertList(userList);
        Assert.assertEquals(10,result);

        for (SysUser user:userList)
            System.out.println(user.getId());

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectByIdList(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper sysUserMapper=sqlSession.getMapper(SysUserMapper.class);
        List<Long> idList=new ArrayList<Long>();
        idList.add(1l);
        idList.add(1002l);

        List<SysUser> userList=sysUserMapper.selectByIdList(idList);
        Assert.assertEquals(2,userList.size());

        sqlSession.close();
    }

    @Test
    public void testSelectByIdOrUserName(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper sysUserMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser query=new SysUser();
        query.setId(1002l);
        query.setUser_name("testt");
        SysUser user=sysUserMapper.selectByIdOrUserName(query);
        Assert.assertNotNull(user);

        query.setId(null);
        user=sysUserMapper.selectByIdOrUserName(query);
        Assert.assertNotNull(user);

        query.setUser_name(null);
        user=sysUserMapper.selectByIdOrUserName(query);
        Assert.assertNull(user);

        sqlSession.close();
    }

    @Test
    public void testUpdateByIdSelective(){
        SqlSession sqlSession=getSqlSession();
        SysUserMapper sysUserMapper=sqlSession.getMapper(SysUserMapper.class);
        SysUser user=new SysUser();
        user.setId(1002l);

        user.setUser_email("fuck");
        user.setUser_name("testtt");
        int result=sysUserMapper.updateByIdSelective(user);

        Assert.assertEquals(1,result);

        user=sysUserMapper.selectById(1002l);

        Assert.assertEquals("testtt",user.getUser_name());
        Assert.assertEquals("fuck",user.getUser_email());


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectByUser() {
        SqlSession sqlSession = getSqlSession();
        SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        //只查询用户名时
        SysUser query = new SysUser();
        query.setUser_name("ad");
        List<SysUser> userList = sysUserMapper.selectByUser(query);
        Assert.assertTrue(userList.size() > 0);
        //只查询用户邮箱时
        query = new SysUser();
        query.setUser_email("admin@mybatis.tk");
        userList = sysUserMapper.selectByUser(query);
        Assert.assertTrue(userList.size() > 0);
        //当同时查询用户名和邮箱时
        query=new SysUser();
        query.setUser_name("ad");
        query.setUser_email("admin@mybaastis.tk");
        userList = sysUserMapper.selectByUser(query);
        Assert.assertTrue(userList.size() == 0);


        sqlSession.close();
    }

    @Test
    public void testSelectByUserBind() {
        SqlSession sqlSession = getSqlSession();
        SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        //只查询用户名时
        SysUser query = new SysUser();
        query.setUser_name("ad");
        List<SysUser> userList = sysUserMapper.selectByUserBind(query);
        Assert.assertTrue(userList.size() > 0);
        //只查询用户邮箱时
        query = new SysUser();
        query.setUser_email("admin@mybatis.tk");
        userList = sysUserMapper.selectByUserBind(query);
        Assert.assertTrue(userList.size() > 0);
        //当同时查询用户名和邮箱时
        query=new SysUser();
        query.setUser_name("ad");
        query.setUser_email("admin@mybaastis.tk");
        userList = sysUserMapper.selectByUserBind(query);
        Assert.assertTrue(userList.size() == 0);


        sqlSession.close();
    }



    @Test
    public void testSelectById() {
        SqlSession sqlSession = getSqlSession();
        SysUserMapper sysUserMapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser user = sysUserMapper.selectById(1l);
        Assert.assertNotNull(user);
        Assert.assertEquals("admin", user.getUser_name());

        sqlSession.close();
    }

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();

        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        List<SysUser> userList = userMapper.selectAll();
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size() > 0);

        sqlSession.close();

    }

    @Test
    public void testSelectRolesByUserId() {
        SqlSession sqlSession = getSqlSession();

        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        List<SysRole> userList = userMapper.selectRolesByUserId(1l);
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size() > 0);

        sqlSession.close();
    }

    @Test
    public void testSelectRolesByUserId2() {
        SqlSession sqlSession = getSqlSession();

        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        List<SysRole> roleList = userMapper.selectRolesByUserId2(1l);
        Assert.assertNotNull(roleList);
        Assert.assertTrue(roleList.size() > 0);

        sqlSession.close();
    }

    @Test
    public void testInsert() {
        SqlSession sqlSession = getSqlSession();

        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser user = new SysUser();
        user.setUser_name("test1");
        user.setUser_password("123456");
        user.setUser_email("fuck@fuck.fuck");
        user.setCreate_time(new Date());

        int result = userMapper.myInsert(user);

        Assert.assertEquals(1, result);

        Assert.assertNull(user.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsert2() {
        SqlSession sqlSession = getSqlSession();

        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser user = new SysUser();
        user.setUser_name("test2");
        user.setUser_password("123456");
        user.setUser_email("fuck@fuck.fuck");
        user.setCreate_time(new Date());

        int result = userMapper.myInsert2(user);

        Assert.assertEquals(1, result);
        Assert.assertNotNull(user.getId());
        System.out.println(user.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testInsert3() {
        SqlSession sqlSession = getSqlSession();

        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser user = new SysUser();
        user.setUser_name("test3");
        user.setUser_password("123456");
        user.setUser_email("fuck@fuck.fuck");
        user.setCreate_time(new Date());

        int result = userMapper.myInsert3(user);

        Assert.assertEquals(1, result);
        Assert.assertNotNull(user.getId());
        System.out.println(user.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testUpdateById() {
        SqlSession sqlSession = getSqlSession();

        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);

        SysUser user = userMapper.selectById(1002l);
        Assert.assertEquals("test3", user.getUser_name());
        user.setUser_name("fucking test3");
        user.setUser_email("@.com");
        int result = userMapper.updateById(user);

        Assert.assertEquals(1, result);

        user = userMapper.selectById(user.getId());
        Assert.assertEquals("fucking test3", user.getUser_name());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById() {
        SqlSession sqlSession = getSqlSession();
        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        SysUser user1 = userMapper.selectById(1003l);
        Assert.assertNotNull(user1);
        Assert.assertEquals(1, userMapper.deleteById(user1.getId()));
        Assert.assertNull(userMapper.selectById(1003l));

        SysUser user2 = userMapper.selectById(1004l);
        Assert.assertNotNull(user2);
        Assert.assertEquals(1, userMapper.deleteById(user2.getId()));
        Assert.assertNull(userMapper.selectById(1004l));

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testSelectRolesByUserIdAndRoleEnabled() {
        SqlSession sqlSession = getSqlSession();
        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);
        List<SysRole> userList = userMapper.selectRolesByUserIdAndRoleEnabled(1l, 1);
        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size() > 0);

        sqlSession.close();
    }

    @Test
    public void testSelectRolesByUserAndRole() {
        SqlSession sqlSession = getSqlSession();
        SysUserMapper userMapper = sqlSession.getMapper(SysUserMapper.class);

        SysUser user = new SysUser();
        SysRole role = new SysRole();

        user.setId(1l);
        role.setEnabled(1);

        List<SysRole> userList = userMapper.selectRolesByUserAndRole(user, role);

        Assert.assertNotNull(userList);
        Assert.assertTrue(userList.size() > 0);

        sqlSession.close();
    }


}
