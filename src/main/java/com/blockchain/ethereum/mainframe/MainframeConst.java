package com.blockchain.ethereum.mainframe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangbin on 2018/5/11.
 */
public class MainframeConst {

    public static final String ADDRESS="0x34c5bf6ce9fecbd10bcfafdf60c61ed27533473b";
    public static final String APIURL = "http://api.etherscan.io/api?module=account&action=txlist&address=0x34c5bf6ce9fecbd10bcfafdf60c61ed27533473b&startblock=0&endblock=99999999&sort=asc&apikey=IX3G48RX62MDDSJ1KG7NNSDBTI7A8144HG";

    public static final List<String> usedAddress = new ArrayList<>();

    static {
        //"phase1"
        /*usedAddress.add("0xb62e27446079c2f2575c79274cd905bf1e1e4edb");
        usedAddress.add("0x37d8adc5cd9b00a3d8c62f8c30d26b9c2af3095a");
        usedAddress.add("0x7b520108853ba01f208bfdf26148f06fa070d133");
        usedAddress.add("0x3f198be39aa90e9984d27097a55f4f0bbaa67b10");
        usedAddress.add("0xc85e840a1086afb4cd9719d79e58b5da2e3250bc");*/
    }
}
