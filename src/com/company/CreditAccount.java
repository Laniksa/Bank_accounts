package com.company;

public class CreditAccount extends Score{
    private String name;
    private int amount;

    public CreditAccount(String name, int amount) {
        this.name = name;
//        if(amount > 0)
//            throw new IllegalArgumentException("Сумма на счете " + name + "- не может быть больше 0\n");
        this.amount = amount;


    }

    @Override
    public void translation(Score score, int sum) {
        System.out.println("Перевод с " + name + "- невозможен!\n");
    }

    @Override
    public void addMoney(int money) {
        if(amount  > 0){
            System.out.println("Сумма на счете " + name + "- не может быть больше 0\n");
            return;
        }
        int remains = 0;
        System.out.println("Пополнение " + name + " на сумму " + money + " руб.");
        setAmount(getAmount() + money);
        if (getAmount() > 0){
            remains = getAmount();
            setAmount(0);
        }
        System.out.println("При пополнении " + name + " на " + money + " руб. Баланс равен " + getAmount() + " руб. Остаток: " + remains + "\n"  );
    }

    @Override
    public void pay(int payAmount) {
        if(amount > 0){
            System.out.println("Сумма на счете " + name + "- не может быть больше 0\n");
            return;
        }
        System.out.println("Оплата с " + name);
            amount = amount - payAmount;
        System.out.println( name + " " + amount + " pуб.\n");
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
