package 学习递归算法.记忆化技术.斐波那契数.demo01;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/11/26
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Solution solution=new Solution();
        for (int i=0;i<10;i++){
            System.out.println(solution.fib(i));
        }
    }


}
