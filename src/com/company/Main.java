package com.company;

import java.util.Scanner;

public class Main {
public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	CheckingAccount checkingAccount = new CheckingAccount("Расчетный счет ", 10);
    CreditAccount creditAccount = new CreditAccount("Кредитный счет", 200);
    SavingsAccount savingsAccount = new SavingsAccount("Сберегательный счет", 3000);


        checkingAccount.addMoney(100);
        //System.out.println(checkingAccount.getName());


    }
}
