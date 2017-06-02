package com.wildcat.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lixingle on 2017/5/23.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/test.do",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String printHello(ModelMap model){
            model.addAttribute("message","Hello Spring MVC Framework!");
            return "hello";
    }

}
