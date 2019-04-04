package com.adam.othello;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int tile;
    ArrayList<String> options = new ArrayList<String>();
    List<List<String>> outer = new ArrayList<List<String>>();
    List<String> inner1 = new ArrayList<String>();
    List<String> inner2 = new ArrayList<String>();
    List<String> inner3 = new ArrayList<String>();



    public Board (){
        options.add("X");
        options.add("bus");
        inner1.add("_|");
        inner1.add("X|");
        inner1.add("O|");

        //outer.get(0).add(300);
    }

    public int check () {
        System.out.println("_|0|1|2|3|4|5");
        System.out.print("0|");
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.println(inner1.get(0));
        System.out.print("1|");
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.println(inner1.get(0));
        System.out.print("2|");
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(1));
        System.out.print(inner1.get(2));
        System.out.print(inner1.get(0));
        System.out.println(inner1.get(0));
        System.out.print("3|");
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(2));
        System.out.print(inner1.get(1));
        System.out.print(inner1.get(0));
        System.out.println(inner1.get(0));
        System.out.print("4|");
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.println(inner1.get(0));
        System.out.print("5|");
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.print(inner1.get(0));
        System.out.println(inner1.get(0));
        return 0;
    }
}
