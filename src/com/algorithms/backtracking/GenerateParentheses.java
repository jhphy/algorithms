package com.algorithms.backtracking;

public class GenerateParentheses {
    public void generateParentheses(int n) {
        dfs(n, n, "");
    }
    private void dfs(int left, int right, String prefix) {
        if(left == 0 && right == 0) {
            System.out.println(prefix);
        }
        if(left > 0)
            dfs(left - 1, right, prefix + '(');
        if(left < right)
            dfs(left, right - 1, prefix + ')');
    }

    public static void main(String[] args) {
        GenerateParentheses pars = new GenerateParentheses();
        pars.generateParentheses(3);
    }

}
