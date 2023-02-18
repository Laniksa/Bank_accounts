package com.company;

public class CheckingAccount extends Score{
    String name;
    int amount;
    public CheckingAccount(String name, int amount) {
        this.amount = amount;
        this.name = name;
    }

    @Override
    public void translation(Score score, int sum) {
        System.out.println("Перевод с " + name + " на " + score.getName() + " суммы в размере " + sum + "руб.");

            if(sum > super.getAmount()){
                System.out.println("На счете " + name + " нет суммы введенной вами");
            }else{
                score.setAmount(score.getAmount() + sum);
                super.setAmount(super.getAmount() - sum);
            }

        System.out.println( name + " " + super.getAmount() + " pуб.");
        System.out.println( score.getName()+ " " + score.getAmount() + " pуб.\n");
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Пополнение " + name + " на сумму " + amount + " руб.");
        super.setAmount(super.getAmount() + amount);
        System.out.println("На " + name + " " + super.getAmount() + " руб.\n");

    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата с " + name);
            if(super.getAmount() < amount){
                System.out.println("На счете не хватает средств, попробуйте ввести другую сумму для оплаты");
            }else{
                super.setAmount(super.getAmount() - amount);
        }


        System.out.println( name + " " + super.getAmount() + " pуб.\n");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}

