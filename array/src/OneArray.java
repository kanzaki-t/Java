/**
 * ClassName: OneArray
 * Package: PACKAGE_NAME
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/03/12-23:11
 */
public class OneArray {
    public static void main(String[] args) {
        /*
            1.数组的声明和初始化
                - 数组一旦初始化，数组的长度不可变
        */

        // 方式一：
        // 声明数组
        double[] prices;
        // 数组初始化
        prices = new double[]{10.3,20.4,50.8};

        // 方式二：
        String[] food = new String[3];

        // 其他正确的方式
        int arr[] = new int[2];
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = {1,2,3}; // 类型推断


        /*
            2.数组元素的调用
                - 从0开始，到数组的长度length-1结束
        */
        System.out.println(prices[1]);
        System.out.println(arr2[0]);

        // 对于只声明了数组和长度的数组，如何赋值
        food[0] = "呀呀呀";
        System.out.println(food[0]);

        // 如何更改数组中原有的元素
        food[0] = "改变原有的元素";
        System.out.println(food[0]);

        /*
            3.数组的长度 length
                - 用来描述数组容器中容量的大小
         */
        System.out.println(food.length);

        /*
            4.遍历数组
         */
        for (int i = 0; i <food.length ; i++) {
            System.out.println(food[i]);
        }
    }
}
