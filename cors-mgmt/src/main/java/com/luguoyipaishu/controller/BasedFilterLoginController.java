package com.luguoyipaishu.controller;

import com.luguoyipaishu.domain.User;
import com.luguoyipaishu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 路过一排树
 * @date 2020/10/29 22:19
 */
@RestController
@RequestMapping("filter/login")
public class BasedFilterLoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping()
    @ResponseBody
    public String login(@RequestBody User user) {
        return loginService.login(user);
    }
}
