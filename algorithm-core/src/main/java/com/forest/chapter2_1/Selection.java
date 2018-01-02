package com.forest.chapter2_1;

/**
 * @author: rxl
 * @Date: Created in 2017/12/25 18:54
 * @Description: 选择排序
 */
public class Selection extends Example {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            //拿到数组的每个元素。遍历其后的元素，找到其中最小的一个，与索引为i的互换位置
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }
}
