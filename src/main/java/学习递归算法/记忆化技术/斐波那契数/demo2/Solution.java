package 学习递归算法.记忆化技术.斐波那契数.demo2;

import java.util.HashMap;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/11/26
 * @version: 1.0
 */
public class Solution {
    //存储 记忆 存储算出来的值
    private HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
    /**
     * @Description: 优先到map中查找
     * @param: [N]
     * @return: int
     * @date: 2019/11/26 20:10
     */
    public int fib(int N) {
        if (map.containsKey(N)){
            return map.get(N);
        }else {
            map.put(N,getfib(N));

            return map.get(N);
        }
    }


    /**
     * @Description: 拿到 第 N个  数
     * @param: [N]
     * @return: int
     * @date: 2019/11/26 20:08
     */
    public int getfib(int N){
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }
}
