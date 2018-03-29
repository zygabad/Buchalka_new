package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;



public class Main {



    public static void main(String[] args) {
	// write your code here
        System.out.println("Test");
        Bank mBank = new Bank("mBank");
        Branch branchDep1 = new Branch("Dep 1", 1001L);
        Branch branchDep2 = new Branch("Dep 2", 1002L);

        Customer Kris = new Customer("Piotr", "Krzysztof", "Kowalski");
        Customer Ala = new Customer("Ala", "Beata", "Paczkowska");

        Transaction transaction1 = new Transaction(1001, "00-12--34", "12-56-3",
                "Ala", "Kris", 2312.23);

        Transaction transaction2 = new Transaction(1002, "00-12--34-233223", "12-53232326-3",
                "Aswsdf", "Kriskff", 2312.23);

        Transaction transaction3 = new Transaction(1003, "00-12--34", "12-56-3",
                "Ala", "Kris", 2312.23);

        branchDep1.addCustomer(Kris);
        branchDep2.addCustomer(Ala);
        Kris.addTransaction(transaction1);
        Kris.addTransaction(transaction2);
        Ala.addTransaction(transaction3);
        mBank.addBranch(branchDep1);
        mBank.addBranch(branchDep2);

        

    mBank.printBranches(mBank.getListOfBranches());
        branchDep1.printCustomers(branchDep1.getListOfCustomers(),branchDep1);
        branchDep2.printCustomers(branchDep2.getListOfCustomers(),branchDep2);

        transaction1.printTransactions(Kris.getCustomerTransactions(), Kris);

    }


}
