package cn.learn.mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/9 0009.
 */

@RestController
public class IndexController {

    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

}
