package Stream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * ClassName: StreamTest
 * Package: Stream
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/07/13-23:27
 */
public class StreamTest {
    @Test
    public void test1() {
        FileReader fr = null;
        try {
            //1.创建File类的对象，对应hello.txt文件
            File file1 = new File("hello.txt");

            //2.创建输入型的字符流，用于读取数据
            fr = new FileReader(file1);

            //3.读取数据，并显示在控制台上
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.流资源的关闭操作（必须要关闭，否则会内存泄漏）
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
