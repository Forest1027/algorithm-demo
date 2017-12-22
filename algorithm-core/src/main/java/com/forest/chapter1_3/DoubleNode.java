package com.forest.chapter1_3;

/**
 * @author: rxl
 * @Date: Created in 2017/12/21 17:11
 * @Description: 双向链表
 * 每个节点都有一个向前驱元素和一个向后续元素的引用
 */
public class DoubleNode<Item> {
    Item item;
    DoubleNode next;
    DoubleNode previous;
}
