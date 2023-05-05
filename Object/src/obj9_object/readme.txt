- java.lang.Object是类层次结构的根类，即所有其它类的父类，每个类都是用Object作为超类

- 常用方法
    重点：equals() toString()
    了解：clone() finalize()
    目前不需要关注：getClass() hashCode() notify() notifyAll() wait() wait(xx) wait(xx,yy)

    equals():
        任何引用数据类型都可以使用

        自定义中的类：
            比较两个对象的引用地址是否相同
            可以用Alt+Insert自动实现重写

        对于像String，File，Date和包装类等：
            他们都重写了Object类中的equals()方法，用于比较两个对象的实体内容是否相等

        区分 == 和 equals()
            ==：
                1.使用范围：基本数据类型，引用数据类型
                2.基本数据类型，判断数据值是否相等
                3.引用数据类型，判断两个引用变量的地址是否相等

            equals()：
                1.使用范围，引用数据类型
                2.重写和不重写的区别

    toString()：
        自定义中的类：
            返回地址值
            可以用Alt+Insert自动实现重写

        对于像String，File，Date和包装类等：
            返回当前对象的实体内容