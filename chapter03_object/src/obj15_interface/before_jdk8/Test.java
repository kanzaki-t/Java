package obj15_interface.before_jdk8;

/**
 * ClassName: Test
 * Package: obj15_interface
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/08-22:41
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建接口实现类的对象
        Computer computer = new Computer();
        Printer printer = new Printer();

        computer.transferData(printer);

        // 2.创建接口实现类的匿名对象
        // computer.transferData(new printer())

        // 3.创建接口匿名实现类的对象
        USB usb1 = new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };
        computer.transferData(usb1);

        // 4.创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });

    }
}

class Computer {
    public void transferData(USB usb){
        System.out.println("连接成功");
        usb.start();
        usb.stop();
        System.out.println("取消连接");
    }
}

interface USB {
    public abstract void start();
    public abstract void stop();
}

/**
 * 打印机实现USB功能
 */
class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始工作...");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作...");
    }
}