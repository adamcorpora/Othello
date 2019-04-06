package com.adam.othello;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Current board state:");
        System.out.println("_|0|1|2|3|4|5");
        System.out.println("0|_|_|_|_|_|_|");
        System.out.println("1|_|_|_|_|_|_|");
        System.out.println("2|_|_|X|O|_|_|");
        System.out.println("3|_|_|O|X|_|_|");
        System.out.println("4|_|_|_|_|_|_|");
        System.out.println("5|_|_|_|_|_|_|" + "\n");

        Question ask = new Question(); //calls the Question file


        Board tile = new Board();
        int space = tile.check();  //run the method "check"
        System.out.println(space);


    }
}
