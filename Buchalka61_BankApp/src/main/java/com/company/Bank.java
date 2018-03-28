package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> listOfBranches = new ArrayList<>();

    public Bank(String bankName) {
    }

    public boolean addBranch(Branch newBranch) {
        listOfBranches.add(newBranch);
        return true;
    }

    public ArrayList<Branch> getListOfBranches() {
        return listOfBranches;
    }


    public void printBranches(ArrayList<Branch> branches ) {
        System.out.println("Branches:\r");
        for (int i =0; i < branches.size(); i++ ) {
            System.out.println("Name-> " + branches.get(i).getBranchName() + " Id-> " + branches.get(i).getBranchId());
        }
    }
}
