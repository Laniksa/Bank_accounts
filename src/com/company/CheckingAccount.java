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
    public void translation(Score score1, Score score2, int sum) {
        System.out.println("Перевод с " + score1.getName() + " на " + score2.getName() + " суммы в размере " + sum + "руб.");
        while(true){
            if(sum > score1.getAmount()){
                System.out.println("На счете " + score1.getName() + " нет суммы введенной вами, попробуйте еще раз");
            }else{
                score2.setAmount(score2.getAmount() + sum);
                score1.setAmount(score1.getAmount() - sum);
                break;
            }
        }
        System.out.println( score1.getName() + " " + score1.getAmount() + " pуб.");
        System.out.println( score2.getName()+ " " + score2.getAmount() + " pуб.");
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

