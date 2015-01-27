package com.maq.codility;

import java.math.BigInteger;

/**
 * Created by mquintas on 1/27/2015.
 */
public class Equi {

    public static void main(String[] args) {

        int[] A = {-1, 3, -4, 5, 1, -6, 2, 1};
        System.out.println(solution(A));
        System.out.println(solution2(A));
    }

    /**
     * First approach with score 44/100
     * @param A
     * @return
     */
    public static int solution(int[] A) {

        int counterAux = 0;
        int returne = -1;

        for (int i = 0; i < A.length; i++) {
            counterAux = i;
            BigInteger derecha   = new BigInteger(String.valueOf(0));
            BigInteger izquierda = new BigInteger(String.valueOf(0));

            for (int j = i+1 ; j< A.length; j++){
                derecha = derecha.add(BigInteger.valueOf(A[j]));
            }
            for (int j = i-1 ; j==0; j--){
                izquierda = izquierda.add(BigInteger.valueOf(A[j]));
            }
            if(derecha.equals(izquierda)){
                returne = counterAux;
                break;
            }
        }
        return returne;
    }

    /**
     * Second approach, more efficient. 100/100
     * https://codility.com/demo/results/demo9XJX85-UCS/
     * @param A
     * @return
     */
    public static int solution2(int[] A) {

        int returne=-1;
        BigInteger derecha   = new BigInteger(String.valueOf(0));
        BigInteger izquierda = new BigInteger(String.valueOf(0));

        for (int i = 0; i < A.length; i++) {
            izquierda = izquierda.add(BigInteger.valueOf(A[i]));
        }
        for (int j = A.length-1 ; j >= 0; j--){

            izquierda = izquierda.subtract(BigInteger.valueOf(A[j]));
            if (j+1 < A.length) {
                derecha = derecha.add(BigInteger.valueOf(A[j+1]));
            }

            if(derecha.equals(izquierda)){
                System.out.println("equilibrio en "+j);
                returne = j;
                break;
            }
        }
        return returne;
    }


}
