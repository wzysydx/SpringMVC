package com.wang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 代表这个类会被spring接管，如果返回值是string，并且有具体界面可以跳转，就会被视图解析器解析
@RequestMapping("/c3")
public class ControllerTest3 {

    @RequestMapping("/t1")
    public String test1(Model model){
        model.addAttribute("msg", "test3");
        return "test";
    }


}
