package com.spr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
public class HelloController {

    @RequestMapping("/test")
    public String Display(){
        return "Hello";
    }

}
