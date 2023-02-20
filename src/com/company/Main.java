package com.company;
public class Main {
    public static void main(String[] args) throws Exception {
	    CheckingAccount checkingAccount1 = new CheckingAccount("Расчетный счет1 ", 10);
        CheckingAccount checkingAccount2 = new CheckingAccount("Расчетный счет2 ", 0);
        CheckingAccount checkingAccount3 = new CheckingAccount("Расчетный счет3 ", -4);

        CreditAccount creditAccount1 = new CreditAccount("Кредитный счет 1", -40);
        CreditAccount creditAccount2 = new CreditAccount("Кредитный счет 2", 0);
        CreditAccount creditAccount3 = new CreditAccount("Кредитный счет 3", 5);

        SavingsAccount savingsAccount1 = new SavingsAccount("Сберегательный счет 1", 3000);
        SavingsAccount savingsAccount2 = new SavingsAccount("Сберегательный счет 2", 6000);


        checkingAccount1.addMoney(90);
        checkingAccount1.translation(checkingAccount2,80);
        checkingAccount1.pay(10);
        checkingAccount3.pay(80);

        creditAccount1.addMoney(50);
        creditAccount2.translation(checkingAccount1, 20);
        creditAccount2.pay(4000);

        savingsAccount1.addMoney(1000);
        savingsAccount2.translation(creditAccount1, 1);
        savingsAccount2.pay(100);


        creditAccount3.pay(4);
        creditAccount3.addMoney(999);

    }
}
