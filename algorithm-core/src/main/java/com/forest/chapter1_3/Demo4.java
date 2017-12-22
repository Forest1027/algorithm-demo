package com.forest.chapter1_3;

import org.junit.Test;

import java.util.Iterator;

/**
 * @author: rxl
 * @Date: Created in 2017/12/21 15:51
 * @Description: 1.3课后练习选做
 */
public class Demo4 {
    /**
     * 1.3.19: 删除链表的尾结点，首节点为first
     */
    @Test
    public void test1() {
        Queue queue = new Queue();
        queue.enqueue("s1");
        queue.enqueue("s2");
        queue.enqueue("s3");
        queue.enqueue("s4");
        queue.enqueue("s5");
        getQueueEle(queue);
        System.out.println("-----------");
        queue.dequeueLastEle();
        getQueueEle(queue);
    }

    /**
     * 1.3.31: 双向列表测试
     */
    @Test
    public void test2() {
        QueueDouble qd = new QueueDouble();
        qd.enqueue("s1");
        qd.enqueue("s2");
        qd.enqueue("s3");
        qd.enqueue("s4");
        getQueueEle(qd);
        System.out.println("--------");
        qd.enqueueBegin("begin");
        getQueueEle(qd);
        System.out.println("--------");
        Object dequeue = qd.dequeue();
        getQueueEle(qd);
        System.out.println(dequeue + "--------");
        Object dequeueEnd = qd.dequeueEnd();
        getQueueEle(qd);
        System.out.println(dequeueEnd + "==========");
    }

    /**
     * 遍历队列
     */
    public void getQueueEle(Queue queue) {
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void getQueueEle(QueueDouble queue) {
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
