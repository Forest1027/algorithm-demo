package com.forest.chapter1_3;

import java.util.Stack;

/**
 * @author: rxl
 * @Date: Created in 2017/12/19 14:16
 * @Description: Dijkstra双栈算术表达式算法
 */
public class Dijkstra {
    public static double getResult(String s) {
        //创建一个存储操作符的栈
        Stack<String> ops = new Stack<>();
        //创建一个存储数值的栈
        Stack<Double> vals = new Stack<>();
        String str = "";
        //遍历输入的算式
        for (int i = 0; i < s.length(); i++) {
            str = s.charAt(i) + "";
            //如果是“(”则忽略
            if (str.equals("(")) {

            } else if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("sqrt")) {
                //遇到运算符，则存进ops栈内
                ops.push(str);
            } else if (str.equals(")")) {
                //遇到“)”，则弹出运算符，数值，进行一次运算。
                String op = ops.pop();
                Double val = vals.pop();
                if (op.equals("+")) {
                    val = vals.pop() + val;
                } else if (op.equals("-")) {
                    val = vals.pop() - val;
                } else if (op.equals("*")) {
                    val = vals.pop() * val;
                } else if (op.equals("/")) {
                    val = vals.pop() / val;
                } else if (op.equals("sqrt")) {
                    val = Math.sqrt(val);
                }
                //将运算后的数值存进栈
                vals.push(val);
            } else {
                //不是运算符也不是括号，那么就是数字了
                vals.push(Double.parseDouble(str));
            }
        }
        return vals.pop();
    }
}
