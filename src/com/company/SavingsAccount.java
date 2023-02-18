package com.company;

public class SavingsAccount extends Score{
    private  String name;
    private int amount;

    public SavingsAccount(String name, int amount) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void translation(Score score, int sum) {
        System.out.println("Перевод с " + name + " на " + score.getName() + " суммы в размере " + sum + "руб.");

        if(sum > amount){
            System.out.println("На счете " + name + " нет такой суммы");
        }else{
            score.setAmount(score.getAmount() + sum);
            amount = amount - sum;
        }

        System.out.println( name + " " + amount + " pуб.");
        System.out.println( score.getName()+ " " + score.getAmount() + " pуб.\n");
    }

    @Override
    public void addMoney(int addAmount) {
        System.out.println("Пополнение " + name + " на сумму " + addAmount + " руб.");
        amount = amount + addAmount;
        System.out.println("На " + name + " " + amount + " руб.\n");

    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата с " + name + " невозможна!\n");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
