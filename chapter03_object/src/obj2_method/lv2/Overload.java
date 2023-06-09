package obj2_method.lv2;

/**
 * ClassName: Overload
 * Package: method.lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/24-22:59
 */
public class Overload {
    /*
        方法的重载
            1.定义：
                在同一个类中，允许存在一个以上的同名方法，只要他们的参数列表不同即可
                满足这样特征的多个方法，彼此之间构成方法的重载
            2.总结为 两同一不同
                两同：同一个类，相同的方法名
                一不同：参数个数不同，参数类型不同
     */

    public void add(int i, int j){

    }

    public void add(int i, int j,int k){

    }

    public void add(String i, String j){

    }
}
