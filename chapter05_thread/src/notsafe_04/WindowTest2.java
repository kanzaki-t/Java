package notsafe_04;

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

    @Override
    public void run() {

        while (true) {

            synchronized (Window.class) {// 当前类名.class 具有唯一性
                if (ticket > 0) {

                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
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
