package lv1;

/**
 * ClassName: TwoArray
 * Package: PACKAGE_NAME
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/03/12-23:48
 */
public class OneArrayTest2 {
    public static void main(String[] args) {
        /*
            5.数组元素的默认初始化值
                - int: 0
                - double: 0.0
                - String: null
                - boolean: false
         */
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);

        double[] arr2 = new double[3];
        System.out.println(arr2[0]);

        String[] arr3 = new String[3];
        System.out.println(arr3[0]);

        boolean[] arr4 = new boolean[3];
        System.out.println(arr4[0]);
    }
}
