package com.company;

import java.util.Scanner;

public class Main {
public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	CheckingAccount checkingAccount = new CheckingAccount("Расчетный счет ", 0);
    CreditAccount creditAccount = new CreditAccount("Кредитный счет", 200);
    SavingsAccount savingsAccount = new SavingsAccount("Сберегательный счет", 3000);

    savingsAccount.translation(savingsAccount,checkingAccount,scanner);

    }
}
