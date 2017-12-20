package com.forest.chapter1_3;

import lombok.ToString;

/**
 * @author: rxl
 * @Date: Created in 2017/12/20 14:34
 * @Description: 链表-结点
 */
@ToString
public class Node<Item> {
    Item item;
    Node<Item> next;
}
