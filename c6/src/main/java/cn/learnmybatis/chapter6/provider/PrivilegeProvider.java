package cn.learnmybatis.chapter6.provider;

/**
 * Created by Administrator on 2018/9/27 0027.
 */
public class PrivilegeProvider {

    public PrivilegeProvider(){
    }

    public String selectById(final Long id){
//        return new SQL(){
//            SELECT("id,privilege_name,privilege_url");
//            FROM("sys_privilege");
//            WHERE("id = #{id}");
//        }.toString();

        return "select id,privilege_name,privilege_url from sys_privilege where id = #{id}";
    }

}
