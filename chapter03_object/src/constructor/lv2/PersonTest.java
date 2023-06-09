package constructor.lv2;

/**
 * ClassName: PersonTest
 * Package: constructor.lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/28-15:31
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("tom",18);

        // 给Person实例创建一个账户实例
        p1.setAccount(new Account(12345,10000));

        System.out.println(p1.getAccount().getId());
        System.out.println(p1.getAccount().getYue());
        p1.getAccount().deposit(6000);
        System.out.println(p1.getAccount().getYue());
        p1.getAccount().withdraw(15000);
        System.out.println(p1.getAccount().getYue());
    }
}
