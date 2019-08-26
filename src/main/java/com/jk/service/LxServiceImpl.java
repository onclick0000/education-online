package com.jk.service;

import com.jk.mapper.LxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LxServiceImpl implements LxService {

    @Autowired
    private LxMapper lxMapper;


}
