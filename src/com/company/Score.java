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
        System.out.println("Для перевода со счета " + score1.name + " на счет " + score2.name + " введите сумму");
        int sum = scan.nextInt();
        while(true){
            if(sum <= score1.amount){
                score2.amount = score2.amount + sum;
                score1.amount = score1.amount - sum;
            }else{
                System.out.println("На счете " + score1.name + " нет сумы введенной вами, попробуйте еще раз");

            }
        }


    }
}
