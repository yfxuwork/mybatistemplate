package cn.learn.mybatis.controller;

import cn.learn.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.simple.model.SysUser;

import java.util.List;

/**
 * Created by Administrator on 2018/11/9 0009.
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("users/{id}")
    SysUser user(@PathVariable("id")Long id){
        return userService.findById(id);
    }

    @RequestMapping("users")
    List<SysUser> users(){
        return userService.findAll();
    }

}
