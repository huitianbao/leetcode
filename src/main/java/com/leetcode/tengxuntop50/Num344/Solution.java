package com.leetcode.tengxuntop50.Num344;

/**
 * @description:编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * @author: htb
 * @createDate: 2019/11/13
 * @version: 1.0
 */
public class Solution {
    public void reverseString(char[] s) {
        char temp=' ';
        /*
        反向的排序数组内容
         */
        for (int i=0;i<(s.length)/2;i++){
            temp=s[i];s[i]=s[s.length-1-i];s[s.length-1-i]=temp;
        }
        /*
        遍历输出
         */
        for (char ch:s
             ) {
            System.out.print(ch+" ");
        }

    }
}
