package com.algorithms.backtracking;

public class PrintBinary {
    public void printBinary(int digits, String  prefix) {
        if(digits == 0) {
            System.out.println(prefix);
        }else{
            printBinary(digits - 1, prefix + "0");
            printBinary(digits - 1, prefix + "1");
        }

    }

    public void printDecimal(int digits) {
        printDecimalDfs(digits, "");
        System.out.println("");
        printDecimalBackTracking(digits, new StringBuilder());
    }

    public void printDecimalDfs(int digits, String prefix) {
        if(digits == 0) {
            System.out.print(prefix + " ");
        }else{
            for(int i = 0; i <= 9; i++)
                printDecimalDfs(digits - 1, prefix + i);
        }
    }

    public void printDecimalBackTracking(int digits, StringBuilder sb) {
        if(digits == 0) {
            System.out.print(sb.toString() + " ");
        }else{
            for(int i = 0; i <= 9; i++) {
                sb.append(i);
                printDecimalBackTracking(digits - 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }



    public static void main(String[] args) {
        PrintBinary pb = new PrintBinary();
        pb.printBinary(3, "");
        pb.printDecimal(2);
    }
}
