package com.adam.othello;

public class Main {
    public static void main(String[] args) {

        Board tile = new Board();
        int space = tile.check();  //run the method "check"
        System.out.println(space);

    }
}
