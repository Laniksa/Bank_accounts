package com.company;

public class CheckingAccount extends Score{
    String name;
    public CheckingAccount(String name, int amount) {
        super(amount);
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
        System.out.println( score.getName()+ " " + score.getAmount() + " pуб.");
    }

    @Override
    public void addMoney(int amount) {
        System.out.println("Пополнение " + name + " на сумму " + amount + " руб.");
        super.setAmount(super.getAmount() + amount);
        System.out.println("На " + name + " " + super.getAmount() + " руб.");

    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата с " + name + " введите сумму");
            if(super.getAmount() < amount){
                System.out.println("На счете не хватает средств, попробуйте ввести другую сумму для оплаты");
            }else{
                super.setAmount(super.getAmount() - amount);
        }


        System.out.println( name + " " + super.getAmount() + " pуб.");
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

