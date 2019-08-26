package com.jk.controller;

import com.jk.service.YzfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class YzfController {

    @Autowired
    private YzfService yzfService;
}
