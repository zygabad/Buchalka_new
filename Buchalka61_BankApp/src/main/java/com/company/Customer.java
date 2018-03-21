package com.company;

import java.util.ArrayList;

public class Customer {
    private String customerFirstName;
    private String customerMIddleName;
    private String customerLastName;
    private ArrayList<Transaction> customerTransactions = new ArrayList<>();

    public Customer(String customerFirstName, String customerMIddleName, String customerLastName) {
        this.customerFirstName = customerFirstName;
        this.customerMIddleName = customerMIddleName;
        this.customerLastName = customerLastName;
    }

    public boolean addTransaction(Transaction transaction) {
      //TODO validation - if exists don't add - so have to query list
        customerTransactions.add(transaction);
        return true;
    }

    public boolean removeTransaction(Transaction transaction) {
        //TODO validation - if exists don't add - so have to query list
        customerTransactions.remove(transaction);
        return true;
    }

    public int queryTransaction(Long transactionId) {
       int position=-1;
        for (int i =0 ; i < customerTransactions.size(); i++) {
            if (customerTransactions.get(i).getTransactionId() == transactionId) {
                position =i;
            }
        }
        return position;
    }

    //TODO metoda to compose the full customer name - przypadek kiedy middle name jest puste
    //UWAGA NAUKOWA - to compare Strings use rquals not == . The "==" compares pointers and doesn't work
    public int queryTransaction(String customerFirstName, String customerMIddleName, String customerLastName) {
        int position=-1;
        String customerFullName = customerFirstName + " " + customerLastName;
        for (int i =0 ; i < customerTransactions.size(); i++) {
            if (customerTransactions.get(i).getMoneySender().equals(customerFullName)) {
                position =i;
            }
        }
        return position;
    }



    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerMIddleName() {
        return customerMIddleName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public ArrayList<Transaction> getCustomerTransactions() {
        return customerTransactions;
    }
}
