package com.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {
    public void diceRoll(int n, List<Integer> cur) {
        if(n == 0) {
            System.out.print("{");
            for(int num: cur) {
                System.out.print(num + " ");
            }
            System.out.print("}");
        }else{
            for(int i = 1; i <= 6; i++) {
                cur.add(i);
                diceRoll(n - 1, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        DiceRoll dr = new DiceRoll();
        dr.diceRoll(2, new ArrayList<>());
    }
}
