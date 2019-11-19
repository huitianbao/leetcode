package com.leetcode.tengxuntop50.Num88;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/11/15
 * @version: 1.0
 */
public class Solution2 {

    public int[] sort(int[] num){
        int temp;

        for (int i=0;i<num.length;i++){
            for (int j=0;j<num.length;j++){
                if (num[i]>num[j]){
                    temp=num[i];num[i]=num[j];num[j]=temp;
                }
            }
        }
        return num;
    }


    public void merge2(int[] nums1, int m, int[] nums2, int n) {

        for (int j=m;j<m+n;j++){
            nums1[j]=nums2[j-m];
        }
        System.out.println(Arrays.toString(this.sort(nums1)));




    }

}
