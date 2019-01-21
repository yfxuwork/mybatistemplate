package cn.learnmybatis.chapter6.mapper;

import cn.learnmybatis.chapter6.model.SysRole4;
import cn.learnmybatis.chapter6.model.SysRoleExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SysRoleMapper3 {

    @Select({"select id,role_name,enabled enabled2,create_by,create_time ",
    "from sys_role ",
    "where id=#{id}"})
    SysRole4 selectById(Long id);


    @Results(id = "roleResultMap",value={
            @Result(property = "id",column = "id",id = true),
            @Result(property = "role_name",column = "role_name"),
            @Result(property = "enabled",column = "enabled"),
            @Result(property = "create_by",column = "create_by"),
            @Result(property = "create_time",column = "create_time")
    })
    @Select({"select id,role_name,enabled,create_by,create_time ",
            "from sys_role ",
            "where id=#{id}"})
    SysRole4 selectById2(Long id);


    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole4> selectAll();


    @Insert({"insert into sys_role (id, role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{id,jdbcType=BIGINT}, #{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    int myInsert(SysRole4 sysRole);


    //返回自增主键
    @Insert({"insert into sys_role (role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int myInsert2(SysRole4 sysRole);


    //返回非自增主键
    @Insert({"insert into sys_role (role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "id",
            resultType = Long.class,before = false)
    int myInsert3(SysRole4 sysRole);


    @Update({"update sys_role",
            "    set role_name = #{role_name,jdbcType=VARCHAR},",
            "      enabled = #{enabled2},",
            "      create_by = #{create_by,jdbcType=BIGINT},",
            "      create_time = #{create_time,jdbcType=TIMESTAMP}",
            "    where id = #{id,jdbcType=BIGINT}"})
    int updateById(SysRole4 sysRole);


    @Delete("delete from sys_role where id = #{id,jdbcType=BIGINT}")
    int deleteById(Long id);



    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    long countByExample(SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int deleteByExample(SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insert(SysRole4 record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insertSelective(SysRole4 record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    List<SysRole4> selectByExample(SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    SysRole4 selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysRole4 record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExample(@Param("record") SysRole4 record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKeySelective(SysRole4 record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKey(SysRole4 record);

    SysRole4 selectRoleById(Long id);

    List<SysRole4> selectAllRoleAndPrivileges();

    List<SysRole4> selectAllRoleAndPrivileges2();

    List<SysRole4> selectRoleByUserIdChoose(Long userId);

}