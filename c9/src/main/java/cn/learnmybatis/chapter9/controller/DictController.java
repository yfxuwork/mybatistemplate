package cn.learnmybatis.chapter9.controller;

import cn.learnmybatis.chapter9.model.Dict;
import cn.learnmybatis.chapter9.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2018/11/9 0009.
 */

@Controller
@RequestMapping("/dicts")
public class DictController {

    @Autowired
    private DictService dictService;

    @RequestMapping
    public ModelAndView dicts(Dict dict,Integer offset,Integer limit){
        ModelAndView mv=new ModelAndView("dicts");
        List<Dict> dicts=dictService.findBySysDict(dict,offset,limit);
        mv.addObject("dicts",dicts);
        return mv;
    }

    @RequestMapping(value = "add",method = RequestMethod.GET)
    public ModelAndView add(Long id){
        ModelAndView mv=new ModelAndView("dict_add");
        Dict dict;
        if (id == null){
            dict=new Dict();
        }else {
            dict=dictService.findById(id);
        }
        mv.addObject("model",dict);
        return mv;
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public ModelAndView save(Dict dict){
        ModelAndView mv=new ModelAndView();
        try {
            dictService.saveOrUpdate(dict);
            mv.setViewName("redirect:/dicts");
        }catch (Exception e){
            mv.setViewName("dict_add");
            mv.addObject("msg",e.getMessage());
            mv.addObject("model",dict);
        }
        return mv;
    }

    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public ModelMap delete(@RequestParam Long id){
        ModelMap modelMap=new ModelMap();
        try {
            boolean success=dictService.deleteById(id);
            modelMap.put("success",success);
        }catch (Exception e){
            modelMap.put("success",false);
            modelMap.put("msg",e.getMessage());
        }
        return modelMap;
    }
}
