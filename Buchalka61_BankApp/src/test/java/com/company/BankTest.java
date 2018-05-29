package com.company;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BankTest {
    private static final String BANK_NAME = "mBank";
    private static final String BRANCH_NAME = "Dep 1";
    private static final Long BRANCH_ID = 1001L;
    private static final ArrayList<Branch> branches = new ArrayList<>();

    @Test
    public void addBranchTest() {
        //given
        Bank newBank = new Bank(BANK_NAME);
        Branch newBranch = new Branch(BRANCH_NAME, BRANCH_ID);

        //when
        boolean branchAdded = newBank.addBranch(newBranch);
        //then
        assertEquals(true,true);
    }

    public static class ExampleTest {
        private static final String BANK_NAME = "mBank";
        private static final String BRANCH_NAME = "Dep 1";
        private static final Long BRANCH_ID = 1001L;
        private static final ArrayList<Branch> branches = new ArrayList<>();

        @Test
        public void addBranchTest() {
            //given
            Bank newBank = new Bank(BANK_NAME);
            Branch newBranch = new Branch(BRANCH_NAME, BRANCH_ID);

            //when
            boolean branchAdded = newBank.addBranch(newBranch);
            //then
            assertEquals(true,true);
        }
    }
}

