package com.maq.codility;

/**
 * Created by Marcelo on 02/02/2015.
 */
public class LargestGap {

    public static void main(String[] args) {

        int[] A = {10, 0, 8, 2, -1, 12, 11, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {


        long maxValue = Long.MIN_VALUE;
        long minValue = Long.MAX_VALUE;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > maxValue) {
                maxValue = A[i];
                maxIndex = i + 1;
            }

            if (A[i] < minValue) {
                minValue = A[i];
                minIndex = i + 1;
            }
        }

        int maxGap = 0;
        for (int j = minIndex; j <= maxIndex; j++) {
            int minGap = Integer.MAX_VALUE;
            for (int i = 0; i < A.length; i++) {
                int val = Math.abs(A[i] - j);
                minGap = val < minGap ? val : minGap;
            }
            System.out.println("minGap: " + minGap);
            maxGap = minGap > maxGap ? minGap : maxGap;
        }

        return maxGap;
    }


}
