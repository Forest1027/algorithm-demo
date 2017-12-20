package com.forest.chapter1_1;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

/**
 * @author: rxl
 * @Date: Created in 2017/12/8 11:24
 * @Description: chapter1课后练习-基础练习选做
 */

public class Demo1 {
    /**
     * 1.1.1
     */
    @Test
    public void test1() {
        boolean b = true && false;
        System.out.println(b);
    }

    /**
     * 1.1.7
     */
    @Test
    public void test2() {
        double t = 9.0;
        StdOut.printf("%.5f\n", t);//9.00000
    }

    /**
     * 1.1.9-十进制转二进制
     */
    @Test
    public void test3() {
        int num = 3;
        String s = "";
        while (num > 0) {
            s = (num % 2) + s;
            num /= 2;
        }
        System.out.println(s);
    }

    /**
     * 1.1.13-转置
     */
    @Test
    public void test4() {
        int m = 5;
        int n = 4;
        //
        String[][] arr = new String[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = "a" + i + j;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------");

        String[][] arr1 = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = arr[j][i];
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
