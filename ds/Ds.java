package ds;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;


public class Ds {

    public static void Stack() {

        Stack<String> stk = new Stack<>();
        stk.push("ios");
        stk.push("android");
        stk.push("wimdows");
        stk.push("linux");

        System.out.println(stk.toString());
        System.out.println("Pop - " + stk.pop());
        System.out.println(stk.toString());


        for (int i = 0; i < stk.size(); i++) {
            String el = stk.get(i);

            if(el.equals("android")) {
                System.out.println("Android found at position - "+i);
                break;
            }
        }
    }


    public static void queue() {
        
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        //que.add(23);
        //que.add(2);
        //que.add(45);
        //que.add(4);

        System.out.println(que.toString()); // print the que.
        System.out.println(" Removed "+ que.remove());
        System.out.println(" Removed "+ que.remove());
        System.out.println(que.toString()); // print the que
        que.add(566);
        que.add(null);
        System.out.println(que.toString()); // print the que
        
    }


    public static void linkedList() {

        LinkedList<String> lst = new LinkedList<>();
        lst.add("android");
        lst.add("ios");
        lst.add("linux");
        lst.add("linux");
        lst.add("null");
        lst.add("windows");

        System.out.println(lst.toString());
        System.out.println(" Element at 2nd Pos " + lst.get(2));
        System.out.println(" Check Availability " + lst.contains("ios"));
        System.out.println(" Check Availability " + lst.contains("linux"));
        System.out.println(" Remove " + lst.remove("ios"));
        System.out.println(lst.toString());
        lst.add(4, "data");
        System.out.println(lst.toString());
        lst.set(4, "helios");
        System.out.println(lst.toString());
    }


    public static void treeDemo() {
        
        TreeMap<Integer, String> mp = new TreeMap<>();
        mp.put(1, "android");
        mp.put(56, "iot");
        mp.put(9, "linux");
        mp.put(12, "windows");

        System.out.println(mp.toString());
        System.out.println("Element at 1 " + mp.get(1));

    }

    public static void sortedSet() {

        int [] arr = {61, 87, 86, 12, 27, 93, 57, 98, 80, 89, 81, 14, 85, 54, 81, 19, 30, 51, 58, 7, 100, 2, 53, 79, 36, 62, 33, 86, 0, 12, 20, 48, 20, 84, 58, 16, 66, 52, 37, 96, 19, 58, 98, 20, 54, 88, 73, 95, 81, 59};

        TreeSet<Integer> set = new TreeSet<>();

        for(int i: arr){
            set.add(i);
        }
        System.out.println(set.toString());
    }
    public static void main(String[] args) {
        // Stack();
        // queue();
        // linkedList();
        // treeDemo();
        sortedSet();
    }
}

