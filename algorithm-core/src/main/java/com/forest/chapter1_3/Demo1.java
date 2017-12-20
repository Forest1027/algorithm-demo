package com.forest.chapter1_3;

import org.junit.Test;

import java.util.Iterator;

/**
 * @author: rxl
 * @Date: Created in 2017/12/19 17:04
 * @Description: 数组栈-相关测试用例
 */
public class Demo1 {
    /**
     * Dijkstra双栈算术表达式算法
     * 注：此法需要根据逻辑需求添加括号作为标识
     */
    @Test
    public void test1() {
        double result = Dijkstra.getResult("(1+((2+3)*(4*5)))");
        System.out.println(result);
    }

    /**
     * 定容栈测试1
     */
    @Test
    public void test2() {
        //会引发索引越界异常
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(2);
        s.push("s1");
        s.push("s2");
        s.push("s3");
    }

    /**
     * 定容栈测试2
     */
    @Test
    public void test3() {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
        String source = "to be or not to - be - - that - - - is";
        String[] split = source.split(" ");
        String item;
        for (int i = 0; i < split.length; i++) {
             item = split[i];
             if(!item.equals("-")) {
                 s.push(item);
             }else if(!s.isEmpty()) {
                 String pop = s.pop();
                 System.out.println(pop);
             }
        }
        System.out.println("("+s.size()+" left in stack)");
    }

    /**
     * 定容栈-任意类型
     */
    @Test
    public void test4() {
        FixedCapacityStack<String> s = new FixedCapacityStack<>(100);
        String source = "to be or not to - be - - that - - - is";
        String[] split = source.split(" ");
        String item;
        for (int i = 0; i < split.length; i++) {
            item = split[i];
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                System.out.println(s.pop());
            }
        }
        System.out.println("(" + s.size() + " left in stack)");
    }

    /**
     * 不定容栈
     */
    @Test
    public void test5() {
        ResizingArrayStack<String> ras = new ResizingArrayStack<>();
        ras.push("s1");
        ras.push("s2");
        ras.push("s3");
        ras.push("s4");
        printAllElements(ras.a);
        ras.pop();
        printAllElements(ras.a);
    }

    /**
     * 不定容栈-迭代器
     */
    @Test
    public void test6() {
         ResizingArrayStack<String>  ras = new ResizingArrayStack<>();
        ras.push("s1");
        ras.push("s2");
        ras.push("s3");
        ras.push("s4");
        ras.push("s5");
        ras.push("s6");
        ras.push("s7");
        ras.push("s8");
        Iterator<String> iterator = ras.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() );
        }
    }

    /**
     * 遍历数组
     */
    public void printAllElements(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
