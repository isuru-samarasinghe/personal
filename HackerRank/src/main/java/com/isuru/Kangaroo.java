package com.isuru;

public class Kangaroo {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));
        System.out.println(kangaroo(0 , 2 , 5 , 3));
    }
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        float numberOfHops = (x2 - x1) * 1.0f / (v1 - v2);
        return numberOfHops > 0 && numberOfHops % 1 == 0 ? "YES" : "NO";
    }

}
