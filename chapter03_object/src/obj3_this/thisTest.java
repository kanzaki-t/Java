package obj3_this;

/**
 * ClassName: thisTest
 * Package: obj3_this
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/29-17:18
 */
public class thisTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("tom");
        System.out.println(p1.getName());
    }
}

class Person{
    String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}