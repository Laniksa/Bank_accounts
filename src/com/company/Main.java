package com.company;

import java.util.Scanner;

public class Main {
public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
	    CheckingAccount checkingAccount1 = new CheckingAccount("Расчетный счет1 ", 10);
        CheckingAccount checkingAccount2 = new CheckingAccount("Расчетный счет2 ", 0);
        CreditAccount creditAccount1 = new CreditAccount("Кредитный счет 1", -40);

        //CreditAccount creditAccount2 = new CreditAccount("Кредитный счет 2", 1);
        SavingsAccount savingsAccount = new SavingsAccount("Сберегательный счет", 3000);


        checkingAccount1.addMoney(90);
        checkingAccount1.translation(checkingAccount2,80);
        checkingAccount1.pay(10);

        creditAccount1.addMoney(50);
        //creditAccount2.addMoney(4);



    }
}
