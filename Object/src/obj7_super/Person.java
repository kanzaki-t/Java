package obj7_super;

/**
 * ClassName: Person
 * Package: obj6_overwrite_override
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/02-11:05
 */
public class Person {
    int age = 60;

    private int money = 10000;

    public Person() {
        System.out.println("父类构造器");
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
