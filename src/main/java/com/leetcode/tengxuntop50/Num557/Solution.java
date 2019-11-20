package com.leetcode.tengxuntop50.Num557;

/**
 * @description:给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * @author: htb
 * @createDate: 2019/11/13
 * @version: 1.0
 */
public class Solution {
    public String reverseWords(String s) {
        //1.去除首尾的“”2.拆分
        String[] strings = s.replace("\"", "").split(" ");

        /*
        2.对拆分的每一个字符串 反转，调用 StringBuffer类的一个 reverse() 方法
         */
        for (int i = 0; i < strings.length; i++) {
            StringBuffer stringBuffer = new StringBuffer(strings[i]);
            strings[i] = stringBuffer.reverse().toString();
        }

        String toReturn = "\"";
        /*
        3.拼接上中间的 空格
         */
        for (int i = 0; i < strings.length; i++) {
            toReturn = toReturn + strings[i] + " ";
        }
        return toReturn.trim() + "\"";
    }
}
