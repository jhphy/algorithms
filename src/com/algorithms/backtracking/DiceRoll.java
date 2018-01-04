package com.algorithms.backtracking;

import com.algorithms.helper.Print;

import java.util.ArrayList;
import java.util.List;

public class DiceRoll {
    public void diceRoll(int n, List<Integer> cur) {
        if(n == 0) {
            Print.puts(cur);
            System.out.println("");
        }else{
            for(int i = 1; i <= 6; i++) {
                cur.add(i);
                diceRoll(n - 1, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public void diceSum(int dice, int target) {
        diceSumHelper(dice, target, 0, new ArrayList<>());
    }

    private void diceSumHelper(int dice, int target, int curSum, List<Integer> cur){
        if(dice == 0) {
//            if(curSum == target) {
                Print.puts(cur);
                System.out.println("");
//            }
        }else{
            for(int i = 1; i <= 6; i++) {
                //skip too small or too big
                if(curSum + i + (dice - 1) * 1 <= target && curSum + i + (dice - 1) * 6 >= target){
                    cur.add(i);
                    diceSumHelper(dice - 1, target, curSum + i, cur);
                    cur.remove(cur.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        DiceRoll dr = new DiceRoll();
        dr.diceRoll(2, new ArrayList<>());
        dr.diceSum(4,7);
    }
}
