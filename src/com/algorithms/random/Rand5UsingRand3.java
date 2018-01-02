package com.algorithms.random;

public class Rand5UsingRand3 {
    private int rand3(){
        return (int)(Math.ceil(Math.random()*3));
    }

    public int rand5(){
        int r = (rand3() - 1) * 3 + rand3();
         if(r >= 6){
             r = (rand3() - 1) * 3 + rand3();
         }
        return (r%5) + 1;
    }

    public static void main(String args[]){
        Rand5UsingRand3 rr = new Rand5UsingRand3();
        for(int i=0; i < 10; i++){
            System.out.print(rr.rand5());
        }
    }
}
