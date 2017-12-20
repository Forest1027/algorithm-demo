package com.forest.chapter1_3;

import java.util.Iterator;

/**
 * @author: rxl
 * @Date: Created in 2017/12/20 13:36
 * @Description: 变容栈-十分重要
 * 注意：size和cap(volume)需要区分开。
 * size是目前栈内装了多少元素，cap是栈的容量，能装多少元素。
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    /**
     * stack entries
     */
    public Item[] a = (Item[]) new Object[1];

    /**
     * size
     */
    private int N = 0;

    /**
     * 添加元素
     *
     * @param item
     */
    public void push(Item item) {
        //添加前检查数组容量是否足够
        if (this.isFull()) {
            //满了，将长度增加一半
            this.reSize(2 * a.length);
        }
        //先将传进来的值赋给对应元素，然后将N(size)增加一个
        a[N++] = item;
    }

    /**
     * 删除元素
     *
     * @return
     */
    public Item pop() {
        Item item = a[--N];

        /**
         *  避免对象游离:
         *  java的垃圾回收策略是回收所有无法被访问的对象的内存。
         *  此时被删掉的这个对象已经无法再被访问，但是它的引用实际上还存在于数组中。
         *  因此，除非手动将其值用null覆盖，不然垃圾回收器无法知道该对象已经无法被访问。
         */
        a[N] = null;

        //删除前检查数组容量是否过大，以1/4作为判断基准
        if (N == a.length / 4) {
            this.reSize(a.length / 2);
        }
        //数组中索引最大值为N(size)-1
        return item;
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

    /**
     * 判断栈是否已满
     */
    public boolean isFull() {
        return a.length == N;
    }

    /**
     * 改变数组大小
     */
    public void reSize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseIterator<>();
    }

    private class ReverseIterator<Item> implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            //先进后出
            return (Item) a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
