package com.maq.codility;

/**
 * Created by mquintas on 1/27/2015.
 */
public class FrogJmp {

    /**
     * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
     Count the minimal number of jumps that the small frog must perform to reach its target.
     Write a function:
     class Solution { public int solution(int X, int Y, int D); }
     that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
     For example, given:
     X = 10
     Y = 85
     D = 30
     the function should return 3, because the frog will be positioned as follows:
     after the first jump, at position 10 + 30 = 40
     after the second jump, at position 10 + 30 + 30 = 70
     after the third jump, at position 10 + 30 + 30 + 30 = 100
     Assume that:
     X, Y and D are integers within the range [1..1,000,000,000];
     X ≤ Y.
     Complexity:
     expected worst-case time complexity is O(1);
     expected worst-case space complexity is O(1).
     */

    public static void main(String[] args) {

        solution(10, 85, 30);
        solution2(10, 85, 30);
        solution3(10, 85, 30);

    }

    /**
     * First approach. Not efficient. 44/100
     * https://codility.com/demo/results/demo9TPBB6-V48/
     */
    private static int solution(int X, int Y, int D) {

        int contador = 0;
        int suma = X;
        while (suma < Y) {
            suma = suma + D;
            contador++;
        }
        System.out.println(contador);
        return contador;
    }

    /**
     * 55/100
     * https://codility.com/demo/results/demoD2CXUH-3XD/
     */
    private static int solution2(int X, int Y, int D) {

        int contador =  (int) Math.ceil((Y - X) / (float)D);
        int suma = X+(D*contador);
        while (suma < Y) {
            suma = suma + D;
            contador++;
        }
        System.out.println(contador);
        return contador;
    }

    /**
     * 100/100
     * https://codility.com/demo/results/demoAB65TJ-XTB/
     */
    public static int solution3(int X, int Y, int D) {

        return (int) Math.ceil((Y - X) / (float)D);

    }

}
