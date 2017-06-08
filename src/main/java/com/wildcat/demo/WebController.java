package com.wildcat.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lixingle on 2017/6/5.
 */



@Controller
public class WebController {
    //静态页面
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public  String staticPage(){
        return "redirect:/pages/final.html";
    }
    // 重定向
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirect(){
        return "redirect:finalPage";
    }
    @RequestMapping(value = "/finalPage", method = RequestMethod.GET)
    public String finalPage(){
        return "redirect-final";
    }


}
