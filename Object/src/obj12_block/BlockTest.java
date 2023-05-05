package obj12_block;

/**
 * ClassName: BlockTest
 * Package: obj12_block
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/05-22:50
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.age);

        System.out.println();

        Person p1 = new Person();
        p1.eat();
    }
}

class Person{
    static int age = 20;
    public void eat(){
        System.out.println("人吃饭");
    }

    // 非静态代码块
    {
        System.out.println("非静态代码块执行了");
    }

    // 静态代码块
    static{
        System.out.println("静态代码块执行了");
    }
}
