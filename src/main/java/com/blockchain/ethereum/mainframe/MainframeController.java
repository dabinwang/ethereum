package com.blockchain.ethereum.mainframe;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.blockchain.ethereum.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by wangbin on 2018/5/9.
 */
@Controller()
@RequestMapping("/ethereum/mainframe")
public class MainframeController {

    @Autowired
    MainframeService service;


    @GetMapping("/index")
    public String index(){
        return "ethereum/mainframe/index";
    }


    @GetMapping("/top600")
    @ResponseBody
    public List<Transfer> collectTop600(Model model){
        return service.collectTop600(model);
    }






}



















