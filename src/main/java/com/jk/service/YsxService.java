package com.jk.service;

import com.jk.pojo.ysx.UserBean;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

public interface YsxService {
    HashMap<String, Object> userLogin(UserBean userBean, HttpSession session);
}
