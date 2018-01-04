package com.algorithms.helper;

import java.util.*;

public class Print {

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
        Print.puts(list1);
        Print.puts(list2);
        Print.puts(list3);
    }
}
