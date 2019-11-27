package 学习递归算法.递推关系;

/**
 * @description:
 * @author: htb
 * @createDate: 2019/11/26
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        YangHui01 yangHui01 = new YangHui01();
//        System.out.println(yangHui01.getResultOfIJ(1,1));
//        System.out.println(yangHui01.getResultOfIJ(2,1));
//        System.out.println(yangHui01.getResultOfIJ(1,1));


//        System.out.println("第 3 行 第 1 列"+yangHui01.getResultOfIJ(3,1));
//        System.out.println("第 3 行 第 2 列"+yangHui01.getResultOfIJ(3,2));
//        System.out.println("第 3 行 第 3 列"+yangHui01.getResultOfIJ(3,3));
//        System.out.println("第 4 行 第 1 列"+yangHui01.getResultOfIJ(4,1));
//        System.out.println("第 4 行 第 2 列"+yangHui01.getResultOfIJ(4,2));
//        System.out.println("第 4 行 第 3 列"+yangHui01.getResultOfIJ(4,3));
//        System.out.println("第 4 行 第 4 列"+yangHui01.getResultOfIJ(4,4));


        System.out.print(" " + yangHui01.getResultOfIJ(3, 1) + " ");
        System.out.print(yangHui01.getResultOfIJ(3, 2) + " ");
        System.out.print(yangHui01.getResultOfIJ(3, 3));
        System.out.println();
        System.out.print(yangHui01.getResultOfIJ(4, 1) + " ");
        System.out.print(yangHui01.getResultOfIJ(4, 2) + " ");
        System.out.print(yangHui01.getResultOfIJ(4, 3) + " ");
        System.out.print(yangHui01.getResultOfIJ(4, 4));

//        yangHui01.myPrint(yangHui01.generate(3));


    }
}
