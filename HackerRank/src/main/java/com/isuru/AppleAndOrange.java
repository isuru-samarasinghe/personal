package com.isuru;

public class AppleAndOrange {
    public static void main(String[] args) {

        countApplesAndOranges(7, 10, 4, 12, new int[]{2, 3, -4}, new int[]{3, -2, -4});
    }

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int finalAppleCount = 0;
        int finalOrangeCount = 0;

        if( apples != null && apples.length > 0 ) {
            finalAppleCount = calculateInbetween(s , t, a, apples);
        }
        if( oranges != null && oranges.length > 0  ) {
            finalOrangeCount = calculateInbetween(s , t, b, oranges);
        }

        System.out.println(finalAppleCount);
        System.out.println(finalOrangeCount);

    }

    private static int calculateInbetween(int s, int t, int initPosition, int[] otherPositions) {
        int count = 0;
        for (int otherPosition : otherPositions) {
            int calcPosition = initPosition + otherPosition;
            if( calcPosition >= s && calcPosition <= t ){
                count++;
            }
        }
        return count;
    }
}
