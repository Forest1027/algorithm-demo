package com.forest.chapter1_3;

import java.util.Iterator;

/**
 * @author: rxl
 * @Date: Created in 2017/12/21 17:14
 * @Description: 基于双向链表实现的队列
 */
public class QueueDouble<Item> implements Iterable{
    private DoubleNode first;
    private DoubleNode last;
    private int N;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    //向链尾追加元素
    public void enqueue(Item item) {
        DoubleNode oldLast = last;
        last = new DoubleNode();
        last.item = item;
        if (isEmpty()) {
            //第一次添加元素
            first = last;
        } else {
            oldLast.next = last;
            last.previous = oldLast;
        }
        N++;
    }

    //从链头添加元素
    public void enqueueBegin(Item item) {
        DoubleNode oldFirst = first;
        first = new DoubleNode();
        first.item = item;
        if (isEmpty()) {
            last = first;
        } else {
            first.next = oldFirst;
            oldFirst.previous = first;
        }
        N++;
    }

    //从表头删除节点
    public Item dequeue() {
        Item item = (Item) first.item;
        first = first.next;
        if (first != null) {
            first.previous = null;
        } else {
            last = null;
        }
        N--;
        return item;
    }

    //从表尾删除节点
    public Item dequeueEnd() {
        Item item = (Item) last.item;
        last = last.previous;
        if (last != null) {
            last.next = null;
        } else {
            first = null;
        }
        N--;
        return item;
    }

    /*//在指定节点前插入新节点
    public void addBefore(Item older, Item newer) {
        DoubleNode temp = first;
        DoubleNode newNode = new DoubleNode();
        while (first != null && first.next != null) {
            if (temp.item.equals(older)) {
                DoubleNode previous = temp.previous;
                newNode.item = newer;
                newNode.next = temp;
                newNode.previous = previous;
                previous.next = newNode;
                temp.previous = newNode;
            }
            temp = temp.next;
        }
        if (newNode == null) {
            throw new RuntimeException("无此元素");
        }
        N++;
    }

    //在指定节点后插入新节点
    public void addAfter(Item older, Item newer) {
        DoubleNode temp = first;
        DoubleNode newNode = new DoubleNode();
        while (first != null && temp.next != null) {
            if (temp.item.equals(older)) {
                DoubleNode next = temp.next;
                newNode.previous = temp;
                newNode.next = next;
                temp.next = newNode;
                next.previous = newNode;
            }
            temp = temp.next;
        }
        if (newNode == null) {
            throw new RuntimeException("无此元素");
        }
        N++;
    }

    //删除制定节点
    public void delete(Item item) {
        DoubleNode temp = first;
        while (first != null && first.next != null) {
            if (temp.item.equals(item)) {
                DoubleNode previous = temp.previous;
                DoubleNode next = temp.next;
                previous.next = next;
                next.previous = previous;
            }
        }
        N--;
    }*/

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator {
        private DoubleNode current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item = (Item) current.item;
            current = current.next;
            return item;
        }
    }
}
