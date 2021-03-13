package com.upc.demo.controller;

import com.upc.demo.bean.User;
import com.upc.demo.mapper.UserMapper;
import com.upc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;


    @RequestMapping("/login1")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password, @RequestParam("position") int position,
                        Model model, HttpSession session) {
        System.out.println("身份是：" + position);
        if (userService.login(username, password, position)) {
            session.setAttribute("user", username);
            session.setAttribute("pos", position);
            return "redirect:main.html";
        } else {

            model.addAttribute("msg", "用户名或密码错误！");
            return "login";
        }

    }

    @RequestMapping("/register1")
    public String register1(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        if (username != null && password != null && userService.register(username, password) == 1) {
            model.addAttribute("msg1", "注册成功");
            System.out.println("注册成功");
            return "register";
        } else {
            model.addAttribute("msg1", "用户名已存在！");
            System.out.println("注册失败");
            return "register";
        }
    }

    @RequestMapping("/user/logout")
    public String userlogout(HttpSession session) {
        session.invalidate();
        return "redirect:/login.html";

    }


}
