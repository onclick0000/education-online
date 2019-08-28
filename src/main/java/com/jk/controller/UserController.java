package com.jk.controller;

import com.jk.pojo.ysx.UserBean;
import com.jk.service.YsxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;


@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private YsxService ysxService;
    @RequestMapping("userLogin")
    @ResponseBody
    public HashMap<String,Object> userLogin(UserBean userBean, HttpSession session){
        return  ysxService.userLogin(userBean,session);
    }
   @RequestMapping("exit")
    public String exit(HttpSession session){
        session.removeAttribute(session.getId());
        return "login";
   }
}
