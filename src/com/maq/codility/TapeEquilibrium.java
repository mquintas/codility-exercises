package com.maq.codility;

import java.math.BigInteger;

/**
 * Created by mquintas on 1/30/2015.
 */
public class TapeEquilibrium {

    public static void main(String[] args) {

//        int[] A = {3,1};
        int[] A = {3,1,2,4,3};
        System.out.println(solution2(A));

    }

    /**
     *  83/100
     *  https://codility.com/demo/results/demoTCWDA4-KKG/
     */
    public static int solution(int[] A) {

        int minimo = Integer.MAX_VALUE;
        long izquierda = 0;
        long derecha = 0;
        for (int i = 0; i < A.length-1; i++) {
            izquierda = izquierda + (A[i]);
        }
        for (int j = A.length - 1; j >= 0; j--) {

            izquierda = izquierda - (A[j]) ;
            if (j + 1 < A.length) {
                derecha = derecha+ (A[j]);
            }

            long diff = Math.abs(izquierda - derecha);
//            System.out.println("izquierda: "+izquierda);
//            System.out.println("derecha: "+derecha);
//            System.out.println("P="+j +" - diff: "+diff);
            if (diff < minimo) {
                minimo = (int) diff;
            }
        }
        return minimo;
    }

    /**
     * 91/100
     * https://codility.com/demo/results/demoTH2SK5-SCH/
     */
    public static int solution2(int[] A) {

        int minimo = Integer.MAX_VALUE;
        long izquierda = 0;
        long derecha = 0;

        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        for (int i = 0; i < A.length-1; i++) {
            izquierda = izquierda + (A[i]);
        }
        for (int j = A.length - 1; j >= 0; j--) {

            izquierda = izquierda - (A[j]) ;
            if (j + 1 < A.length) {
                derecha = derecha+ (A[j]);
            }

            long diff = Math.abs(izquierda - derecha);
            System.out.println("izquierda: "+izquierda);
            System.out.println("derecha: "+derecha);
            System.out.println("P="+j +" - diff: "+diff);
            if (diff < minimo) {
                minimo = (int) diff;
            }
        }
        return minimo;
    }


    /**
     * 91/100
     * https://codility.com/demo/results/demo7MV6GK-KQH/
     */
    public static int solution3(int[] A) {

        int minimo = Integer.MAX_VALUE;
        long izquierda = 0;
        long derecha = 0;

        if (A.length == 1) {
            return Math.abs(A[0]);
        } else if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        for (int i = 0; i < A.length-1; i++) {
            izquierda = izquierda + (A[i]);
        }
        for (int j = A.length - 1; j >= 0; j--) {

            izquierda = izquierda - (A[j]) ;
            if (j + 1 < A.length) {
                derecha = derecha+ (A[j]);
            }

            long diff = Math.abs(izquierda - derecha);
            System.out.println("izquierda: "+izquierda);
            System.out.println("derecha: "+derecha);
            System.out.println("P="+j +" - diff: "+diff);
            if (diff < minimo) {
                minimo = (int) diff;
            }
        }
        return minimo;
    }

}
