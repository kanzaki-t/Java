package ThreadConstrour_02;

/**
 * ClassName: ThreadCTest
 * Package: ThreadConstrour
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/28-22:25
 */
public class ThreadCTest {
    public static void main(String[] args) {
        ThreadChild t1 = new ThreadChild("线程t1");

        t1.start();

        // main线程
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class ThreadChild extends Thread{
    public ThreadChild() {
    }

    public ThreadChild(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}