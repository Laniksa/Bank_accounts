package com.company;

import java.util.Scanner;

public abstract class Score {
    Scanner scan;
   private String name;
   private int amount = 0;

   public Score(String name, int amount){
       this.name = name;
       this.amount = amount;
   }

    public void translation(Score score1, Score score2, Scanner scan){
        System.out.println("Для перевода с " + score1.name + " на " + score2.name + " введите сумму");
        int sum;
        while(true){
           sum = scan.nextInt();
            if(sum > score1.amount){
                System.out.println("На счете " + score1.name + " нет суммы введенной вами, попробуйте еще раз");
            }else{
                score2.amount = score2.amount + sum;
                score1.amount = score1.amount - sum;
                break;
            }
        }
        System.out.println( score1.name + " " + score1.amount + " pуб.");
        System.out.println( score2.name + " " + score2.amount + " pуб.");
    }

    public void addMoney (Score score, int amount){
        System.out.println("Для пополнения " + score + " введите сумму");
        score.amount = score.amount + amount;
        System.out.println( score.name + " " + score.amount + " pуб.");

    }
    public void pay (Score score, int amount){
        System.out.println("Оплаты " + score + " введите сумму");
        score.amount = score.amount - amount;
        System.out.println( score.name + " " + score.amount + " pуб.");
    }
}
