package com.blockchain.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangbin on 2018/5/9.
 */
@Controller
public class SampleController {

    @RequestMapping("/index")
    public String home() {
        System.out.println("1111");
        return "index";
    }

}
