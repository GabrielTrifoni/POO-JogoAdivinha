package com.unesp.rc.input;

import java.util.Scanner;

public class Input {
    public static int lerInt() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String lerString() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
