package 学习递归算法.递推关系;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:这两种的思路是每次都计算
 * @author: htb
 * @createDate: 2019/11/26
 * @version: 1.0
 */
public class YangHui01 {
    /**
     * @Description: 主要的递归函数，返回的是  第 i行 j 列对应的数字，i和j 从 1 开始
     * @param: [i, j]
     * @return: int
     * @date: 2019/11/26 18:28
     */
//    public int getResultOfIJ(int i,int j){ // i 是行 j 是列
//        if (i<j){  //行数小于列数
//            return 0;
//        } else{
//            if (i==1||j==1){
//                return 1;
//            }else {
//                return getResultOfIJ(i-1,j-1)+getResultOfIJ(i-1,j);
//            }
//        }
//        }


    //优化性能
    public int getResultOfIJ(int i, int j) { // i 是行 j 是列
        if ((i < j) && (i != 1 && j == 1)) {  //行数小于列数
            return 0;
        } else if ((i < j) && (i == 1 || j == 1)) {
            return 1;
        } else {
            return getResultOfIJ(i - 1, j - 1) + getResultOfIJ(i - 1, j);
        }
    }

    /*  有点问题

    public int getResultOfIJ(int i,int j){ // i 是行 j 是列
        if ((i==1||j==1)&&(i<=j)){  //行数小于列数
            return 1;
        } else if ((i==1||j==1)&&(i>j)){
            return 0;
        } else{
            return getResultOfIJ(i-1,j-1)+getResultOfIJ(i-1,j);
        }

    }

     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listToReturn = new LinkedList<List<Integer>>();
        //最外层的是 控制行数  和 numRows 一样
        for (int i = 1; i <= numRows; i++) {  //行
            List<Integer> temp = new LinkedList<Integer>();
//            temp.removeAll();

            //控制每一行的 内容
            for (int j = 1; j <= i; j++) { //列
                temp.add(getResultOfIJ(i, j));
            }
            listToReturn.add(temp);
        }
        return listToReturn;
    }

    public void myPrint(List<List<Integer>> lists) {
//        List<Integer> temp=new ArrayList<Integer>();
        System.out.println("[");
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> temp = lists.get(i);
            System.out.print("[");
            for (int j = 0; j < temp.size() - 1; j++) {
                System.out.print(+temp.get(j) + ",");
            }
            System.out.print("]");
            System.out.println();

        }
        System.out.println("]");

    }
}
