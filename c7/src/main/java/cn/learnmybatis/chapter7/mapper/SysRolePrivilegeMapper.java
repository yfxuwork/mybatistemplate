package cn.learnmybatis.chapter7.mapper;

import java.util.List;

import cn.learnmybatis.chapter7.model.SysRolePrivilege;
import cn.learnmybatis.chapter7.model.SysRolePrivilegeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRolePrivilegeMapper {
    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    long countByExample(SysRolePrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int deleteByExample(SysRolePrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insert(SysRolePrivilege record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insertSelective(SysRolePrivilege record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    List<SysRolePrivilege> selectByExample(SysRolePrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysRolePrivilege record, @Param("example") SysRolePrivilegeExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExample(@Param("record") SysRolePrivilege record, @Param("example") SysRolePrivilegeExample example);
}