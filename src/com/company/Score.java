package com.company;

public abstract class Score {
   private String name;
   private int amount = 0;

   public Score(int amount){
       this.amount = amount;

   }

    public abstract void translation(Score score, int sum);



    public abstract void addMoney(int amount);

    public abstract void pay (int amount);



    public abstract String getName();

    public abstract void setName(String name);

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
}

