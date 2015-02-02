package com.maq.codewars;

import com.sun.org.apache.xpath.internal.SourceTree;

public class ArithmeticSequence {
    /**
     * A sequence is usually a set or an array of numbers that has a strict way for moving from the nth term to the (n+1)th term.
     If f(n) = f(n-1) + c where c is a constant value, then f is an arithmetic sequence.
     An example would be (where the first term is 0 and the constant is 1) is [0, 1, 2, 3, 4, 5, ... and so on] )
     Else if (pun) f(n) = f(n-1) * c where c is a constant value, then f is a geometric sequence.
     Example where the first term is 2 and the constant is 2 will be [2, 4, 8, 16, 32, 64, ... to infinity ... ]
     There are some sequences that aren't arithmetic nor are they geometric.
     Here is a link to feed your brain : Sequence !

     You're going to write a function that's going to return the value in the nth index of an arithmetic sequence.(That is, adding a constant to move to the next element in the "set").

     The function's name is nthterm, it takes three inputs first,n,c where:

     first is the first value in the 0 INDEX.
     n is the index of the value we want.
     c is the constant added between the terms.
     Remember that first is in the index 0 .. just saying ...
     */
    public static void main(String[] args) {

        System.out.println("n=5, c=1 -> "+nthterm(0,5,1));
        System.out.println("n=5, c=1 -> "+nthterm(0,100,5));
        System.out.println("n=5, c=1 -> "+nthterm(14,4,7));
        System.out.println("n=5, c=1 -> "+nthterm(10000, 99, -50));

        System.out.println("n=5, c=1 -> "+nthterm2(0,5,1));
        System.out.println("n=5, c=1 -> "+nthterm2(0,100,5));
        System.out.println("n=5, c=1 -> "+nthterm2(14,4,7));
        System.out.println("n=5, c=1 -> "+nthterm2(10000, 99, -50));
    }

    /**
     * solucion recursiva
     */
    public static int nthterm(int first, int n, int c) {

        if (n == 0) return first;
        return nthterm(first, n-1, c) + c;

    }

    /**
     * solucion sin recursion
     */
    public static int nthterm2(int first, int n, int c) {

        return first + (n * c);

    }


}
