package com.forest.chapter2;

import org.junit.Test;

/**
 * @author: rxl
 * @Date: Created in 2017/12/8 14:28
 * @Description:
 */
public class Demo1 {
    @Test
    public void test1() {
        Comparable c = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

}
