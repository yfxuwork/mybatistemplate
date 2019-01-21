package cn.learnmybatis.chapter7.mapper;

import cn.learnmybatis.chapter7.model.SysPrivilege;
import cn.learnmybatis.chapter7.provider.PrivilegeProvider;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * Created by Administrator on 2018/9/27 0027.
 */

public interface PrivilegeMapper {

    @SelectProvider(type = PrivilegeProvider.class,method = "selectById")
    SysPrivilege selectById(Long id);

}
