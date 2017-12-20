package com.forest.chapter1_3;

/**
 * @author: rxl
 * @Date: Created in 2017/12/19 16:51
 * @Description: 定容栈-字符串
 */
public class FixedCapacityStackOfStrings {
    /**
     * stack entries
     */
    private String[] a;

    /**
     * size
     */
    private int N;

    /**
     * 构造器
     */
    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public void push(String item) {
        //先将传进来的值赋给对应元素，然后将N(size)增加一个
        a[N++] = item;
    }

    public String pop() {
        //数组中索引最大值为N(size)-1
        return a[--N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }
}
