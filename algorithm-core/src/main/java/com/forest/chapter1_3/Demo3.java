package com.forest.chapter1_3;

import org.junit.Test;

import java.util.Iterator;

/**
 * @author: rxl
 * @Date: Created in 2017/12/20 18:04
 * @Description: 队列以及背包的测试
 */
public class Demo3 {
    /**
     * 队列测试
     */
    @Test
    public void test1() {
        Queue q = new Queue();
        q.enqueue("q1");
        q.dequeue();
    }

    /**
     * 背包测试
     */
    @Test
    public void test2() {
        Bag<String> b = new Bag();
        b.add("b1");
        b.add("b2");
        b.add("b3");
        b.add("b4");
        b.add("b5");
        b.add("b6");
        Iterator iterator1 = b.iterator();
        while (iterator1.hasNext()) {
            String next = (String)iterator1.next();
            if (next.equals("b6")) {
                iterator1.remove();
            }
        }
        System.out.println("---------");
        Iterator iterator2 = b.iterator();
        while (iterator2.hasNext()) {
            String next = (String)iterator2.next();
            System.out.println(next);
        }
    }

}
