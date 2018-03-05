package com.dzlb.algorithms.chapter02;

import edu.princeton.cs.algs4.StdRandom;

/**
 * 快速排序 , 理论速度低于希尔 , 但实际快一些
 * 综合时间和空间平衡较好的算法
 * 比如 , 在初始状态下，数字6在序列的第1位。我们的目标是将6挪到序列中间的某个位置，假设这个位置是k。
 * 现在就需要寻找这个k，并且以第k位为分界点，左边的数都小于等于6，右边的数都大于等于6。
 * 然后以k为分界点递归拆分 , 再排序 , 直到完成
 * Created by wuhai on 2018/2/2.
 */
public class Quick extends SortExample {


    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a , int lo , int hi){
        if(hi <= lo){
            return;
        }
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);

    }

    /**
     *
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    private static int partition(Comparable[] a , int lo , int hi){
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true){
            while(less(a[++i],v)){
                if(i == hi){
                    break;
                }
            }
            while (less(v,a[--j])){
                if(j == lo){
                    break;
                }
            }
            if(i >= j){
                break;
            }
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

}
