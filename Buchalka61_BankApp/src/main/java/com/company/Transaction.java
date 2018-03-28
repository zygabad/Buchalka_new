package com.company;

import java.util.ArrayList;

public class Transaction {
    private long transactionId;
    private String accountReceiver;
    private String accountSender;
    private String moneySender;
    private String moneyReceiver;
    private double transactionAmount;

    public Transaction(long transactionId, String accountReceiver, String accountSender, String moneySender, String moneyReceiver, double transactionAmount) {
        this.transactionId = transactionId;
        this.accountReceiver = accountReceiver;
        this.accountSender = accountSender;
        this.moneySender = moneySender;
        this.moneyReceiver = moneyReceiver;
        this.transactionAmount = transactionAmount;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public String getAccountReceiver() {
        return accountReceiver;
    }

    public String getAccountSender() {
        return accountSender;
    }

    public String getMoneySender() {
        return moneySender;
    }

    public String getMoneyReceiver() {
        return moneyReceiver;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void printTransactions(ArrayList<Transaction> transactionArrayList, Customer customer) {
        System.out.println("Transactions for customer: " + customer.getCustomerLastName());
        for (int i = 0; i < transactionArrayList.size(); i++) {
            System.out.println("Transaction ID -> " + transactionArrayList.get(i).getTransactionId());
        }


    }
}
