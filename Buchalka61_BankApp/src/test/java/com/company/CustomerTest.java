package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private static final String CUSTOMER_FIRST_NAME = "Zygmunt";
    private static final String CUSTOMER_MIDDLE_NAME = "Adam";
    private static final String CUSTOMER_LAST_NAME = "Paczkowski";
    private static final ArrayList<Transaction> customerTransactions = new ArrayList<>();

    private static final String ACCOUNT_RECEIVER = "1234-56-33-2";
    private static final String ACCOUNT_SENDER = "0000-1234-5678-09";
    private static final String MONEY_SENDER = "Zygmunt Paczkowski";
    private static final String MONEY_RECEIVER = "Anna Nowak";
    private static final double TRANSACTION_AMOUNT = 100.02;
    private static final long TRANSACTION_ID = 1;

    @Test
    public void addTransactionTest() {

        //given
        Customer customer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Transaction newTransaction = new Transaction(TRANSACTION_ID, ACCOUNT_RECEIVER, ACCOUNT_SENDER,
                MONEY_SENDER, MONEY_RECEIVER, TRANSACTION_AMOUNT);
        //when
        customer.addTransaction(newTransaction);
        //then
        assertEquals(true, customer.addTransaction(newTransaction));
        assertEquals(new Long(TRANSACTION_ID), new Long(customer.getCustomerTransactions().get(0).getTransactionId()));
    }


    @Test
    public void removeTransactionTest() {

        //given
        Customer customer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Transaction newTransaction = new Transaction(TRANSACTION_ID, ACCOUNT_RECEIVER, ACCOUNT_SENDER,
                MONEY_SENDER, MONEY_RECEIVER, TRANSACTION_AMOUNT);
        customer.addTransaction(newTransaction);

        //when
        customer.removeTransaction(newTransaction);

        //then
        assertEquals(true, customer.removeTransaction(newTransaction));
    }


    @Test
    public void queryTransactionTest() {

        //given
        Customer customer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Transaction newTransaction = new Transaction(TRANSACTION_ID, ACCOUNT_RECEIVER, ACCOUNT_SENDER,
                MONEY_SENDER, MONEY_RECEIVER, TRANSACTION_AMOUNT);
        customer.addTransaction(newTransaction);

        //when
        customer.queryTransaction(TRANSACTION_ID);

        //then
        assertEquals(0, customer.queryTransaction(TRANSACTION_ID));
    }


    @Test
    public void queryTransactionByNameTest() {

        //given
        Customer customer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Transaction newTransaction = new Transaction(TRANSACTION_ID, ACCOUNT_RECEIVER, ACCOUNT_SENDER,
                MONEY_SENDER, MONEY_RECEIVER, TRANSACTION_AMOUNT);
        customer.addTransaction(newTransaction);

        //when
        customer.queryTransaction(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);

        //then
        assertEquals(0, customer.queryTransaction(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME));
    }
    //PYTANIE w when i w then mam wywolanie query - ok?
    //PYTANIE czy tak testowac przeciazone metody jak tutuaj?


    @Test
    public void transactionInfo() {

        //given
        Customer customer = new Customer(CUSTOMER_FIRST_NAME, CUSTOMER_MIDDLE_NAME, CUSTOMER_LAST_NAME);
        Transaction newTransaction = new Transaction(TRANSACTION_ID, ACCOUNT_RECEIVER, ACCOUNT_SENDER,
                MONEY_SENDER, MONEY_RECEIVER, TRANSACTION_AMOUNT);
        customer.addTransaction(newTransaction);

        //when
        String transactionInfo = customer.transactionInfo(TRANSACTION_ID);

        //then
        assertEquals("Transaction info -> \r" +
                " + Money sender -> \r" +
                "Zygmunt PaczkowskiTransaction ID -> \r" +
                "1Transaction Amount -> 100.02", transactionInfo);
    }
}