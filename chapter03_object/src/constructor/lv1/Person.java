package constructor.lv1;

/**
 * ClassName: Person
 * Package: constructor.lv1
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/28-14:10
 */
public class Person {
    String name;
    int age;

    public Person(){
        System.out.println("没有形参的构造器");
    }

    public Person(String n,int a){
        name = n;
        age = a;
    }

    public String getInfo(){
        return "name:" + name + ",age:" + age;
    }
}
