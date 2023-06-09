package notsafe_05;

/**
 * ClassName: WindowTest2
 * Package: notsafe
 * Description:
 * <p>  使用继承Thread类的方式
 * Author: Kanzaki
 * Create: 2023/05/31-18:08
 */
class Window extends Thread {
    static int ticket = 100;
    static boolean isFlag = true;

    @Override
    public void run() {

        while (isFlag) {
            show();
        }

    }
    //public  synchronized void show(){// 同步方法 非静态方法的同步监视器默认是；this，此时并不唯一
    public  static synchronized void show(){// 此时同步监视器：当前类本身
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

public class WindowTest2 {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
