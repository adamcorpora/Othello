package com.adam.othello;

import java.util.Scanner;

public class Question {
    static int input;

    public Question () {

        Scanner moves = new Scanner(System.in);

        System.out.print("Pick a number from 0-5 ");
        input = moves.nextInt();

    }
}
