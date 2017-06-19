package com.wildcat.demo;

import com.wildcat.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lixingle on 2017/6/9.
 */


@Controller
public class UserController {

    @Autowired
    @Qualifier("userValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder){
        binder.setValidator(validator);
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    public ModelAndView user(){
        return new ModelAndView("user","command",new User());
    }
    @ModelAttribute("user")
    public User createUser(){
        return new User();
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser( @Validated User user, BindingResult bindingResult , Model model){
        if (bindingResult.hasErrors()){
            return "addUser";
        }

        model.addAttribute("name",user.getName());
        model.addAttribute("age",user.getAge());
        model.addAttribute("id",user.getId());
        return "user-result";

    }


}
