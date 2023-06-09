package obj19_wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Package: obj19_wrapper
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/14-23:31
 */
public class WrapperTest {
    /**
     * 基本数据类型 ----> 包装类
     *  1.使用包装类的构造器
     *  2.  Integer.valueOf()
     */
    @Test
    public void test(){
        int m = 10;
        Integer m1 = new Integer(m); // jdk9开始非推荐
        System.out.println(m1); // 10

        // 推荐使用
        int n = 20;
        Integer n1 = Integer.valueOf(n);
        System.out.println(n1);

    }

    /**
     * 包装类 ----> 基本数据类型
     *  .xxxValue()
     */
    @Test
    public void test2(){
        int n = 30;
        Integer n1 = Integer.valueOf(n);

        int n2 = n1.intValue();
        System.out.println(n2);
    }

    /**
     * jdk5.0 自动装箱，自动拆箱
     */
    @Test
    public void test3(){
        // 自动装箱
        int m9 = 50;
        Integer m2 = m9;
        System.out.println(m2.toString());

        // 自动拆箱
        int m3 = 70;
        Integer m4 = m3;
        int m5 = m4;
        System.out.println(m5);
    }
}
