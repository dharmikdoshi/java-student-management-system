package com.airtribe.studentmanagement.util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        System.out.print(message);
        return Integer.parseInt(scanner.nextLine());
    }

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

}
