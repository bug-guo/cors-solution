package com.luguoyipaishu.service.impl;

import com.luguoyipaishu.domain.User;
import com.luguoyipaishu.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * @author 路过一排树
 * @date 2020/10/25 18:28
 */
@Service
public class LoginServiceImpl implements LoginService {

    public String login(User user) {
        if (user.getPassword().equals("123")) {
            return String.format("%s login success!", user.getName());
        }
        return null;
    }

    public String logout(User user) {
       return String.format("%s logout!", user.getName());
    }
}
