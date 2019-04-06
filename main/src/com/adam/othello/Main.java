package com.adam.othello;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Question ask = new Question(); //calls the Question file


        Board tile = new Board();
        int space = tile.check();  //run the method "check"
        System.out.println(space);


    }
}
