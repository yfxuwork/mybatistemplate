package cn.learnmybatis.chapter6.mapper;

import cn.learnmybatis.chapter6.model.SysPrivilege;
import cn.learnmybatis.chapter6.model.SysPrivilegeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysPrivilegeMapper {
    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    long countByExample(SysPrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int deleteByExample(SysPrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insert(SysPrivilege record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insertSelective(SysPrivilege record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    List<SysPrivilege> selectByExample(SysPrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    SysPrivilege selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysPrivilege record, @Param("example") SysPrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExample(@Param("record") SysPrivilege record, @Param("example") SysPrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKeySelective(SysPrivilege record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKey(SysPrivilege record);
}