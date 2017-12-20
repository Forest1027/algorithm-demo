package com.forest.chapter1_3;

import lombok.ToString;

/**
 * @author: rxl
 * @Date: Created in 2017/12/20 15:43
 * @Description:
 */
public class LinkedListStack<Item> {
    //栈顶元素
    Node first;
    //栈内元素个数
    private int N;

    @ToString
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

    public void push(Item item) {
        //向栈顶添加元素
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }
}
