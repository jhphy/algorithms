package com.algorithms.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
/*
 * this method return permute for array, the elements in array must be different
 */
    public List<List<Integer>> permuteDistinctArray(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrackDistinctArray(res, new ArrayList<>(), nums);
        return res;
    }
/*
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 */

    public List<List<Integer>> permuteDuplicateArray(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        backtrackDuplicateArray(res, new ArrayList<>(), nums, visited);
        return res;
    }


    private void backtrackDistinctArray(List<List<Integer>> res, List<Integer> cur, int[] nums) {
        if(cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
        }
        for(int i = 0; i < nums.length; i++) {
            if(cur.contains(nums[i])) {
                continue;
            }
            cur.add(nums[i]);
            backtrackDistinctArray(res, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }

    private void backtrackDuplicateArray(List<List<Integer>> res, ArrayList<Integer> cur, int[] nums, boolean[] visited) {
        if(cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
        }
        for(int i = 0; i < nums.length; i++) {
            if(visited[i] ||i >= 1 && nums[i] == nums[i-1] && visited[i-1] == true) {
                continue;
            }
            visited[i] = true;
            cur.add(nums[i]);
            backtrackDuplicateArray(res, cur, nums, visited);
            visited[i] = false;
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr_1 = new int[]{1, 2, 3, 4};
        int[] arr_2 = new int[]{1, 1, 2};
        Permutations distinct = new Permutations();
        List<List<Integer>> no_dup = distinct.permuteDistinctArray(arr_1);
        List<List<Integer>> dup = distinct.permuteDuplicateArray(arr_2);
        printLists(no_dup);
        printLists(dup);
    }

    //print List<List<>>
    private static void printLists(List<List<Integer>> lists) {
        for(List<Integer> list: lists) {
            System.out.print('[');
            for(Integer num: list) {
                System.out.print(num + "");
            }
            System.out.print(']');
        }
        System.out.println("");
    }
}
