package com.dzlb.algorithms.leetCode;

public class LargestRectangleInHistogram {

    /**
     * 直方图中找出最大面积矩形
     * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
     *
     *
     *
     *
     * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
     *
     *
     *
     *
     * The largest rectangle is shown in the shaded area, which has area = 10 unit.
     *
     *
     *
     * Example:
     *
     * Input: [2,1,5,6,2,3]
     * Output: 10
     */

    public static void main(String[] args) {
        LargestRectangleInHistogram l = new LargestRectangleInHistogram();
        int[] h = {2,1,2};
        int ret = l.largestRectangleArea(h);
        System.out.println(ret);
    }

    public int largestRectangleArea(int[] heights) {
        int ret = 0;
        for(int i = 0; i < heights.length; i++){
            ret = Math.max(ret,getNowLargest(heights,i));
        }
        return ret;
    }

    public int getNowLargest(int[] heights,int index){
        int nowNum = heights[index];
        int length = 1;
        for(int i = index + 1; i < heights.length; i++){
            if(heights[i] < nowNum){
                break;
            }
            length++ ;
        }
        for(int i = index - 1;i >= 0;i--){
            if(heights[i] < nowNum){
                break;
            }
            length++ ;
        }
        return nowNum * length;
    }

}
