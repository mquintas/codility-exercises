package com.maq.codewars;

import java.util.Arrays;

public class SortTheGiftCode {


    public static void main(String[] args) {

        System.out.println(sortGiftCode(""));
        System.out.println(sortGiftCode("fedcba"));
        System.out.println(sortGiftCode("zyxwvutsrqponmlkjihgfedcba"));
    }

    private static String sortGiftCode(String code) {

        char[] codeArr = code.toCharArray();
        Arrays.sort(codeArr);

        return new String(codeArr);
    }

}
