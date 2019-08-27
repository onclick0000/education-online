package com.jk.mapper;

import com.jk.pojo.yzf.OrderBean;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface YzfMapper {


    int findCount(HashMap<String, Object> params);

    List<OrderBean> findListAll(@Param("page") int i,@Param("rows") Integer rows,@Param("orderBean") OrderBean orderBean);
}
