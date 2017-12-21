package com.forest.chapter1_3;

import java.util.Iterator;

/**
 * @author: rxl
 * @Date: Created in 2017/12/21 10:09
 * @Description:
 */
public class Bag<Item> implements Iterable {
    private Node first;

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

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

        @Override
        public void remove() {
            if (first == null) {
                throw new RuntimeException("包为空，无元素可删除");
            }
            Node former = getFormer(getFormer(current));
            if (former == null) {
                //此时要删除的值是链表中的第一个值
                first = first.next;
            } else {
                former.next = current;
            }
        }

    }

    //遍历，拿到next为former的node
    public Node getFormer(Node node) {
        Node temp = first;
        while (first != null && temp.next != null) {
            Node next = temp.next;
            if (next.equals(node)) {
                return temp;
            }
            temp = next;
        }
        //程序会进行到以下部分，有两种情况。
        //当node为空，上述循环一定会进行到temp.next = null的时候
        if (node == null) {
            //处理移除链表最后一个元素的情况
            return temp;
        } else {
            //处理移除链表第一个元素的情况
            return null;
        }
    }
}
