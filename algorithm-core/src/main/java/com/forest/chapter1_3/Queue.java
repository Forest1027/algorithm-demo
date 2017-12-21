package com.forest.chapter1_3;

/**
 * @author: rxl
 * @Date: Created in 2017/12/20 17:46
 * @Description: 先进先出队列-链表实现
 */
public class Queue<Item> {
    private Node first;
    private Node last;
    private int N;

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
}
