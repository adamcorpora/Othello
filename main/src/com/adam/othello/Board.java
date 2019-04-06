package com.adam.othello;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public int jeff = 1;
    List<List<String>> outer = new ArrayList<List<String>>();
    List<String> inner1 = new ArrayList<String>();
    List<String> inner2 = new ArrayList<String>();
    List<String> inner3 = new ArrayList<String>();


    public Board (){
        System.out.println("\n" + "_|0|1|2|3|4|5");
        inner1.add("_|");
        inner1.add("_|");
        inner1.add("_|");
        inner1.add("_|");
        inner1.add("_|");
        inner1.add("_|");

        inner2.add("_|");
        inner2.add("_|");
        inner2.add("_|");
        inner2.add("_|");
        inner2.add("_|");
        inner2.add("_|");

        inner3.add("_|");
        inner3.add("_|");
        inner3.add("_|");
        inner3.add("_|");
        inner3.add("_|");
        inner3.add("_|");
        inner3.add("_|");

        outer.add(inner1);
        outer.add(inner2);
        outer.add(inner3);
        }

    public int check () {
        System.out.print("0|");
        if (Question.input == 0) {
            inner1.set(0,"X|");
        }
        else if (Question.input == 1) {
            inner1.set(1,"X|");
        }
        else if (Question.input == 2) {
            inner1.set(2,"X|");
        }
        else if (Question.input == 3) {
            inner1.set(3,"X|");
        }
        else if (Question.input == 4) {
            inner1.set(4,"X|");
        }
        else if (Question.input == 5) {
            inner1.set(5,"X|");
        }
        System.out.print(inner1.get(0) + inner1.get(1) + inner1.get(2) + inner1.get(3) + inner1.get(4) + inner1.get(5));
        System.out.println("\n");
        return 0;
    }
}
