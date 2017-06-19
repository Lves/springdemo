package com.wildcat.demo;

import com.wildcat.model.FileModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import java.io.File;
import java.io.IOException;

/**
 * Created by lixingle on 2017/6/14.
 */

@Controller
public class FileUploadController {
    ServletContext context;

    @RequestMapping(value = "/fileUploadPage",method = RequestMethod.GET)
    public ModelAndView fileUploadPage(){
        FileModel fileModel = new FileModel();
        ModelAndView modelAndView = new ModelAndView("fileUpload","command",fileModel);
        return modelAndView;
    }

    @RequestMapping(value = "/fileUploadPage", method = RequestMethod.POST)
    public String fileUpload(MultipartFile uploadFile, HttpSession session,ModelMap modelMap) throws IOException{
        String fileName = uploadFile.getOriginalFilename();

        String leftPath = session.getServletContext().getRealPath("/images");
        File file = new File(leftPath,fileName);
        uploadFile.transferTo(file);
        modelMap.addAttribute("fileName","123");
        return "success";
    }



}
