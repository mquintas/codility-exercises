package com.maq.codewars;

/**
 * Created by mquintas on 2/2/2015.
 */
public class BreakingChocolate {

    /**
     * Your task is to split the chocolate bar of given dimension n x m into small squares. Each square is of size 1x1 and unbreakable.
     * Implement a function that will return minimum number of breaks needed.
     * For example if you are given a chocolate bar of size 2 x 1 you can split it to single squares in just one break,
     * but for size 3 x 1 you must do two breaks.
     * If input data is invalid you should return 0 (as in no breaks are needed if we do not have any chocolate to split).
     * Input will always be a non-negative integer.
     */
    public static void main(String[] args) {
        System.out.println("   0x0:" + chocolateBreaker(0,0));
        System.out.println("   1x1:" + chocolateBreaker(1,1));
        System.out.println("   3x3:" + chocolateBreaker(3,3));
        System.out.println("   4x3:" + chocolateBreaker(4,3));
        System.out.println("   5x5:" + chocolateBreaker(5,5));
        System.out.println("  10x2:" + chocolateBreaker(10,2));
        System.out.println(" 15x15:" + chocolateBreaker(15,15));
        System.out.println("100x28:" + chocolateBreaker(100,28));
    }

    private static int chocolateBreaker(int M, int N) {
        if(M==0 || N==0 ){
            return 0;
        }
        return M-1 + (M)*(N-1);
    }

}
