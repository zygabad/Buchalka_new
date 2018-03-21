package com.company;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TransactionTest {

    private static final String ACCOUNT_RECEIVER = "1234-56-33-2";
    private static final String ACCOUNT_SENDER = "0000-1234-5678-09";
    private static final String MONEY_SENDER = "Jan Kowalski";
    private static final String MONEY_RECEIVER = "Anna Nowak";
    private static final Long TRANSACTION_ID = 1l;
    private static final double TRANSACTION_AMOUNT = 100.02;


    @Test
    public void testCreateTransaction() {
        //given
        //when
        Transaction newTransaction = new Transaction(TRANSACTION_ID,ACCOUNT_RECEIVER, ACCOUNT_SENDER,
                MONEY_SENDER, MONEY_RECEIVER, TRANSACTION_AMOUNT);
        //then
        assertEquals(MONEY_SENDER, newTransaction.getMoneySender());
        assertEquals(MONEY_RECEIVER, newTransaction.getMoneyReceiver());
        assertEquals(ACCOUNT_RECEIVER, newTransaction.getAccountReceiver());
        assertEquals(ACCOUNT_SENDER, newTransaction.getAccountSender());
        assertEquals(new Long(TRANSACTION_ID), new Long(newTransaction.getTransactionId()));
        assertEquals(new Double(TRANSACTION_AMOUNT), new Double(newTransaction.getTransactionAmount()));
    }
}


