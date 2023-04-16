package lv2;

/**
 * ClassName: TwoArrayTest2
 * Package: lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/16-13:32
 */
public class TwoArrayTest2 {
    public static void main(String[] args) {

        // 方式一：
        /*
            二维数组的默认值
                外层都是地址
                内层：
                - int: 0
                - double: 0.0
                - String: null
                - boolean: false
         */

        int[][] arr1 = new int[3][2];

        // 外层元素默认值
        System.out.println(arr1[0]); // -->堆地址

        // 内层元素默认值
        System.out.println(arr1[0][1]); // -->0

        // 方式二：
        /*
            二维数组的默认值
                外层都是null
                内层：
                    报错
         */

        int[][] arr2 = new int[3][];

        // 外层元素默认值
        System.out.println(arr2[0]); // --> null

        // 内层元素默认值
        System.out.println(arr2[0][1]); // --> 报错（NullPointerException）
    }
}
