package cn.learn.mybatis.service.impl;

import cn.learn.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

/**
 * Created by Administrator on 2018/11/9 0009.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public SysUser findById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<SysUser> findAll() {
        return userMapper.selectAll();
    }
}
