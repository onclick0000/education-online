package com.jk.mapper;

import com.jk.pojo.ysx.UserBean;
import org.apache.ibatis.annotations.Select;


public interface YsxMapper {
    @Select("select * from userLogin where username=#{value}")
    UserBean userLogin(String username);
}
