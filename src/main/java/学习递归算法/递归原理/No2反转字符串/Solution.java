package 学习递归算法.递归原理.No2反转字符串;

/**
 * @description:示例 1：
 * <p>
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 * <p>
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * @author: htb
 * @createDate: 2019/11/25
 * @version: 1.0
 */
public class Solution {
    public void reverseString(char[] s) {
        helper(s, 0);

    }

    public void helper(char[] str, int index) {
        if (index < 0 || index > str.length - 1) {
            return;
        }
        helper(str, index + 1);
        System.out.print(str[index]);

    }
}
