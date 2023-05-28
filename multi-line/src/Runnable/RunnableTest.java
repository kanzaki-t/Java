package Runnable;

/**
 * ClassName: RunnableTest
 * Package: Runnable
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/28-21:20
 */
public class RunnableTest {
    public static void main(String[] args) {
        // 3.创建当前实现类的对象
        StepOne s = new StepOne();

        // 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
        Thread t1 = new Thread(s);

        // 5.Thread类的实例调用start()
        t1.start();

        // main线程
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }

        Thread t2 = new Thread(s);
        t2.start();

        // 匿名
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }).start();
    }
}
// 1.创建一个实现Runnable接口的类
class StepOne implements Runnable{
    // 2.实现接口中的run()方法 ----> 此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}