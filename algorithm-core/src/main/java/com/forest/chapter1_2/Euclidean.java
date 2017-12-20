package com.forest.chapter1_2;

import org.junit.Test;

/**
 * @author: rxl
 * @Date: Created in 2017/12/19 10:47
 * @Description: 欧几里德算法的java实现
 * 结论：gcd(a,b)=gcd(b,a%b)
 * 说明：定义 gcd(a,b) 为整数 a 与 b 的最大公约数；gcd-greatest common divisor
 */
public class Euclidean {
    @Test
    public void test() {
        int gcd = getGCD(121, 22);
        System.out.println(gcd);
    }

    //使用递归
    public int getGCD(int a, int b) {
        //取余
        int r = a % b;
        if (r > 0) {
            return getGCD(b, r);
        } else {
            //当r为0时，公约数就是b--->跳出递归
            return b;
        }
    }
}
