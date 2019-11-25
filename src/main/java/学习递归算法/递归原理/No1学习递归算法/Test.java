package 学习递归算法.递归原理.No1学习递归算法;

/**
 * @description:以相反的顺序打印字符串
 * @author: htb
 * @createDate: 2019/11/25
 * @version: 1.0
 */

/*
首先，我们可以将所需的函数定义为 printReverse(str[0...n-1])，其中 str[0] 表示字符串中的第一个字符。然后我们可以分两步完成给定的任务：

printReverse(str[1...n-1])：以相反的顺序打印子字符串 str[1...n-1] 。
print(str[0])：打印字符串中的第一个字符。
 */
public class Test {
    public static void printReverse(char[] str){
        helper(str,0);
    }

    public static void helper(char[] str,int index){
        //基线条件
        if (index<0||index>str.length-1){
            return;
        }
        helper(str,index+1);
        System.out.print(str[index]);
    }

    public static void main(String[] args) {
        char[] chars={'1','2'};

        printReverse(chars);
    }
}
