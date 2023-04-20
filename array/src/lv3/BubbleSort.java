package lv3;

/**
 * ClassName: BubbleSort
 * Package: lv3
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/18-0:03
 */
public class BubbleSort {
    public static void main(String[] args) {
        /*
            冒泡排序
            从小到大
         */
        int[] arr = new int[]{34,54,3,2,65,7,39,5,76,18,43};

        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length - 1 -j; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
