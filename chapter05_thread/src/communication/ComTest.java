package communication;

/**
 * ClassName: ComTest
 * Package: communication
 * Description:
 * <p>   交互式
 * Author: Kanzaki
 * Create: 2023/06/08-21:20
 */
public class ComTest {
    public static void main(String[] args) {
        PrintNum p = new PrintNum();

        Thread t1 = new Thread(p,"线程1");
        Thread t2 = new Thread(p,"线程2");
        // Thread t3 = new Thread(p,"线程3");

        t1.start();
        t2.start();
        // t3.start();

        // 只有t1和t2的时候，是t1和t2交互式
        // 如果加上t3，则毫无规律
    }
}

class  PrintNum implements Runnable{
    private int num = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                notify();
                if(num <= 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + num);
                    num++;

                    try {
                        wait(); // 线程一旦执行此方法，就进入等待状态，会释放对同步监视器的调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}