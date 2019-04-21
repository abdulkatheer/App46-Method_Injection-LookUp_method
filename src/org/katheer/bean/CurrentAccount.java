package org.katheer.bean;

public class CurrentAccount implements Account {
    @Override
    public void getBalance() {
        System.out.println("Rs.9729982");
    }

    @Override
    public void showAccInfo() {
        System.out.println("Name : Abdul\nAcc No : 102");
    }

    @Override
    public void showAccType() {
        System.out.println("Current Account");
    }
}
