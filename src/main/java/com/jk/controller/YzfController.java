package com.jk.controller;

import com.jk.pojo.yzf.OrderBean;
import com.jk.service.YzfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("order")
public class YzfController {

    @Autowired
    private YzfService yzfService;

    public HashMap<String,Object> findOrderListAll(Integer page, Integer rows, OrderBean orderBean){

        return yzfService.findOrderListAll(page,rows,orderBean);
    }




}
