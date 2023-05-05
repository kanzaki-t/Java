package obj8_polymorphism.lv1;

/**
 * ClassName: Man
 * Package: obj8_polymorphism
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/04-15:24
 */
public class Man extends Person{
    Boolean isSmoking;

    public void eat(){
        System.out.println("男人吃饭");
    }

    public void getMoney(){
        System.out.println("男人挣钱");
    }
}
