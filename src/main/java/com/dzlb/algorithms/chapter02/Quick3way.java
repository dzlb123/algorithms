package com.dzlb.algorithms.chapter02;

import edu.princeton.cs.algs4.StdRandom;

/**
 * 快速排序的优化 , 三向切分的快速排序
 * 不光是大于和小于比较 , 多了等于的一部分
 * 在数组内存在大量重复数据的时候 , 效率远高于普通的快速排序
 * Created by wuhai on 2018/2/2.
 */
public class Quick3way extends SortExample{

    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a , int lo , int hi){
        if(hi <= lo){
            return;
        }
        int lt = lo;
        int i = lo+1;
        int gt = hi;
        Comparable v = a[lo];
        while(i <= gt){
            int cmp = a[i].compareTo(v);
            if(cmp < 0){
                exch(a,lt++,i++);
            }else if(cmp > 0){
                exch(a,i,gt--);
            }else{
                i++;
            }
        }
        sort(a,lo,lt - 1);
        sort(a,gt + 1,hi);
    }
}
