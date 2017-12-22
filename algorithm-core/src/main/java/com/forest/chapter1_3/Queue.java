package com.forest.chapter1_3;

import java.util.Iterator;

/**
 * @author: rxl
 * @Date: Created in 2017/12/20 17:46
 * @Description: 先进先出队列-链表实现
 */
public class Queue<Item> implements Iterable {
    private Node first;
    private Node last;
    private int N;

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator {
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        //从链尾加元素
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            //如果是第一次添加
            first = last;
        } else {
            oldLast.next = last;
        }
        N++;
    }

    public Item dequeue() {
        //从表头删除元素
        Item item = first.item;
        first = first.next;
        N--;
        if (isEmpty()) {
            last = null;
        }

        return item;
    }

    //练习1.3.9：删除链表的尾结点，首节点为first
    public Item dequeueLastEle() {
        //从表尾删除元素
        Item item = last.item;
        /**
         * 不能简单地将last指定为null。
         * last的前一个元素的next指定到last原本的地址。
         * 将last指定为null，并没有改变其原有地址的值。
         * 所以要想办法改变的是，last前一个元素的next引用
         */
        //last = null;
        Node temp = first;
        while (temp.next != null) {
            if (temp.next.equals(last)) {
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        return item;
    }

}
