package exception02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: Main
 * Package: exception02
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/17-19:23
 */
public class Main {
    public static void main(String[] args) {
        try {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();

        System.out.println("输入的整数是：" + num);

        scanner.close();
        }catch (InputMismatchException e){
            System.out.println("出错了");
            System.out.println(e); // java.util.InputMismatchException
            e.printStackTrace();
            /**
             * java.util.InputMismatchException
             * 	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
             * 	at java.base/java.util.Scanner.next(Scanner.java:1594)
             * 	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
             * 	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
             * 	at exception02.Main.main(Main.java:21)
             */
        }
    }
}
