package com.forest.chapter1_1;


import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * @author: rxl
 * @Date: Created in 2017/12/7 16:17
 * @Description: 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\其他文档\\books\\algs4-data\\largeW.txt"));
            String num = null;
            int i = 0;
            int[] whiteList = new int[1000000];
            while ((num = br.readLine()) != null) {
                whiteList[i] = Integer.parseInt(num.trim());
                i++;
            }
            Arrays.sort(whiteList);

            br = new BufferedReader(new FileReader("D:\\其他文档\\books\\algs4-data\\largeT.txt"));
            int key = 0;
            int count = 0;
            long start = System.currentTimeMillis();
            while ((num = br.readLine()) != null) {
                key = Integer.parseInt(num.trim());
                int rank = rank1(key, whiteList);
                if (rank < 0) {
                    System.out.println("whitelist does not contain: " + key);
                    count++;
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("Number that account message does not contain: "+count);
            System.out.println("finish time: "+(end-start));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\其他文档\\books\\algs4-data\\largeW.txt"));
            String num = null;
            int i = 0;
            int[] whiteList = new int[1000000];
            while ((num = br.readLine()) != null) {
                whiteList[i] = Integer.parseInt(num.trim());
                i++;
            }
            Arrays.sort(whiteList);

            br = new BufferedReader(new FileReader("D:\\其他文档\\books\\algs4-data\\largeT.txt"));
            int key = 0;
            int count = 0;
            long start = System.currentTimeMillis();
            while ((num = br.readLine()) != null) {
                key = Integer.parseInt(num.trim());
                int rank = rank2(key, whiteList);
                if (rank < 0) {
                    System.out.println("whitelist does not contain: " + key);
                    count++;
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("Number that account message does not contain: "+count);
            System.out.println("finish time: "+(end-start));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //binary search
    public static int rank1(int key, int[] a) {
        //数组必须是有序的
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid]) {
                //"-1"或"+1"的原因：a[mid]原本就与key的值不等，就没有必要再比较一次了。
                //"-1"或"+1"实际上是再新一轮的比较重排除了a[mid]的值
                high = mid - 1;
            }else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //brutal search
    public static int rank2(int key,int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (key==a[i]) {
                return i;
            }
        }
        return -1;
    }
}
