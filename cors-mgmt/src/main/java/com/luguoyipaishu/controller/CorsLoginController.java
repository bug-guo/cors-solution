package com.luguoyipaishu.controller;

import com.luguoyipaishu.domain.User;
import com.luguoyipaishu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 路过一排树
 * @date 2020/10/25 18:23
 */
@CrossOrigin(allowCredentials = "true")     // 该注解使用在类上，则对该类中的所有方法有效。 也可是使用在方法上，即仅对方法有效
@RequestMapping("cors/login")
@Controller
public class CorsLoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping()
    @ResponseBody
    public String login(@RequestBody User user) {
        return loginService.login(user);
    }

}
