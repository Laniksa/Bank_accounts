package com.company;

public class CreditAccount extends Score{
    private String name;
    private int amount;

    public CreditAccount(String name, int amount) {
        this.name = name;
        //balance(amount);
        if(amount > 0)
            throw new IllegalArgumentException("Сумма на счете " + name + " не может быть больше 0\n");// единственный вариант который не дает создать экземпляр класса если счет больше 0
        this.amount = amount;


    }


    @Override
    public void translation(Score score, int sum) {
        System.out.println("Перевод с " + name + " невозможен!");
    }

    @Override
    public void addMoney(int money) {
        //balance(amount);
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

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

//    public boolean balance(int amount){
//        try {
//            if (amount <= 0) {
//                this.amount = amount;
//
//            }
//        } catch (Exception E) {
//            System.out.println("Сумма на счете " + name + " не может быть больше 0\n");
//            return false;
//        }
//        return true;
//    }

}
