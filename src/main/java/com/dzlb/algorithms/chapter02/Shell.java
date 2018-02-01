package com.dzlb.algorithms.chapter02;

import edu.princeton.cs.algs4.StdOut;

/**
 * 希尔排序 , 希尔排序的理念是 , 使用一个递减数 ,
 * 将数组不相邻的相同间隔的数进行 , 一次循环完成后 , 递减数控制间隔 , 直到相邻两个数排序
 * 经测试 , 笔记本上 , 希尔排序的速度快过选择排序和插入排序的20多倍,是冒泡排序的60倍左右
 * Created by wuhai on 2018/1/26.
 */
public class Shell extends SortExample {

    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while(h < N/3){
            h = 3 * h + 1;
        }
        while(h >= 1){
            for(int i = h; i < N; i++){
                for(int j = i; j >= h && less(a[j],a[j-h]); j -= h){
                    exch(a,j,j-h);
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] args){
        Integer[] a = {12,10,26,45,34,36,48,58,1,35,20};
        show(a);
        StdOut.println(isSorted(a));
        sort(a);
        show(a);
        StdOut.println(isSorted(a));

    }
}
