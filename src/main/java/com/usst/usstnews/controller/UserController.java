package com.usst.usstnews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: Adminstrator
 * @date: 2018/3/27 23:57
 * @version: 1.0.0
 * @comment: 用户控制器
 */

@Controller
public class UserController {

    @GetMapping(value = "/index")
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("/admin/index");
        mv.addObject("title","欢迎使用Thymeleaf");
        return mv;
    }
}
