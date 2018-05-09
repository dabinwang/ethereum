package com.ethereum;

import java.io.Serializable;

/**
 * Created by wangbin on 2018/5/9.
 */
public class Transaction implements Serializable{
          /* {"blockNumber":"5545577",
            "timeStamp":"1525296338",
            "hash":"0x2a2e45b26d24f89eeab8f45bd2f013e93ca7421ac39d9323e0ff1898062eb34c",
            "nonce":"7",
            "blockHash":"0xb778927501cf08ccbd8c786208b3635d4180e35165557e2f90dd203c41f273cc",
            "transactionIndex":"20",
            "from":"0x504b206c3b2b2331146b2e831c73f29deaa81709",
            "to":"0x34c5bf6ce9fecbd10bcfafdf60c61ed27533473b",
            "value":"170000000000000000",
            "gas":"21000",
            "gasPrice":"45000000000",
            "isError":"0",
            "txreceipt_status":"1",
            "input":"0x",
            "contractAddress":"",
            "cumulativeGasUsed":"1045264",
            "gasUsed":"21000",
            "confirmations":"37947"}*/

    private String blockNumber;
    private String timeStamp;
    private String hash;
    private String blockHash;
    private String transactionIndex;
    private String from;
    private String to;
    private String value;
    private String gas;
    private String gasPrice;
    private String isError;
    private String txreceipt_status;
    private String input;
    private String contractAddress;
    private String cumulativeGasUsed;
    private String gasUsed;
    private String confirmations;


    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public String getTransactionIndex() {
        return transactionIndex;
    }

    public void setTransactionIndex(String transactionIndex) {
        this.transactionIndex = transactionIndex;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getIsError() {
        return isError;
    }

    public void setIsError(String isError) {
        this.isError = isError;
    }

    public String getTxreceipt_status() {
        return txreceipt_status;
    }

    public void setTxreceipt_status(String txreceipt_status) {
        this.txreceipt_status = txreceipt_status;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getCumulativeGasUsed() {
        return cumulativeGasUsed;
    }

    public void setCumulativeGasUsed(String cumulativeGasUsed) {
        this.cumulativeGasUsed = cumulativeGasUsed;
    }

    public String getGasUsed() {
        return gasUsed;
    }

    public void setGasUsed(String gasUsed) {
        this.gasUsed = gasUsed;
    }

    public String getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(String confirmations) {
        this.confirmations = confirmations;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "blockNumber='" + blockNumber + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", hash='" + hash + '\'' +
                ", blockHash='" + blockHash + '\'' +
                ", transactionIndex='" + transactionIndex + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", value='" + value + '\'' +
                ", gas='" + gas + '\'' +
                ", gasPrice='" + gasPrice + '\'' +
                ", isError='" + isError + '\'' +
                ", txreceipt_status='" + txreceipt_status + '\'' +
                ", input='" + input + '\'' +
                ", contractAddress='" + contractAddress + '\'' +
                ", cumulativeGasUsed='" + cumulativeGasUsed + '\'' +
                ", gasUsed='" + gasUsed + '\'' +
                ", confirmations='" + confirmations + '\'' +
                '}';
    }
}
