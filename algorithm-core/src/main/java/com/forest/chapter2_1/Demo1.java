package com.forest.chapter2_1;

import org.junit.Test;

/**
 * @author: rxl
 * @Date: Created in 2017/12/8 14:28
 * @Description:
 */
public class Demo1 {
    @Test
    public void test1() {
        Selection selection = new Selection();
        Integer[] arr = {2, 1, 7, 4, 9};
        print(arr);
        System.out.println("----------");
        selection.sort(arr);
        print(arr);
    }

    public void print(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
