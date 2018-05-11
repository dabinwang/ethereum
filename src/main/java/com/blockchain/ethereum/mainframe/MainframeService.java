package com.blockchain.ethereum.mainframe;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.blockchain.ethereum.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by wangbin on 2018/5/11.
 */
@Service
public class MainframeService {


    @Autowired
    private RestTemplate restTemplate;

    //获取所有的转账信息
    private List<Transaction> getAllTransactions(){

        String trastr = this.restTemplate.getForObject( MainframeConst.APIURL , String.class);

        JSONObject jsonObject = JSON.parseObject(trastr);
        String str = jsonObject.getString("result");

        List<Transaction> list = JSON.parseArray( str , Transaction.class);

        return list;
    }


    //获取前所有转账并进行排名
    public List<Transfer> collectTop600(Model model){

        Integer lotteryNum = 0;

        List<Transaction> allTransactions = this.getAllTransactions();
        System.out.println(allTransactions);


        List<Transaction> clearTransactions = new ArrayList<>();

        Map<String , List<Transaction>> transactionMap = new HashMap<>();

        List<Transfer> transfers = new ArrayList<>();


        for( Transaction currentTransaction : allTransactions) {

            //去掉不是进入、或者失败的转账
            if (currentTransaction.getIsError() != 0
                    || !currentTransaction.getTo().equals(MainframeConst.ADDRESS)
                    || MainframeConst.usedAddress.contains(currentTransaction.getFrom())) {
            } else {
                clearTransactions.add(currentTransaction);
            }
        }

        for( Transaction currentTransaction : clearTransactions){

            //如果发送方地址在map中不存在就加入一组键值
            //如果存在就把当前 currentTransaction 存入对应的 可以中
            if( transactionMap.get(currentTransaction.getFrom()) == null){
                List<Transaction> fromTransactionList = new ArrayList<>();
                fromTransactionList.add(currentTransaction);
                transactionMap.put(currentTransaction.getFrom() , fromTransactionList);
            }else{
                List<Transaction> fromTransactionList = transactionMap.get(currentTransaction.getFrom());
                fromTransactionList.add(currentTransaction);
            }
            //到这里 transactionMap 中存放的是一个地址对应的多个transaction;
        }

        //把transactionMap种每一个键值对转换成一个transfer
        for( String address : transactionMap.keySet()){
            BigDecimal totalValues = new BigDecimal(0);
            for( Transaction currentTransaction : transactionMap.get(address)){
                totalValues = totalValues.add(new BigDecimal(currentTransaction.getValue()));
            }
            Double totalValuesDouble = totalValues.divide(new BigDecimal("1000000000000000000") , 5 , BigDecimal.ROUND_HALF_UP).doubleValue();

            Transfer transfer = new Transfer();
            transfer.setAddress(address);
            transfer.setTotalValues(totalValuesDouble.toString());
            transfer.setTransactions(transactionMap.get(address));

            transfers.add(transfer);
        }
        //在这里每个地址转入的信息都已变成一个transfers


        //对transfers用totalValues进行排序

        Collections.sort(transfers, new Comparator<Transfer>(){
            public int compare(Transfer transfer1, Transfer transfer2) {
                //按照totalValues进行升序排列
                if( Double.valueOf(transfer1.getTotalValues()) < Double.valueOf(transfer2.getTotalValues())){
                    return 1;
                }
                if( Double.valueOf(transfer1.getTotalValues()) == Double.valueOf(transfer2.getTotalValues())){
                    return 0;
                }
                return -1;
            }
        });

        System.out.println(clearTransactions.size());
        //已排完序的
        return transfers;
    }
}
