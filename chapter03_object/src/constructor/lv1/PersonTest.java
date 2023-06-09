package constructor.lv1;

/**
 * ClassName: PersonTest
 * Package: constructor.lv1
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/28-14:14
 */
public class PersonTest {
    public static void main(String[] args) {
        // 调用的是Person类的没有形参的构造器
        Person p1 = new Person();

        System.out.println(p1.getInfo()); // name:null,age:0 默认初始值

        // 调用的是Person类的有形参的构造器
        Person p2 = new Person("tom",18);

        System.out.println(p2.getInfo()); // name:tom,age:18
    }
}
