package com.wang.controller;


import com.wang.pojo.User;
import org.junit.runners.Parameterized;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    //localhost：8080/user/t1?name=xxx
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model, HttpSession session){
        //1接收前端参数

        System.out.println("接收到前端的参数为："+name);
        //2将返回的结果传递给前端
        model.addAttribute("msg", name);
        return "test";
    }

    //前端接受的是一个对象： id，name，age
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }

    @GetMapping("/t3")
    public String test3(Model model){


        return "test";
    }
}
