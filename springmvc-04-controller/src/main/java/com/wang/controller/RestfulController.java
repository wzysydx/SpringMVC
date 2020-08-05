package com.wang.controller;

import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {

    //原来的http:localhost:8080/add?a=1&b=2
    @RequestMapping("/add")
    public String test1(int a,int b, Model model){
        int res = a+b;
        model.addAttribute("msg", "结果为："+res);
        return "test";
    }
    //Rertful:localhost:8080/add?a/b
    @RequestMapping("/add2/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg", "结果为："+res);
        return "test";
    }
    //@RequestMapping(name = "/add3/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/add3/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;
        model.addAttribute("msg", "结果为："+res);
        return "test";
    }


}
