package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
    @RequestMapping("content")
    public String content(){
        return "content";
    }
    @RequestMapping("toset")
    public String toset(){
        return "set";
    }
    @RequestMapping("tosysset")
    public String tosysset(){
        return "sysset";
    }
}
