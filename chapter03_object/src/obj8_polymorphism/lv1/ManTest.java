package obj8_polymorphism.lv1;

/**
 * ClassName: ManTest
 * Package: obj8_polymorphism
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/04-15:26
 */
public class ManTest {
    public static void main(String[] args) {
        // 多态性 编译看左边，运行看右边
        Person p1 = new Man();

        p1.eat(); // 男人吃饭

        // p1.getMoney; 调不了特有的方法

        // 强转方法1 但是有可能出现类型转换异常
        Man m1 = (Man)p1;
        m1.getMoney();

        // 建议在向下转型前，使用 instanceof 进行判断，避免出现类型转换异常
        if(p1 instanceof Man){
            Man m2 = (Man)p1;
            m2.getMoney();
        }

    }
}
