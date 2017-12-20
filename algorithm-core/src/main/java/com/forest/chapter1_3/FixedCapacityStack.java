package com.forest.chapter1_3;

/**
 * @author: rxl
 * @Date: Created in 2017/12/20 10:04
 * @Description: 定容栈-任意类型
 * 注意：size和cap(volume)需要区分开。
 * size是目前栈内装了多少元素，cap是栈的容量，能装多少元素。
 */
public class FixedCapacityStack<Item> {
    /**
     * stack entries
     */
    public Item[] a;

    /**
     * size
     */
    private int N;

    /**
     * 构造器
     */
    public FixedCapacityStack(int cap) {
        a = (Item[]) (new Object[cap]);
    }

    /**
     * 添加元素
     *
     * @param item
     */
    public void push(Item item) {
        a[N++] = item;
    }

    /**
     * 删除元素
     *
     * @return
     */
    public Item pop() {
        return a[--N];
    }

    /**
     * 判断是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * 获取栈已存储元素的个数
     *
     * @return
     */
    public int size() {
        return N;
    }

}
