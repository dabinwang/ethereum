package com.blockchain.ethereum.mainframe;

import com.blockchain.ethereum.Transaction;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangbin on 2018/5/10.
 */
public class Transfer implements Comparable,Serializable{

    private String address;
    private String totalValues;
    private List<Transaction> transactions;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotalValues() {
        return totalValues;
    }

    public void setTotalValues(String totalValues) {
        this.totalValues = totalValues;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "address='" + address + '\'' +
                ", totalValues=" + totalValues +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}















