package obj2_method.lv1;

/**
 * ClassName: MethodTest
 * Package: method.lv1
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/22-14:32
 */
public class MethodTest {
    /*
        java中的方法不能独立存在，所有的方法必须定义在类里面
        方法内可以调用本类中的其他方法或属性
        方法内不能定义方法

        声明：
            格式：
                public void eat(){}
                权限修饰符 返回值类型 方法名（形参列表）{}

        权限修饰符：4种
            private     本类内部
            缺省         本类内部 本包内
            protected   本类内部 本包内 其他包的子类
            public      工程内

            从上向下，权限递增

        返回值类型：
            当调用完此方法后，是否需要返回一个结果
                - 无返回值类型
                    void
                - 有具体的返回值类型
                    基本数据类型
                    引用数据类型

                    ！需要在方法内部配合使用“return”！
                    return的作用：
                        1.结束一个方法
                        2.返回数据给方法的调用者


        方法名：
            见名知意

        形参列表：
            属于局部变量，且可以声明多个
            格式：
                （形参类型1 形参1，形参类型2 形参2，...）

        方法体：
            执行

     */
}
