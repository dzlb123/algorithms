package com.dzlb.algorithms.chapter02;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by wuhai on 2018/1/25.
 */
public class SortExample {

    public static void sort(Comparable[] a){
        //TODO 请实现自己的排序算法
    }

    /**
     * compare , if v < w ,return true
     * @param v
     * @param w
     * @return
     */
    protected static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    /**
     * exchange index i's value  and index j's value in array a
     * @param a
     * @param i
     * @param j
     */
    protected static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * print all items in a line
     * @param a
     */
    protected static void show(Comparable[] a){
        for(int i=0;i<a.length;i++){
            StdOut.printf(a[i] + "\t");
        }
        StdOut.println();
    }

    /**
     *vertify array is sorted
     * @param a
     * @return
     */
    protected static boolean isSorted(Comparable[] a){
        for(int i=1;i<a.length;i++){
            if(less(a[i],a[i-1])) {
                return false;
            }
        }
        return true;
    }

}
