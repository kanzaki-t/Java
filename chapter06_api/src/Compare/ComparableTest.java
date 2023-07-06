package Compare;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: ComparableTest
 * Package: Compare
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/06/21-10:24
 */
public class ComparableTest {
    @Test
    public void test1() {
        String[] arr = new String[]{"Tom", "Jerry", "Tony", "Jack", "Rose"};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*
        *   Jack
            Jerry
            Rose
            Tom
            Tony
        * */
    }

    @Test
    public void test2(){
        Product[] arr = new Product[4];
        arr[0] = new Product("Huawei",6666);
        arr[1] = new Product("Xiaomi",5555);
        arr[2] = new Product("Iphone",8888);
        arr[3] = new Product("Vivo",4444);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
