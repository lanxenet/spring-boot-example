package org.inspireso.springboot.web.api;

import java.util.HashMap;
import java.util.Map;

import org.inspireso.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lanxe on 2017/3/28.
 */
@RestController
@ControllerAdvice(basePackageClasses = ExceptionController.class)
public class ExceptionController {

    @Autowired
    private UserService userService;

    @ExceptionHandler(Exception.class)
    public Map<String,String> errorHandler(Exception error){
        Map<String,String> map = new HashMap<>();
        map.put("message", error.getMessage());
        map.put("code", "500");
        return map;

    }
}
