package com.dzlb.algorithms.chapter01;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Administrator on 2017/12/28.
 */
public class MyTest01 {

    public static void main(String[] args){
        question118();
    }
    private static void question118(){
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char)('b' + 4));

    }

    private static void question115(){
        StdOut.println("Please input number size:");
        int size = StdIn.readInt();
        StdOut.println("input number size = " + size);
        StdOut.println("Please input numbers:");
        double[] numbers = new double[size];
        for(int i=0;i<size;i++){
            numbers[i] = StdIn.readDouble();
        }
        StdOut.println("input finished!");
        for(double d : numbers){
            if(d < 0.0 || d > 1.0){
                StdOut.println(false);
                return;
            }
        }
        StdOut.println(true);

    }

    private static int[] inputNumbers(){
        StdOut.println("Please input number size:");
        int size = StdIn.readInt();
        StdOut.println("input number size = " + size);
        StdOut.println("Please input numbers:");
        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i] = StdIn.readInt();
        }
        StdOut.println("input finished!");
        return numbers;
    }

    private static void questionThree(){
        int[] numbers = inputNumbers();
        int temp = numbers[0];
        for(int i : numbers){
            if(i != temp){
                StdOut.println("not equal");
                return;
            }
        }
        StdOut.println("equal");

    }

    private static void questionOneTwo(){
        StdOut.println(((0 + 15) / 2));//7
        StdOut.println((2.0e-6 * 100000000.1));//200.0000002 //这个不懂????
        StdOut.println((true && false || true && true));//true
        StdOut.println(((1 + 2.236)/2));//1.618
        StdOut.println((1+2+3+4.0));//10.0
        StdOut.println((4.1 >= 4));//true
        StdOut.println((1+2+"3"));//"33"
    }

}
