package obj5_extents;

/**
 * ClassName: ExtentTest
 * Package: obj5_extents
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/01-22:24
 */
public class ExtentTest {
    public static void main(String[] args) {
        Student stu = new Student();

        // Student类中没有定义name，但是继承了Person类的属性，所以可以使用
        stu.name = "tom";

        // Person类中money是用private定义的，所以子类虽然继承了money，但是无法访问和修改
        // stu.money = 10000; 会报错
    }
}
