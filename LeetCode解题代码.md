# leetcode
leetcode main

LeetCode 每一题的地址
https://github.com/huitianbao/leetcode/tree/master/src/main/java/com/leetcode/tengxuntop50

## Num 88
### 一、题目描述
给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
### 二、结题思路
1）把 nums2 的数据拼接到 nums1 后面
2）从小到大排序

### 三、解答代码
https://github.com/huitianbao/leetcode/tree/master/src/main/java/com/leetcode/tengxuntop50/Num88

---------------------------------------------------------------------------------------------------------
## Num 344
### 一、题目描述
编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。

不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。

示例 1：

输入：["h","e","l","l","o"]
输出：["o","l","l","e","h"]
示例 2：

输入：["H","a","n","n","a","h"]
输出：["h","a","n","n","a","H"]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
### 二、解题思路
首尾交换，交换到中间停止
### 三、代码

https://github.com/huitianbao/leetcode/tree/master/src/main/java/com/leetcode/tengxuntop50/Num344


----------------------------------------------------------------------------------------------------------

## Num 557
### 一、题目描述
给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

示例 1:

输入: "Let's take LeetCode contest"
输出: "s'teL ekat edoCteeL tsetnoc" 
注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

### 二、解题思路
1.去除首尾的    再拆分
2.对拆分的每一个字符串 反转，调用 StringBuffer类的一个 reverse() 方法
3.拼接上中间的 空格
### 三、代码
https://github.com/huitianbao/leetcode/tree/master/src/main/java/com/leetcode/tengxuntop50/Num557




--------------------------------------------------------------------------------------------------------


