package obj15_interface.jdk8;

/**
 * ClassName: Test
 * Package: obj15_interface.jdk8
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/10-10:17
 */
public class Test {
    public static void main(String[] args) {
        // 知识点1：接口中声明的静态方法只能被接口来调用，不能使用其实现类调用
        CompareA.method1();

        // 以下调代码都无法调用
//        SubClass.method1();
//        SubClass sub = new SubClass();
//        sub.method1();

        // 知识点2：接口中声明的默认方法，可以被实现类继承，
        // 实现类没有重写此方法的情况下，默认调用接口中声明的方法
        // 如果实现类重写了此方法，则调用的是自己重写的方法
        SubClass sub = new SubClass();
        sub.method2();
        sub.method3();

        // 知识点3：类实现了两个接口，而两个接口中定义了同名同参数的默认方法，则实现类在没有重写此两个接口的
        // 默认方法的情况下，会报错。----> 接口冲突
        // 要求：此时实现类必须要重写接口中定义的同名同参数的方法。

        // 知识点4：子类或实现类继承了父类并实现了接口，父类和接口中声明了同名同参数的默认方法。
        // 默认情况下，子类或实现类在没有重写此方法的情况下，调用的是父类的方法。----> 类优先原则
    }
}
