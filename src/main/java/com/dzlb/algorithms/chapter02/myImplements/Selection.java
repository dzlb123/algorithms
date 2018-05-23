package com.dzlb.algorithms.chapter02.myImplements;

import com.dzlb.algorithms.chapter02.SortExample;

/**
 * @author WuHaiTao
 * @create 2018/4/28 17:17
 * @desc
 */
public class Selection extends SortExample {


    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(greater(a[i],a[j])){
                    exch(a,i,j);
                }
            }
        }
    }


}
