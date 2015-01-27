package com.maq.codility;

/**
 * Created by mquintas on 1/27/2015.
 */
public class FrogJmp {

    public static void main(String[] args) {

        solution(10, 85, 30);

    }

    /**
     * First approach. Not efficient. 44/100
     * https://codility.com/demo/results/demo9TPBB6-V48/
     * @param X
     * @param Y
     * @param D
     * @return
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

}
