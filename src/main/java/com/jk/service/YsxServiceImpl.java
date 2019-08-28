package com.jk.service;

import com.jk.mapper.YsxMapper;
import com.jk.pojo.ysx.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Service
public class YsxServiceImpl implements YsxService {
    @Autowired
    private YsxMapper ysxMapper;

    @Override
    public HashMap<String, Object> userLogin(UserBean userBean, HttpSession session) {
        HashMap<String, Object> params = new HashMap<>();
        UserBean userInfo =ysxMapper.userLogin(userBean.getUsername());
        if (userInfo==null){
            params.put("code",1);
            params.put("msg","User name error");
            return params;
        }
        if (userInfo!=null&&!userInfo.getPassword().equals(userBean.getPassword())){
            params.put("code",2);
            params.put("msg","Password error");
            return params;
        }
        session.setAttribute(session.getId(),userInfo);
        params.put("code",0);
        params.put("msg","Welcome "+userInfo.getUsername()+" users to login");

        return params;
    }
}
