package com.algorithms.backtracking;

public class printBinary {
    public void printBinary(int digits, String  prefix) {
        if(digits == 0) {
            System.out.println(prefix);
        }else{
            printBinary(digits - 1, prefix + "0");
            printBinary(digits - 1, prefix + "1");
        }

    }

    public void printDecimal(int digits, String prefix) {
        if(digits == 0) {
            System.out.println(prefix);
        }else{
            for(int i = 0; i <= 9; i++)
                printDecimal(digits - 1, prefix + i);
        }
    }

    public static void main(String[] args) {
        printBinary pb = new printBinary();
        pb.printBinary(3, "");
        pb.printDecimal(2, "");
    }
}
