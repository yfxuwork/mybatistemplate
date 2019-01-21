package cn.learn.mybatis.service;

import tk.mybatis.simple.model.SysUser;

import java.util.List;

/**
 * Created by Administrator on 2018/11/9 0009.
 */
public interface UserService {

    SysUser findById(Long id);

    List<SysUser> findAll();

}
