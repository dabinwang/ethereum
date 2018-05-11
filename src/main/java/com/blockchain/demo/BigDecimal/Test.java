package com.blockchain.demo.BigDecimal;

import java.math.BigDecimal;

/**
 * Created by wangbin on 2018/5/10.
 */
public class Test {



    public static void main(String[] args) {
        String s1 = "170000000000000000";
        String s2 = "1000000000000000000";

        BigDecimal b1 = new BigDecimal(s1);
        BigDecimal b2 = new BigDecimal(s2);

        Double d = b1.divide(b2 , 5 , BigDecimal.ROUND_HALF_UP).doubleValue();

        System.out.println(d);
    }
}





















