package com.forest.chapter2_1;

/**
 * @author: rxl
 * @Date: Created in 2017/12/26 10:56
 * @Description:
 */
public abstract class Example {
    public abstract void sort(Comparable[] a);

    /**
     * 比较大小
     *
     * @param v
     * @param w
     * @return
     */
    public boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换位置
     *
     * @param a
     * @param i
     * @param j
     */
    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 遍历数组
     *
     * @param a
     */
    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * 判断是否有序（升序)
     *
     * @param a
     * @return
     */
    public boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (less(a[i + 1], a[i])) {
                return false;
            }
        }
        return true;
    }
}
