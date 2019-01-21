package cn.learnmybatis.chapter3.mapper;

import cn.learnmybatis.chapter3.model.SysUser;

import java.util.List;

/**
 * Created by Administrator on 2018/9/22 0022.
 */
public interface CountryMapper {
    List<SysUser> selectAll();
}
