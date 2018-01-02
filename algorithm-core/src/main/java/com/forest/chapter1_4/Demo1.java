package com.forest.chapter1_4;

import edu.princeton.cs.algs4.Stopwatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: rxl
 * @Date: Created in 2017/12/22 17:04
 * @Description: 1.4.2.1举例 ThreeSum
 */
public class Demo1 {
    public static int count(Object[] a) {
        //统计和为0的元组的数量
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if ((Integer)a[i] + (Integer)a[j] + (Integer)a[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\其他文档\\books\\algs4-data\\1Mints.txt"));
            String str = null;
            Integer num = null;
            List<Integer> list = new ArrayList<>();
            while ((str = br.readLine())!=null) {
                list.add(Integer.parseInt(str.trim()));
            }
            Object[] a = list.toArray();
            Stopwatch timer = new Stopwatch();
            int count = count(a);
            double time = timer.elapsedTime();
            System.out.println(count+"-------------"+time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
