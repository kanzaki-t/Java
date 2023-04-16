package lv2;

/**
 * ClassName: OneArray
 * Package: lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/16-10:44
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {
    /*
        二维数组的理解：
            可以看成是一维数组又作为另一个一维数组的元素而存在
            数组的内层元素
            数组的外层元素
    */

        /* 二维数组的声明和初始化 */

        // 静态
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        // 动态
        int[][] arr2 = new int[3][4];
        int[][] arr3 = new int[3][]; // 这样写比较灵活

        /* 二维数组元素的调用 */

        // 内层元素的调用
        System.out.println(arr1[0][0]); // --> 1

        // 外层元素的调用
        System.out.println(arr1[0]); // --> [I@4eec7777 地址

        /* 数组的长度 */

        // 外层元素的长度
        System.out.println(arr1.length); // --> 3

        // 内层元素的长度
        System.out.println(arr1[1].length); // --> 2

        /* 遍历二维数组 */

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
