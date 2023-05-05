package obj7_super;

/**
 * ClassName: Students
 * Package: obj6_overwrite_override
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/02-11:06
 */
public class Students extends Person {
    int age = 18;

    public Students() {
        super();
        System.out.println("子类构造器");
    }

    public void eat(){
        System.out.println("学生应该吃有营养的");
    }

    public void show(){
        eat();
        super.eat();
    }

    public void show1(){
        System.out.println(age);
        System.out.println(super.age);
        //System.out.println(super.money); 因为父类的money的权限是private，所以调用不了
    }
}
