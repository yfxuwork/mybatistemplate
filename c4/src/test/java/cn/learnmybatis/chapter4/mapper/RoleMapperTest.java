package cn.learnmybatis.chapter4.mapper;

import cn.learnmybatis.chapter4.model.SysRole;
import org.apache.ibatis.session.SqlSession;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/9/27 0027.
 */



public class RoleMapperTest extends BaseMapperTest{


    @Test
    public void testSelectById(){
        SqlSession sqlSession=getSqlSession();

        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);
        SysRole role=roleMapper.selectById(1l);
        Assert.assertNotNull(role);
        Assert.assertEquals("管理员",role.getRole_name());

        sqlSession.close();
    }

    @Test
    public void testSelectById2(){
        SqlSession sqlSession=getSqlSession();

        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);
        SysRole role=roleMapper.selectById2(1l);
        Assert.assertNotNull(role);
        Assert.assertEquals("管理员",role.getRole_name());

        sqlSession.close();
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession=getSqlSession();

        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);
        List<SysRole> roleList=roleMapper.selectAll();

        Assert.assertNotNull(roleList);
        Assert.assertTrue(roleList.size()>0);
        Assert.assertNotNull(roleList.get(0).getRole_name());

        sqlSession.close();

    }


    @Test
    public void testMyInsert(){
        SqlSession sqlSession=getSqlSession();
        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);

        SysRole role=new SysRole();
        role.setRole_name("fuking test");
        role.setEnabled(0);
        role.setCreate_by(1l);
        role.setCreate_time(new Date());

        int result=roleMapper.myInsert(role);

        Assert.assertEquals(1,result);
//        Assert.assertNotNull(role.getId());
        System.out.println(role.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testMyInsert2(){
        SqlSession sqlSession=getSqlSession();
        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);

        SysRole role=new SysRole();
        role.setRole_name("fuking test");
        role.setEnabled(0);
        role.setCreate_by(1l);
        role.setCreate_time(new Date());

        int result=roleMapper.myInsert2(role);

        Assert.assertEquals(1,result);
        Assert.assertNotNull(role.getId());
        System.out.println(role.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void testMyInsert3(){
        SqlSession sqlSession=getSqlSession();
        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);

        SysRole role=new SysRole();
        role.setRole_name("fuking test");
        role.setEnabled(0);
        role.setCreate_by(1l);
        role.setCreate_time(new Date());

        int result=roleMapper.myInsert3(role);

        Assert.assertEquals(1,result);
        Assert.assertNotNull(role.getId());
        System.out.println(role.getId());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();

    }


    @Test
    public void testUpdateById(){
        SqlSession sqlSession=getSqlSession();

        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);

        SysRole role=roleMapper.selectById(5l);
        Assert.assertEquals("fuking test",role.getRole_name());
        role.setRole_name("fucking");
        role.setEnabled(1);

        int result=roleMapper.updateById(role);

        Assert.assertEquals(1,result);

        role=roleMapper.selectById(role.getId());
        System.out.println(role.getRole_name());

        //sqlSession.rollback();
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testDeleteById(){
        SqlSession sqlSession=getSqlSession();

        SysRoleMapper roleMapper=sqlSession.getMapper(SysRoleMapper.class);

        int result=roleMapper.deleteById(4l);

        System.out.println(result);

        sqlSession.commit();
        sqlSession.close();

    }

}
