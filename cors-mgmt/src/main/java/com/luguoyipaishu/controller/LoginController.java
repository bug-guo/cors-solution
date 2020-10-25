package com.luguoyipaishu.controller;

import com.luguoyipaishu.domain.User;
import com.luguoyipaishu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 路过一排树
 * @date 2020/10/25 18:23
 */
@RequestMapping("login")
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping()
    @ResponseBody
    public String login(@RequestBody User user) {
        return loginService.login(user);
    }

}
