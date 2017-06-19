package com.wildcat.demo;

import com.wildcat.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lixingle on 2017/6/2.
 */


@Controller
public class StudentController {
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student(){
        Student student = new Student();
        student.setFavoriteFrameworks(new String[] {"Spring MVC", "Struts 2"});

        return new ModelAndView("student","command",student);
    }
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(Student student, ModelMap model){
        model.addAttribute("name",student.getName());
        model.addAttribute("age",student.getAge());
        model.addAttribute("id",student.getId());
        model.addAttribute("password",student.getPassword());
        model.addAttribute("favoriteFrameworks",student.getFavoriteFrameworks());
        model.addAttribute("country",student.getCountry());
        return "result";
    }
    @ModelAttribute("webFrameworkList")
    public List <String> getWebFrameworkList(){
        List <String> list = new ArrayList<String>();
        list.add("Spring MVC");
        list.add("Spring Boot");
        list.add("Struts 2");
        list.add("Apatch Hadoop");
        return list;
    }
    @ModelAttribute("countryList")
    public Map<String,String> countryList(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("CH","China");
        map.put("US","United States");
        map.put("SG","Singapore");
        map.put("MY","Malaysia");
        return map;
    }

}
