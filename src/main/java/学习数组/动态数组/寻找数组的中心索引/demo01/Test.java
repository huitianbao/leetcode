package 学习数组.动态数组.寻找数组的中心索引.demo01;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/11/27
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Solution solution=new Solution();
//        int[]nums = {1, 2, 3};
//        int[]nums = {1, 7, 3, 6, 5, 6};
        int[] nums={-1,-1,-1,0,1,1};


        System.out.println(solution.pivotIndex(nums));


    }
}
