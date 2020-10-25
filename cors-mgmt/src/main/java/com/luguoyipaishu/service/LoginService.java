package com.luguoyipaishu.service;

import com.luguoyipaishu.domain.User;

/**
 * @author 路过一排树
 * @date 2020/10/25 18:28
 */
public interface LoginService {

    String login(User user);

    String logout(User user);
}
