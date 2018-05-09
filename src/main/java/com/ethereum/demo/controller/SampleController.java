package com.ethereum.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangbin on 2018/5/9.
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
