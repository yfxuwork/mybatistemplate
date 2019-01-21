package cn.learnmybatis.chapter6.mapper;

import cn.learnmybatis.chapter6.model.SysRole;
import cn.learnmybatis.chapter6.model.SysUser;
import cn.learnmybatis.chapter6.model.SysUserExample;
import cn.learnmybatis.chapter6.model.SysUserWithBLOBs;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper {
    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    long countByExample(SysUserExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int deleteByExample(SysUserExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insert(SysUserWithBLOBs record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insertSelective(SysUserWithBLOBs record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    List<SysUserWithBLOBs> selectByExampleWithBLOBs(SysUserExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    SysUserWithBLOBs selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysUserWithBLOBs record, @Param("example") SysUserExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") SysUserWithBLOBs record, @Param("example") SysUserExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKeySelective(SysUserWithBLOBs record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(SysUserWithBLOBs record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKey(SysUser record);

    SysUser selectById(Long id);

    List<SysUser> selectAll();

    List<SysRole> selectRolesByUserId(Long userId);

    List<SysRole> selectRolesByUserId2(Long userId);

    int myInsert(SysUser sysUser);

    int myInsert2(SysUser sysUser);

    int myInsert3(SysUser sysUser);

    int updateById(SysUser sysUser);

    int deleteById(Long id);

    List<SysRole> selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId,@Param("enabled") Integer enabled);

    List<SysRole> selectRolesByUserAndRole(@Param("user")SysUser user,@Param("role")SysRole role);

    SysUser selectUserAndRoleByid(Long id);

    SysUser selectUserAndRoleById2(Long id);

    SysUser selectUserAndRoleById3(Long id);

    SysUser selectUserAndRoleByIdSelect(Long id);

    List<SysUser> selectAllUserAndRoles();

    List<SysUser> selectAllUserAndRoles2();

    SysUser selectAllUserAndRolesSelect(Long id);

    void selectUserById(SysUser user);

    List<SysUser> selectUserPage(Map<String,Object> params);

    int insertUserAndRoles(@Param("user")SysUser user,@Param("roleIds")String roleIds);

    int deleteUserById(Long id);

}