package cn.learnmybatis.chapter4.mapper;

import cn.learnmybatis.chapter4.model.SysPrivilege;
import cn.learnmybatis.chapter4.provider.PrivilegeProvider;
import org.apache.ibatis.annotations.SelectProvider;

/**
 * Created by Administrator on 2018/9/27 0027.
 */

public interface PrivilegeMapper {

    @SelectProvider(type = PrivilegeProvider.class,method = "selectById")
    SysPrivilege selectById(Long id);

}
