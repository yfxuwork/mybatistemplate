package cn.learnmybatis.chapter3.mapper;

import cn.learnmybatis.chapter3.model.SysRole;
import cn.learnmybatis.chapter3.model.SysRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface SysRoleMapper {

    @Select({"select id,role_name,enabled,create_by,create_time ",
    "from sys_role ",
    "where id=#{id}"})
    SysRole selectById(Long id);


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
    SysRole selectById2(Long id);


    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole> selectAll();


    @Insert({"insert into sys_role (id, role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{id,jdbcType=BIGINT}, #{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    int myInsert(SysRole sysRole);


    //返回自增主键
    @Insert({"insert into sys_role (role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int myInsert2(SysRole sysRole);


    //返回非自增主键
    @Insert({"insert into sys_role (role_name, enabled, " ,
            "      create_by, create_time)" ,
            "    values (#{role_name,jdbcType=VARCHAR}, #{enabled,jdbcType=INTEGER}, " ,
            "      #{create_by,jdbcType=BIGINT}, #{create_time,jdbcType=TIMESTAMP})"})
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "id",
            resultType = Long.class,before = false)
    int myInsert3(SysRole sysRole);


    @Update({"update sys_role",
            "    set role_name = #{role_name,jdbcType=VARCHAR},",
            "      enabled = #{enabled,jdbcType=INTEGER},",
            "      create_by = #{create_by,jdbcType=BIGINT},",
            "      create_time = #{create_time,jdbcType=TIMESTAMP}",
            "    where id = #{id,jdbcType=BIGINT}"})
    int updateById(SysRole sysRole);


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
    int insert(SysRole record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int insertSelective(SysRole record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    List<SysRole> selectByExample(SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    SysRole selectByPrimaryKey(Long id);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     *
     * @mbg.generated Thu Sep 20 15:45:42 CST 2018
     */
    int updateByPrimaryKey(SysRole record);
}