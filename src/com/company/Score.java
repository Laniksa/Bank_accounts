package com.company;

public abstract class Score {
   private String name;
   private int amount = 0;

   public Score(int amount){
       this.amount = amount;

   }

//    protected Score() {
//    }

    public abstract void translation(Score score1, Score score2, int sum);



    public abstract void addMoney(int amount);

    public abstract void pay (Score score, int amount);



    public abstract String getName();

    public abstract void setName(String name);

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    };
}

