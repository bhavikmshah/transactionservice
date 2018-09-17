package com.ubank.vab.transactionservice.controller;

import com.ubank.vab.transactionservice.model.Transaction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bhavi on 9/17/2018.
 */

@RestController
public class TransactionController {

    @RequestMapping(path = "/transactions",method = RequestMethod.GET ,produces = "application/json")
    public Transaction getTransactions(){
        Transaction transaction =  new Transaction();
        transaction.setTransactionId("123456");
        transaction.setTransactionType("CREDIT");
        return transaction;
    }
}
