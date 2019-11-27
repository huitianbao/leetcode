package 学习数组.动态数组.寻找数组的中心索引.demo02;

/**
 * @description: 成功的示例
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
 *  *
 *  * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 *  *
 *  * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 *  *
 *  * 示例 1:
 *  *
 *  * 输入:
 *  * nums = [1, 7, 3, 6, 5, 6]
 *  * 输出: 3
 *  * 解释:
 *  * 索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
 *  * 同时, 3 也是第一个符合要求的中心索引。
 *  * 示例 2:
 *  *
 *  * 输入:
 *  * nums = [1, 2, 3]
 *  * 输出: -1
 *  * 解释:
 *  * 数组中不存在满足此条件的中心索引。
 *  *
 *  * nums 的长度范围为 [0, 10000]。
 *  * 任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数
 *
 * @author: htb
 * @createDate: 2019/11/27
 * @version: 1.0
 */
public class Solution2 {
    /**
     * @Description: 累加 index左边的 数 不包含 index
     * @param: [nums, index]
     * @return: int
     * @date: 2019/11/27 10:23
     */
    public int addLeft(int[] nums,int index){
        //需要优化边界值 0  左边没有数字  认为和为0    右边没有数字 认为和为 0
        //处理左边界
        if (index==0){
            return 0;
        }else {
            int sum=0;
            for (int i=0;i<index;i++){
                sum=sum+nums[i];
            }
            return sum;
        }

    }

    /**
     * @Description: 累加 index右边的 数 不包含 index
     * @param: [nums, index]
     * @return: int
     * @date: 2019/11/27 10:24
     */
    public int addRight(int[] nums,int index){
        if (index==nums.length){
            //处理右边界
            int sum_r=0;
            for (int i=0;i<nums.length;i++){
                sum_r=sum_r+nums[i];
            }
            return sum_r;

        }else {
            int sum=0;
            for (int i=index+1;i<nums.length;i++){
                sum=sum+nums[i];
            }
            return sum;
        }


    }
    public int pivotIndex(int[] nums) {
        int indexToReturn=-1;
        //需要从1 开始，从0 开始有点问题
        for (int i=0;i<nums.length;i++){
            if (addLeft(nums,i)==addRight(nums,i)){
                indexToReturn=i;
                break;
            }


        }
        return indexToReturn;


    }
}
