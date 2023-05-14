package obj15_interface.jdk8;

/**
 * ClassName: CompareA
 * Package: obj15_interface.jdk8
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/10-10:14
 */
public interface CompareA {
    //属性：声明为public static final
    //方法：jdk8之前只能声明抽象方法

    //方法：jdk8：静态方法，并有方法体
    public static  void method1(){
        System.out.println("静态方法");
    }

    //方法：jdk8：默认方法
    public default void method2(){
        System.out.println("默认方法2");
    }
    public default void method3(){
        System.out.println("默认方法3");
    }
}
