package com.learn;

import java.util.ArrayList;
import java.util.List;

public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("=========================");
        List list = new ArrayList<String>();
        list.add("one");
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("two");
        System.out.println(list);
    }
}
