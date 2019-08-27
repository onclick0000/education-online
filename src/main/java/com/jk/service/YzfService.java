package com.jk.service;

import com.jk.pojo.yzf.OrderBean;

import java.util.HashMap;

public interface YzfService {
    HashMap<String, Object> findOrderListAll(Integer page, Integer rows, OrderBean orderBean);
}
