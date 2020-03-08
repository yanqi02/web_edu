package com.upc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (!StringUtils.isEmpty(username) && "111".equals(password)) {
            return "redirect:index.html";
        }
        else {

            model.addAttribute("msg", "用户名或密码错误！");
            return "login.html";
        }

    }
}
