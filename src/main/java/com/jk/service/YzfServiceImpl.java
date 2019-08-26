package com.jk.service;

import com.jk.mapper.YzfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YzfServiceImpl implements YzfService {
    @Autowired
    private YzfMapper yzfMapper;
}
