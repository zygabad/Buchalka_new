package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private Long branchId;
    private ArrayList<Customer> listOfCustomers = new ArrayList<>();

    public Branch(String branchName, Long branchId) {
        this.branchName = branchName;
        this.branchId = branchId;
    }

    public boolean addCustomer(Customer newCustomer) {
        //TODO check if there is already such customer on the list
        listOfCustomers.add(newCustomer);

        return true;
    }

    public boolean removeCustomer(Customer customer) {
        listOfCustomers.remove(customer);
        return true;
    }


    public String getBranchName() {
        return branchName;
    }

    public Long getBranchId() {
        return branchId;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public Customer queryCustomer(int CustomerId) {
        Customer wantedCustomer = new Customer(CustomerId);
        for (int i = 0; i < listOfCustomers.size(); i++) {
            if (listOfCustomers.get(i).equals(wantedCustomer)) {
                return listOfCustomers.get(i);
            }
        }
        return null;
    }

    public int queryCustomer(String customerFirstName, String customerMiddleName, String customerLastName) {
        Customer wantedCustomer = new Customer(customerFirstName, customerMiddleName, customerLastName);
        int position = -1;
        for (int i = 0; i < listOfCustomers.size(); i++) {
            if (listOfCustomers.get(i).getCustomerFirstName().equals(customerFirstName)
                    && listOfCustomers.get(i).getCustomerMIddleName().equals(customerMiddleName)
                    && listOfCustomers.get(i).getCustomerLastName().equals(customerLastName)) {
                position = i;
            }
        }
        return position;

    }

    public Customer getCustomerFromList(int postion) {
        if (postion <=listOfCustomers.size()) {
            Customer wantedCustomer = listOfCustomers.get(postion);
            return wantedCustomer;
        }

        return null;
    }
    public void printCustomers(ArrayList<Customer> listOfCustomers, Branch branch) {
        System.out.println("Printing Customers for branch :" + branch.getBranchName());
        for (int i = 0; i < listOfCustomers.size(); i++) {
            System.out.println("Customer Name -> " + listOfCustomers.get(i).getCustomerFirstName());
            System.out.println("Customer Name -> " + listOfCustomers.get(i).getCustomerMIddleName());
            System.out.println("Customer Name -> " + listOfCustomers.get(i).getCustomerLastName());
        }
    }


}
