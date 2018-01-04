package com.algorithms.helper;

import java.util.*;

public class Print {

    public static <T>void puts(T e) {
        System.out.print(e.toString());
    }

    public static <T>void puts(T[] arr) {
        for(T e: arr)
            Print.puts(e);
    }

    public static void puts(int[] arr) {
        System.out.print('[');
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i] + "");
        }
        System.out.print(']');
    }

    public static void puts(char[] arr) {
        System.out.print('[');
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i] + "");
        }
        System.out.print(']');
    }

    public static void puts(String[] arr) {
        System.out.print('[');
        for(int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i] + "");
        }
        System.out.print(']');
    }



    public static <T>void puts(List<T> list) {
        System.out.print('[');
        for(int i = 0; i < list.size(); i++) {
            if(i != list.size() - 1)
                System.out.print(list.get(i).toString() + ",");
            else
                System.out.print(list.get(i).toString() + "");
        }
        System.out.print(']');
    }

    public static <T>void puts(Set<T> set) {
        System.out.print('[');
        int size = set.size();
        int i = 0;
        for(T e: set) {
            Print.puts(e);
            i++;
            if(i != size)
                System.out.print(",");
        }
        System.out.print(']');
    }

    public static <T>void puts(Map<T, T> map) {
        for(Map.Entry entry: map.entrySet()) {
            Print.puts("<");
            Print.puts(entry.getKey());
            Print.puts(",");
            Print.puts(entry.getValue());
            Print.puts(">");
            System.out.println("");
        }
    }

}
class Test{
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        List list2 = new LinkedList<>();
        List list3 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add('a');
        list1.add("asdfg");
        list2.add("8");
        list2.add("haha");
        list1.add(list2);
        Map map = new HashMap();
        map.put(1, list1);
        map.put(list2, list3);
        int[] arr1 = new int[]{45,49888,9548};
        String[] arr2 = new String[]{"jiang", "huang"};
        List[] arr3 = new List[]{list1, list2};
        char[] arr4 = new char[]{'j', 'h', 'y'};
        Set set = new HashSet();
        set.add(1);
        set.add("a");
        System.out.println("nested list");
        Print.puts(list1);
        System.out.println("");
        System.out.println("list with number and string");
        Print.puts(list2);
        System.out.println("");
        System.out.println("null element in list");
        Print.puts(list3);
        System.out.println("");
        System.out.println("map");
        Print.puts(map);
        System.out.println("");
        System.out.println("int array");
        Print.puts(arr1);
        System.out.println("");
        System.out.println("string array");
        Print.puts(arr2);
        System.out.println("");
        System.out.println("list array");
        Print.puts(arr3);
        System.out.println("");
        System.out.println("char array");
        Print.puts(arr4);
        System.out.println("");
        System.out.println("set");
        Print.puts(set);
    }
}
