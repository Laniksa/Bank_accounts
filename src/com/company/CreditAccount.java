package com.company;

public class CreditAccount extends Score{
    String name;
    int amount;

    public CreditAccount(String name, int amount) {
        super(amount);
        this.name = name;
    }

    @Override
    public void translation(Score score, int sum) {
        System.out.println("Перевод с " + name + " невозможен!");
    }

    @Override
    public void addMoney(int amount) {
        int remains = 0;
        System.out.println("Пополнение " + name + " на сумму " + amount + " руб.");
        super.setAmount(super.getAmount() + amount);
        if (super.getAmount() > 0){
            remains = super.getAmount();
            super.setAmount(0);
        }
        System.out.println("При пополнении " + name + " на " + amount + " руб. Баланс равен " + super.getAmount() + " руб. Остаток: " + remains + "\n"  );
    }

    @Override
    public void pay(int amount) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }
    public void setAmount(int amount){
        if(balance(amount)==true){
            this.amount = amount;
        }else{
            System.out.println("Сумма на счете " + name + " не может быть больше 0");
        }
    }

    @Override
    public int getAmount() {
        if(balance(amount)==true){
            return amount;
        }else{
            System.out.println("Сумма на счете " + name + " не может быть больше 0");
        }
        return 0;
    }

    public boolean balance(int amount){
        if(super.getAmount() > 0){
            //System.out.println("Сумма на счете " + name + " не может быть больше 0");
            return false;
        }else{
            return true;
        }
    }

}
