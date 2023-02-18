package com.company;

public class SavingsAccount extends Score{
    String name;
    int amount;
    public SavingsAccount(String name, int amount) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void translation(Score score, int sum) {

    }

    @Override
    public void addMoney(int amount) {

    }

    @Override
    public void pay(int amount) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

}
