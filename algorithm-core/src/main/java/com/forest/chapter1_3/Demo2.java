package com.forest.chapter1_3;

import org.junit.Test;

/**
 * @author: rxl
 * @Date: Created in 2017/12/20 14:36
 * @Description: 链表栈-相关测试用例
 */
public class Demo2 {
    /**
     * 链表结构增删快
     */
    @Test
    public void test1() {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        first.item = "num1";
        second.item = "num2";
        third.item = "num3";
        first.next = second;
        second.next = third;
        System.out.println(first);
        System.out.println("--------------------");
        Node newSec = new Node();
        newSec.item = "newSec";
        first.next = newSec;
        newSec.next = second;
        System.out.println(first);
    }

    /*
     *遍历
     */
    @Test
    public void test2() {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        first.item = "num1";
        second.item = "num2";
        third.item = "num3";
        first.next = second;
        second.next = third;
        //问题的关键在于，找到链表的首
        for (Node x = first; x!=null;x=x.next) {
            System.out.println(x.item);
        }
    }

    /**
     * 链表栈增删功能
     */
    @Test
    public void test3() {
        LinkedListStack<String> lls = new LinkedListStack<>();
        lls.push("l1");
        lls.push("l2");
        lls.push("l3");
        lls.push("l4");
        System.out.println(lls.pop());
        System.out.println(lls.pop());
        System.out.println(lls.pop());
        System.out.println(lls.pop());
        System.out.println(lls.pop());
    }
}