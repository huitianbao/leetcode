package com.leetcode.tengxuntop50.Num557;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/11/13
 * @version: 1.0
 */
public class Solution {
    public String reverseWords(String s) {
        //1.去除首尾的“”2.拆分
        String[] strings = s.replace("\"", "").split(" ");

        for (int i = 0; i < strings.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(strings[i]);
            strings[i] = stringBuffer.reverse().toString();
        }

        String toReturn = "\"";
        for (int i = 0; i < strings.length; i++) {
            toReturn = toReturn + strings[i] + " ";

        }

        return toReturn.trim() + "\"";
    }
}
