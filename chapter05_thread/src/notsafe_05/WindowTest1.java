package notsafe_05;

/**
 * ClassName: WindowTest
 * Package: notsafe
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/31-17:59
 */
class SaleTicket implements Runnable {
    int ticket = 100;
    boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag) {

            show();
        }

    }

    public  synchronized void show(){// 同步方法 此时的同步监视器默认是；this
        if (ticket > 0) {

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket s = new SaleTicket();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
