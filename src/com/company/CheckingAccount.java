package com.company;

public class CheckingAccount extends Score{
    public CheckingAccount ch ;
    String name = "Расчетный счет ";
    int amount = 0;
    public CheckingAccount(String name, int amount) {
        super(amount);
        this.name = name;
    }

    @Override
    public void translation(Score score, int sum) {
        System.out.println("Перевод с " + name + " на " + score.getName() + " суммы в размере " + sum + "руб.");
        while(true){
            if(sum > super.getAmount()){
                System.out.println("На счете " + name + " нет суммы введенной вами, попробуйте еще раз");
            }else{
                score.setAmount(score.getAmount() + sum);
                super.setAmount(super.getAmount() - sum);
                break;
            }
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
    public void pay(Score score, int amount) {
        System.out.println("Оплаты " + score + " введите сумму");
        score.setAmount(score.getAmount() - amount);
        System.out.println( score.getName() + " " + score.getAmount() + " pуб.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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

