package com.maq.codility;

/**
 * Created by mquintas on 1/30/2015.
 */
public class PermMissingElem {

    /**
     * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
     Your goal is to find that missing element.
     Write a function:
     class Solution { public int solution(int[] A); }
     that, given a zero-indexed array A, returns the value of the missing element.
     For example, given array A such that:
     A[0] = 2
     A[1] = 3
     A[2] = 1
     A[3] = 5
     the function should return 4, as it is the missing element.
     Assume that:
     N is an integer within the range [0..100,000];
     the elements of A are all distinct;
     each element of array A is an integer within the range [1..(N + 1)].
     Complexity:
     expected worst-case time complexity is O(N);
     expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
     Elements of input arrays can be modified.
     *
     */
    public static void main(String[] args) {

        int[] A = {2,3,1,5};
        System.out.println(solution(A));
        int[] B = {2,3,1,5,4,7,8,9};
        System.out.println(solution(B));
    }

    /**
     * Score: 100/100
     * https://codility.com/demo/results/demo2N7TT3-MM7/
     * Detected time complexity: O(N) or O(N * log(N)) -> ya no tiene for anidados.
     */
    public static long solution(int[] A) {

            int[] B = new int[A.length+2];
            for (int i = 0 ; i < A.length ; i++) {
                B[A[i]] = 1;
            }
            for (int i = 1 ; i < B.length ; i++) {
                if(B[i] != 1)
                    return i;
            }
            //no deberia llegar aca.
            return 0;
    }

}
