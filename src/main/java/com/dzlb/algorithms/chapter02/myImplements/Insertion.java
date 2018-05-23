package com.dzlb.algorithms.chapter02.myImplements;

import com.dzlb.algorithms.chapter02.SortExample;

/**
 * @author WuHaiTao
 * @create 2018/4/28 16:17
 * @desc
 */
public class Insertion extends SortExample {

    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
    }

}
