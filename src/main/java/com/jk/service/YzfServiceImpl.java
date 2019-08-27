package com.jk.service;

import com.jk.mapper.YzfMapper;
import com.jk.pojo.yzf.OrderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class YzfServiceImpl implements YzfService {
    @Autowired
    private YzfMapper yzfMapper;

    @Override
    public HashMap<String, Object> findOrderListAll(Integer page, Integer rows, OrderBean orderBean) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("orderBean",orderBean);
        int count =  yzfMapper.findCount(params);
        List<OrderBean> list = yzfMapper.findListAll((page-1)*rows,rows,orderBean);
        params.put("total",count);
        params.put("rows",list);
        return params;
    }
}
