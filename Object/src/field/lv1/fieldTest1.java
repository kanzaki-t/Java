package field.lv1;

/**
 * ClassName: fieldTest
 * Package: lv1
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/20-22:37
 */
public class fieldTest1 {
    /*
        - 类的成员之一：属性
            变量的分类
                1.按照数据类型：
                    基本数据类型（8种）
                    引用数据类型（数组，类，接口，枚举，注解，记录）
                2.按照变量在类中声明的位置的不同：
                    成员变量（或属性）
                    局部变量（方法内，方法形参，构造器内等）
            权限修饰符：
                public
                protected
                private
                属性可以用权限修饰符，
                局部变量不可以
            默认值
                属性有默认值
                    - int: 0
                    - double: 0.0
                    - String: null
                    - boolean: false
                局部变量没有默认值
     */

    // 属性 成员变量
    String name = "jack";

    public void eat(){
        // 局部变量
        String food = "cake";
    }
}
