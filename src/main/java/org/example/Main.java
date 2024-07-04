package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyFileScanner mySc = new MyFileScanner("input.txt");
        System.out.println(Arrays.toString(ProblemSolver.findStartingPosition(mySc.getLines())));


    }
}