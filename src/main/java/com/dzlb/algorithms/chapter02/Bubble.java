package com.dzlb.algorithms.chapter02;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by wuhai on 2018/1/25.
 */
public class Bubble extends SortExample{

    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            for(int j=N-1;j>i;j--){
              if(less(a[j],a[j-1])){
                  exch(a,j,j-1);
              }
             }
//            for(int j=0;j<N-i-1;j++){
//                if(!less(a[j],a[j+1])){
//                    exch(a,j,j+1);
//                }
//            }
        }
    }

    /**
     * 只用一个循环实现
     * @param a
     */
    public static void sort02(Comparable[] a){
        int N = a.length;
        int i = 0;
        for(int j = N-1;j > i;j--){
            if(less(a[j],a[j-1])){
                exch(a,j,j-1);
            }
            if(j == i + 1 && i < N-1){
                ++i;
                j = N;//此处使用N , 是因为每一次循环结束后要执行一次j--
            }
        }
    }
    public static void main(String[] args){
        Integer[] a = {12,10,26,45,34,36,48,58,1,35,20};
        show(a);
        StdOut.println(isSorted(a));
        sort02(a);
        show(a);
        StdOut.println(isSorted(a));

    }
}
