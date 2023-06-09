package lv1;

/**
 * ClassName: ThreeArray
 * Package: PACKAGE_NAME
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/16-9:06
 */
public class OneArrayTest3 {
    public static void main(String[] args) {
        /*
            与数组相关的内存结构
                - 虚拟机栈：用于存放方法中声明的变量。比如：arr1
                - 堆：用于存放数组的实体（即数组中的所有元素）比如：1，2，3
        */

        // 创建一个长度为2的数组
        String[] arr1 = new String[2];

        // 给arr1中脚标是1的地方赋值为"aaa"
        arr1[1] = "aaa";

        // 重新new一个String数组，长度为3
        // 此时，栈 中arr1指向 堆 中的地址发生改变，再访问arr1[1]时，得到的值将会是默认值null，而不是aaa
        // 而原本脚标1等于aaa的数组如果接下来没有被使用的话，将会被垃圾回收
        arr1 = new String[3];

        // 创建一个数组
        int[] arr2 = new int[]{1, 2, 3};

        // 创建一个数组arr3，把arr2赋值给arr3，等于把arr2在 堆 中的地址赋值给了arr3
        int[] arr3 = arr2;

        // 此时 栈 中的arr2和arr3都指向 堆 中的同一个地址


    }
}
