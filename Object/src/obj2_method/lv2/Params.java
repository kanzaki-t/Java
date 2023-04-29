package obj2_method.lv2;

/**
 * ClassName: Params
 * Package: method.lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/26-13:20
 */
public class Params {
    /*
        可变个数形参的方法
            在调用方法时，可能会出现方法形参的类型是确定的，但是参数的个数不确定，
            此时，就可以使用可变个数形参的方法。

            格式：（参数类型 ... 参数名）

            说明：
                1.可变个数形参的方法在调用时，针对于可变的形参，赋值的实参的个数可以为最小0个，最多不限
                2.可变个数形参的方法与同一个类中，同名的多个方法之间可以构成重载
                3.可变个数形参是一个数组
     */
    public static void main(String[] args) {
        Params p = new Params();

        p.print(1);

        String a = p.concat("-","hello","world","love");
        System.out.println(a);
    }

    public void print(int ... nums){
        System.out.println(nums[0]);
    }

    public String concat(String operator,String ... items){
        String result = "";
        for (int i = 0; i < items.length; i++) {
            if(i == 0){
                result += items[i];
            }else {
                result += operator+items[i];
            }
        }
        return result;
    }
}
