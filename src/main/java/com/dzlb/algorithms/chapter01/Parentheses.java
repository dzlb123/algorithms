package com.dzlb.algorithms.chapter01;

import edu.princeton.cs.algs4.Stack;

/**
 * Created by wuhai on 2018/1/22.
 */
public class Parentheses {

    private static final char LEFT_PAREN = '(';
    private static final char RIGHT_PAREN = ')';
    private static final char LEFT_BRACE = '[';
    private static final char RIGHT_BRACE = ']';
    private static final char LEFT_BRACKET = '{';
    private static final char RIGHT_BRACKET ='}';

    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == LEFT_PAREN) {
                stack.push(LEFT_PAREN);
            } else if (c == LEFT_BRACE) {
                stack.push(LEFT_BRACE);
            } else if (c == LEFT_BRACKET) {
                stack.push(LEFT_BRACKET);
            } else if (c == RIGHT_PAREN) {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.pop() != LEFT_PAREN) {
                    return false;
                }
            } else if (c == RIGHT_BRACE) {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.pop() != LEFT_BRACE) {
                    return false;
                }
            } else if (c == RIGHT_BRACKET) {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.pop() != LEFT_BRACKET) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }



}
