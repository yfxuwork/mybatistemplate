package cn.learnmybatis.chapter9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by Administrator on 2018/11/8 0008.
 */

@Controller
public class IndexController {

    @RequestMapping(value = {"","/index"})
    public ModelAndView dicts(){
        ModelAndView mv=new ModelAndView("index");
        mv.addObject("now",new Date());
        return mv;
    }

}
