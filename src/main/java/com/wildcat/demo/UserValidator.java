package com.wildcat.demo;

import com.wildcat.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by lixingle on 2017/6/9.
 */
public class UserValidator implements Validator {

    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors) {
        User user = (User) o;
        System.out.println("检验name:"+user.getName());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","required.name","Field name is required");
    }
}
