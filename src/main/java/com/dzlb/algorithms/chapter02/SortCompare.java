package com.dzlb.algorithms.chapter02;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by Administrator on 2018/1/26.
 */
public class SortCompare {

    public static final String INSERTION = "Insertion";
    public static final String SELECTION = "Selection";
    public static final String BUBBLE = "Bubble";
    public static final String SHELL = "Shell";
    public static final String MERGE = "Merge";
    public static final String QUICK = "Quick";
    public static final String HEAP = "Heap";


    /**
     * 返回运行时间
     * @param alg
     * @param a
     * @return
     */
    public static double time(String alg,Comparable[] a){
        Stopwatch timer = new Stopwatch();
        if(alg.equals(INSERTION)){Insertion.sort(a);}
        if(alg.equals(SELECTION)){Selection.sort(a);}
        if(alg.equals(BUBBLE)){Bubble.sort(a);}
        if(alg.equals(SHELL)){Shell.sort(a);}
        if(alg.equals(MERGE)){Merge.sort(a);}
        if(alg.equals(QUICK)){Quick.sort(a);}
        if(alg.equals(HEAP)){}
        return timer.elapsedTime();
    }

    /**
     *
     * @param alg
     * @param N
     *          数组长度
     * @param T
     *          测试组数
     * @return
     */
    public static double timeRandomInput(String alg,int N,int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for(int t=0;t<T;t++){
            for(int i=0;i<N;i++){
                a[i] = StdRandom.uniform();
            }
            total += time(alg,a);
        }
        return total;
    }


    public static void main(String[] args){
        String alg1 = SHELL;//args[0];
        String alg2 = QUICK;//args[1];
        int N = 50000;//Integer.parseInt(args[2]);
        int T = 100;//Integer.parseInt(args[3]);
        double t1 = timeRandomInput(alg1,N,T);
        double t2 = timeRandomInput(alg2,N,T);
        StdOut.printf(" %s spends %.1f time \n",alg1,t1);
        StdOut.printf(" %s spends %.1f time \n",alg2,t2);
        StdOut.printf("For %d random Doubles\n    %s is",N,alg1);
        StdOut.printf(" %.1f times faster than %s\n",t2/t1,alg2);
    }

}
