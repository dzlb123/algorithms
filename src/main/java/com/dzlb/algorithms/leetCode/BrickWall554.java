package com.dzlb.algorithms.leetCode;

import java.util.*;

/**
 * @author WuHaiTao
 * @create 2018/5/23 15:37
 * @desc
 */
public class BrickWall554 {


    /**
     * 解题初步思路：
     * 1.边缘处排除掉
     * 2.分析后思路：计算每行中，从左到右砖块各种组合的和的集合，哪一个和在所有行中出现次数最多，则代表可以不穿过砖行最多，则穿过砖的个数就是最少的，不包含此和的行的数量，就是穿过砖的数量
     * @param wall
     * @return
     */
    public int leastBricks(List<List<Integer>> wall) {
        int ret = 0;
        if(wall == null){
            return -1;
        }
        //judge wall size
        Integer wallSize = wall.size();
        if(wallSize < 1 || wallSize > 10000){
            return -1;
        }
        //calculate different sum of bricks  each row
        Map<Long,Integer> sums = new HashMap<Long, Integer>();
        Integer bricksNum = 0;
        for(List<Integer> row : wall){
            if(row.size() < 1 || row.size() > 10000){
                return -1;
            }
            bricksNum += row.size();
            if(bricksNum > 20000){
                return -1;
            }
            Long sum = 0L;
            for(int i=0;i<row.size()-1;i++){
                sum += row.get(i);
                if(sum > Integer.MAX_VALUE){
                    return -1;
                }
                if(sums.containsKey(sum)){
                    sums.put(sum,sums.get(sum) + 1);
                }else{
                    sums.put(sum,1);
                }
            }
        }

        //find max num in sums
        Integer maxSum = 0;
        Set<Long> keys = sums.keySet();
        for(Long key : keys){
            maxSum = Math.max(maxSum,sums.get(key));
        }
        //calculate crossed bricks
        ret = wallSize - maxSum;
        return ret;
    }

    /**
     * 去除校验信息，速度可提升一点
     * @param wall
     * @return
     */
    public int leastBricksNojudge(List<List<Integer>> wall){
        if(wall == null){
            return -1;
        }
        //judge wall size
        Integer wallSize = wall.size();
        if(wallSize < 1 || wallSize > 10000){
            return -1;
        }
        //calculate different sum of bricks  each row
        Map<Long,Integer> sums = new HashMap<Long, Integer>();
        for(List<Integer> row : wall){
            Long sum = 0L;
            for(int i=0;i<row.size()-1;i++){
                sum += row.get(i);
                if(sums.containsKey(sum)){
                    sums.put(sum,sums.get(sum) + 1);
                }else{
                    sums.put(sum,1);
                }
            }
        }

        //find max num in sums
        Integer maxSum = 0;
        Set<Long> keys = sums.keySet();
        for(Long key : keys){
            maxSum = Math.max(maxSum,sums.get(key));
        }
        //calculate crossed bricks
        return wallSize - maxSum;
    }

    /**
     * 我的翻译：
     * 你面前有一堵砖砌的墙。这堵墙是方形的并且由多行砖组成。 这些砖高度相同但是宽度不同。你现在要画一条自顶向下的垂直线，要求垂直线穿过的砖的数量最少。
     *
     * 砖墙表示为一行一行的集合，每一行都是整数的集合，这些整数在墙上从左到右排列，整数的大小表示了砖的宽度。
     *
     * 如果你画的线从砖的边缘经过，不算穿过这块砖。你需要找出怎么画这条线，使得这条线穿过的砖的数量最少，并且返回穿过的砖的数量。
     *
     * 你画的线不能沿着砖墙的左右边缘垂直线划过，这样显然是没有穿过一块砖的。
     *
     * 例子:
     *
     * 输入:
     * [[1,2,2,1],
     *  [3,1,2],
     *  [1,3,2],
     *  [2,4],
     *  [3,1,2],
     *  [1,3,1,1]]
     * 输出: 2
     * 注释:
     *
     *
     *
     * 备注:
     *
     * 每一行砖的宽度之和应该相等，并且不能超过最大整数。
     * 每一行砖块的数量在 [1,10,000]范围内， 墙的高度在 [1,10,000]范围内， 总的砖块数量不能超过20,000。
     */

    /**
     * problem description:
     * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks. The bricks have the same height but different width. You want to draw a vertical line from the top to the bottom and cross the least bricks.
     *
     * The brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick in this row from left to right.
     *
     * If your line go through the edge of a brick, then the brick is not considered as crossed. You need to find out how to draw the line to cross the least bricks and return the number of crossed bricks.
     *
     * You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.
     *
     * Example:
     * Input:
     * [[1,2,2,1],
     *  [3,1,2],
     *  [1,3,2],
     *  [2,4],
     *  [3,1,2],
     *  [1,3,1,1]]
     * Output: 2
     * Explanation:
     *
     * Note:
     * The width sum of bricks in different rows are the same and won't exceed INT_MAX.
     * The number of bricks in each row is in range [1,10,000]. The height of wall is in range [1,10,000]. Total number of bricks of the wall won't exceed 20,000.
     */
}
