package com.maq.codility;

/**
 * Created by mquintas on 1/27/2015.
 */
public class FrogJmp {

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
