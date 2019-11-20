package com.leetcode.tengxuntop50.num136;

/**
 * @description:给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * @author: htb
 * @createDate: 2019/11/20
 * @version: 1.0
 */
public class Solution {
    /*
    思路   去重，得到一个list
    遍历这个list 相等则计数，计数>=2 的不要，只要计数等于1 的
     */
    public int singleNumber(int[] nums) {
        int toReturn = 0;
        for (int num : nums
        ) {
            int count = 0;
            for (int numToCompare : nums
            ) {
                if (num == numToCompare) {
                    count++;
                }

            }
            if (count == 1) {
                toReturn = num;
            }
        }

        return toReturn;

    }
}
