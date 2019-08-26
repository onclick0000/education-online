package com.jk.service;

import com.jk.mapper.YsxMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YsxServiceImpl implements YsxService {
    @Autowired
    private YsxMapper ysxMapper;
}
