package org.katheer.bean;

public class SavingsAccount implements Account {
    @Override
    public void getBalance() {
        System.out.println("Rs.789003");
    }

    @Override
    public void showAccInfo() {
        System.out.println("Name : Katheer\nAcc No : 101");
    }

    @Override
    public void showAccType() {
        System.out.println("Savings Account");
    }
}
