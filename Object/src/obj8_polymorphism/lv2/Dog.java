package obj8_polymorphism.lv2;

/**
 * ClassName: Dog
 * Package: obj8_polymorphism.lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/05-13:34
 */
public class Dog extends Pet{
    public void view(){
        System.out.println("狗可爱");
    }
    public void act(){
        System.out.println("可以抱抱狗");
    }
    public void eat(){
        System.out.println("狗爱吃骨头");
    }
}
