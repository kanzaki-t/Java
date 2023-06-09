package Thread_01;

/**
 * ClassName: ThreadTest
 * Package: Thread
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/25-23:18
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 3.创建当前Thread子类的对象
        ThreadChild t1 = new ThreadChild();
        // 4.通过对象调用start() -启动线程 -调用run方法
        t1.start();

        // 不可以用t1.run()替换t1.start()
        // 不可以让已经start()的线程，再次执行start(),否则会报异常 IllegalThreadStateException

        // 创建Thread类的匿名子类的匿名对象
        new Thread(){
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        // main线程
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
// 1.创建一个继承于Thread类的子类
class ThreadChild extends Thread{
    // 2.重写Thread类的run()方法 ----> 此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
