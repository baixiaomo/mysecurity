package com.wf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by feiwei on 2017/8/7.
 */
@Controller
public class SecurityController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
