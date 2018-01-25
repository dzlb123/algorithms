package com.dzlb.algorithms.chapter02;

/**
 * Created by wuhai on 2018/1/25.
 */

import edu.princeton.cs.algs4.StdOut;

/**
 * 插入排序 , 升序
 */
public class Insertion extends SortExample{


    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
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
