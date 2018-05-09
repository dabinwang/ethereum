package com.ethereum.mainframe;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ethereum.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by wangbin on 2018/5/9.
 */
@RestController()
public class MainframeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
        String tras = this.restTemplate.getForObject("http://api.etherscan.io/api?module=account&action=txlist&address=0x34c5bf6ce9fecbd10bcfafdf60c61ed27533473b&startblock=0&endblock=99999999&sort=asc&apikey=IX3G48RX62MDDSJ1KG7NNSDBTI7A8144HG"
                , String.class);

        JSONObject jsonObject = JSON.parseObject(tras);
        String str = jsonObject.getString("result");
        System.out.println(str);
        List<Transaction> list = JSON.parseArray( str , Transaction.class);
        System.out.println(list.size());
        return list.toString();
    }
}
