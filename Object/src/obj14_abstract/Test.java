package obj14_abstract;

/**
 * ClassName: Test
 * Package: obj14_abstract
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/07-22:29
 */
public class Test {
    public static void main(String[] args) {
        // 由于Person类是抽象类，所以不能被实例化
        //Person p1 = new Person();

        Student stu = new Student();
        stu.method();
    }
}
