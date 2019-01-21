package cn.learnmybatis.chapter6.mapper;

import cn.learnmybatis.chapter6.model.SysRole3;
import cn.learnmybatis.chapter6.model.SysRoleExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SysRoleMapper2 {

    @Select({"select id,role_name,enabled,create_by,create_time ",
    "from sys_role ",
    "where id=#{id}"})
    SysRole3 selectById(Long id);


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
    SysRole3 selectById2(Long id);


    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole3> selectAll();


    @Insert({"insert into sys_role (id, role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{id,jdbcType=BIGINT}, #{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    int myInsert(SysRole3 sysRole);


    //返回自增主键
    @Insert({"insert into sys_role (role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int myInsert2(SysRole3 sysRole);


    //返回非自增主键
    @Insert({"insert into sys_role (role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "id",
            resultType = Long.class,before = false)
    int myInsert3(SysRole3 sysRole);


    @Update({"update sys_role",
            "    set role_name = #{role_name,jdbcType=VARCHAR},",
            "      enabled = #{enabled,jdbcType=INTEGER},",
            "      create_by = #{create_by,jdbcType=BIGINT},",
            "      create_time = #{create_time,jdbcType=TIMESTAMP}",
            "    where id = #{id,jdbcType=BIGINT}"})
    int updateById(SysRole3 sysRole);


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
    int insert(SysRole3 record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insertSelective(SysRole3 record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    List<SysRole3> selectByExample(SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    SysRole3 selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysRole3 record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExample(@Param("record") SysRole3 record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKeySelective(SysRole3 record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKey(SysRole3 record);

    SysRole3 selectRoleById(Long id);

    List<SysRole3> selectAllRoleAndPrivileges();

    List<SysRole3> selectAllRoleAndPrivileges2();

    List<SysRole3> selectRoleByUserIdChoose(Long userId);

}