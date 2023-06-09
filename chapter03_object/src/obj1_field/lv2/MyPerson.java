package obj1_field.lv2;

/**
 * ClassName: MyPerson
 * Package: lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/22-14:18
 */
public class MyPerson {
    public static void main(String[] args) {
        // 创建一个Person的实例对象
        Person role = new Person();

        role.name = "tom";
        role.age = 20;

        // 创建一个Date的实例对象 ！重点！
        // Date也是一个类，但是它被放在了Person类中，所以调用的时候也需要创建实例对象
        // 这个就是属性等于引用类型-类时的用法
        role.birthday = new Date();

        role.birthday.year = 1988;
        role.birthday.month = 01;
        role.birthday.day = 02;


        System.out.println(role.name);
        System.out.println(role.age);
        System.out.println(role.birthday.year);
        System.out.println(role.birthday.month);
        System.out.println(role.birthday.day);
    }
}
