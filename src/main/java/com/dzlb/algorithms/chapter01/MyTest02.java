package com.dzlb.algorithms.chapter01;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by wuhai on 2018/1/22.
 */
public class MyTest02 {

    public static void main(String[] args){
        //question1_3_5();

    }

    public static void question1_3_5(){
        StdOut.println("Please input string:");
        String s = StdIn.readString().trim();
        StdOut.println("input finished!");
        StdOut.println(Parentheses.isBalanced(s));

    }



}
