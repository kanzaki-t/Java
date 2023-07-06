package Compare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Package: Compare
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/06/21-11:30
 */
public class ComparatorTest {
    @Test
    public void test1(){
        Product[] arr = new Product[4];
        arr[0] = new Product("Huawei",6666);
        arr[1] = new Product("Xiaomi",5555);
        arr[2] = new Product("Iphone",8888);
        arr[3] = new Product("Vivo",4444);

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    return -Double.compare(p1.getPrice(),p2.getPrice());
                }
                throw new RuntimeException("error");
            }
        };

        Arrays.sort(arr,comparator);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
