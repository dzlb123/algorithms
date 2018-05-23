package com.dzlb.algorithms.chapter02.myImplements;

import com.dzlb.algorithms.chapter02.SortExample;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author WuHaiTao
 * @create 2018/4/28 15:11
 * @desc
 */
public class Bubble extends SortExample {

    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }
    }

}
