package com.github.ashwindmk;

import java.math.BigDecimal;

public class JavaLib {
    public static void log(String msg) {
        System.out.println(msg);
    }

    public static void log(String tag, String msg) {
        System.out.println(tag + ": " + msg);
    }

    public static void log(String tag1, String tag2, String msg) {
        System.out.println(tag1 + ": " + tag2 + ": " + msg);
    }

    public static String echo(String msg) {
        return msg;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static BigDecimal add(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
