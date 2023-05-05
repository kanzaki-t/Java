package obj10_static;

/**
 * ClassName: ChineseTest
 * Package: obj10_static
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/05-15:50
 */
public class ChineseTest {
    public static void main(String[] args) {

        Person.eat();

        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "小明";
        p1.age = 18;

        p2.name = "小红";
        p2.age = 19;

        System.out.println(p1);
        System.out.println(p2);

        System.out.println();

        p1.nation = "china";

        System.out.println(p1);
        System.out.println(p2);
    }
}

class Person {
    String name;
    int age;

    static String nation;

    public static void eat(){
        System.out.println("是人都要吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }
}
