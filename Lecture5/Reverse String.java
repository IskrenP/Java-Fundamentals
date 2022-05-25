package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string= scanner.nextLine();
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);

    }
}
