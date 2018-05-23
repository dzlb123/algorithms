package com.dzlb.algorithms.chapter02.myImplements;

import com.dzlb.algorithms.chapter02.SortExample;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author WuHaiTao
 * @create 2018/4/28 16:19
 * @desc
 */
public class RunMethod extends SortExample {

    public static void main(String[] args){
        Integer[] a = {12,10,26,45,34,36,48,58,1,35,20};
        show(a);
        StdOut.println(isSorted(a));
        Selection.sort(a);
        show(a);
        StdOut.println(isSorted(a));

    }

}
