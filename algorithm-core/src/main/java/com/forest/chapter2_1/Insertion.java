package com.forest.chapter2_1;

/**
 * @author: rxl
 * @Date: Created in 2018/1/2 17:22
 * @Description:
 */
public class Insertion extends Example{
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            //取到每一个元素。让该元素与前一个元素比较大小，该元素比较小的话，就交换位置。
            for (int j = i; j >0 && less(a[j],a[j-1]); j--) {
                exch(a,j,j-1);
            }
        }
    }
}
