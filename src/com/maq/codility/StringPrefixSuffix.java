package com.maq.codility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcelo on 01/02/2015.
 */
public class StringPrefixSuffix {


    public static void main(String[] args) {

        System.out.println(solution1("abbabba"));
        System.out.println(solution1("ABB1ABBA"));
        System.out.println(solution1("codility"));
        System.out.println(solution2("abbabba"));
        System.out.println(solution2("codility"));
    }

    public static int solution1(String S) {

        int ret = 0;
        List<String> prefijos = new ArrayList<String>();
        for (int i = 0; i < S.length(); i++) {
            prefijos.add(S.substring(0, i));
        }
        System.out.println(prefijos);
        List<String> sufijos = new ArrayList<String>();
        for (int j = S.length(); j > 0; j--) {
            sufijos.add(S.substring(j, S.length()));
        }
        System.out.println(sufijos);

        for (String s : prefijos) {
            System.out.println("s: " + s);
            if (sufijos.contains(s)) {
                int size = s.length();
                ret = size > ret ? size : ret;
            }
        }
        return ret;
    }

    public static int solution2(String S) {

        int ret = 0;
        for (int i = 0; i < S.length(); i++) {
            String pre = S.substring(0, i);
            String suf = S.substring(S.length() - i, S.length());
            if (pre.equals(suf)) {
                int size = pre.length();
                ret = size > ret ? size : ret;
            }
        }
        return ret;
    }

}
