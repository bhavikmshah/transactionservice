package com.ubank.vab.transactionservice.model;

/**
 * Created by bhavi on 9/17/2018.
 */
public class Transaction {

    private String transactionId;
    private String transactionType;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
