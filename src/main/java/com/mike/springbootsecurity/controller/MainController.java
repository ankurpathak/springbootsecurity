package com.mike.springbootsecurity.controller;

import com.mike.springbootsecurity.entity.Checkers;
import com.mike.springbootsecurity.respository.CheckersRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author Mike
 * @Date 2019/1/14
 * @Version 1.0
 */
@Controller
public class MainController {

    @Resource
    private CheckersRespository checkersRespository;

    @RequestMapping("/")
    public String welcomePage() {
        return "redirect:main";
    }


    @RequestMapping("/login")
    public String login() {
        return "login";
    }


    @RequestMapping("/main")
    public String mainPage(Model model) {
        model.addAttribute("welcome", "hello！");
        return "a";
    }


    @RequestMapping("/test")
    @ResponseBody
    public Checkers testMethod(String name) {
        return checkersRespository.getChecker(name);
    }


}
