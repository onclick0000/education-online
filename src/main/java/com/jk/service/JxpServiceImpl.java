package com.jk.service;

import com.jk.mapper.JxpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JxpServiceImpl implements JxpService {

    @Autowired
    private JxpMapper jxpMapper;
}
