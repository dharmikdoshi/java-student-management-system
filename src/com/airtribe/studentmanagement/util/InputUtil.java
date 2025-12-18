package com.airtribe.studentmanagement.util;

import java.util.Scanner;


public class InputUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static String readString(String message) {
        System.out.print(message);
        scanner.nextLine(); 
        return scanner.nextLine();
    }
}
