package obj8_polymorphism.lv2;

/**
 * ClassName: Cat
 * Package: obj8_polymorphism.lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/05-13:36
 */
public class Cat extends Pet{
    public void view(){
        System.out.println("猫可爱");
    }
    public void act(){
        System.out.println("可以抱抱猫");
    }
    public void eat(){
        System.out.println("猫爱吃鱼");
    }
}
