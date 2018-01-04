package com.algorithms.backtracking;

import com.algorithms.helper.Print;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public void sublists(List<Integer> list) {
        sublistsHelper(list, new ArrayList<>());
    }

    private void sublistsHelper(List<Integer> list, List<Integer> chosen) {
        if(list.size() == 0){
            Print.puts(chosen); // base case; nothing to choose
        }else{
            int num  = list.get(0);
            list.remove(0);
            chosen.add(num);
            sublistsHelper(list, chosen);
            chosen.remove(chosen.size() - 1);
            sublistsHelper(list, chosen);
            list.add(0, num);
        }
    }

    public static void main(String[] args) {
        Subsets ss = new Subsets();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ss.sublists(list);
    }
}
