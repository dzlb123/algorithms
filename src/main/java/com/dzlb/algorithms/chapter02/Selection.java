package com.dzlb.algorithms.chapter02;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by wuhai on 2018/1/25.
 */

/**
 * 选择排序 , 升序
 */
public class Selection extends SortExample{

    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int min = i;
            for(int j=i+1;j<N;j++){
                if(less(a[j],a[min])){
                    min = j;
                }
            }
            exch(a,i,min);
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
