package cn.learnmybatis.chapter7.mapper;

import cn.learnmybatis.chapter7.model.SysPrivilege;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
public class PrivilegeMapperTest extends BaseMapperTest{


    @Test
    public void testSelectById(){

        SqlSession sqlSession=getSqlSession();
        PrivilegeMapper privilegeMapper=sqlSession.getMapper(PrivilegeMapper.class);

        SysPrivilege privilege=privilegeMapper.selectById(2l);

        System.out.println(privilege.getPrivilege_name());


        sqlSession.close();
    }

}
