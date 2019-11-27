package 学习递归算法.记忆化技术.斐波那契数.demo01;

import java.util.HashMap;

/**
 * @description:斐波那契数
 * @author: htb
 * @createDate: 2019/11/26
 * @version: 1.0
 */
public class Solution {
//    private List<Integer> list=new ArrayList<Integer>();

    private HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
    public int Callfib(int N){
        if (map.containsKey(N)){
            return map.get(N);
        }else {
            map.put(N,fib(N));

            return map.get(N);
        }
    }
    public int fib(int N) {

        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return fib(N - 1) + fib(N - 2);
        }


    }
}
