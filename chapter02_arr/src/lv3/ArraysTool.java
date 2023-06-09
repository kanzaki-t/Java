package lv3;

import java.util.Arrays;

/**
 * ClassName: ArraysTool
 * Package: lv3
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/18-0:26
 */
public class ArraysTool {
    public static void main(String[] args) {
        /*
            数组工具类：java.util.Arrays
         */

        // 1. boolean equals(int[] a,int[] b) 比较两个数组的元素是否依次相等
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};

        boolean isEquals = Arrays.equals(arr1,arr2);

        System.out.println(isEquals); // true

        // 2. String toString(int[] a) 输出数组元素信息
        System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 4, 5]

        // 3. void fill(int[] a int val) 将指定值填充到数组里
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1)); // [10, 10, 10, 10, 10]

        // 4. void sort(int[] a) 使用快速排序算法实现的排序
        int[] arr3 = new int[]{4,2,1,7,6};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3)); // [1, 2, 4, 6, 7]

        // 5. int binarySearch(int[] a,int key) 二分查找
        int index = Arrays.binarySearch(arr3,6);
        System.out.println(index); // 3 如果找不到，则返回负数，所以如果index >= 0 则表示找到了
    }
}
