package com.forest.chapter1;

/**
 * @author: rxl
 * @Date: Created in 2017/12/7 16:17
 * @Description: 二分查找
 */
public class Demo1 {
    public static void main(String[] args) {


    }

    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid]) {
                //"-1"或"+1"的原因：a[mid]原本就与key的值不等，就没有必要再比较一次了。
                //"-1"或"+1"实际上是再新一轮的比较重排除了a[mid]的值
                high = mid-1;
            }
            if (key > a[mid]) {
                low = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
