package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

                System.out.print("What is yur name?");
        String name = keyboard.nextLine();
        System.out.println("Hello," + name);

    }
}
