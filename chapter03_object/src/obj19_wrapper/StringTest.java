package obj19_wrapper;

import org.junit.Test;

/**
 * ClassName: StringTest
 * Package: obj19_wrapper
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/17-10:45
 */
public class StringTest {
    /**
     * 基本数据类型，包装类 ---> String类型
     * 1.调用String的重载的静态方法valueOf(xxx)
     * 2.基本数据类型+""
     */
    @Test
    public void test(){
        int m1 = 10;
        String s1 = String.valueOf(m1);
        System.out.println(s1); // "10"

        String s2 = m1 + "";
        System.out.println(s2);// "10"
    }

    /**
     * String类型  ---> 基本数据类型，包装类
     *  调用包装类的静态方法parseXxx()
     */
    @Test
    public void test2(){
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1); // 123

    }
}
