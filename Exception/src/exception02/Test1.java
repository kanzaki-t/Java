package exception02;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: Test1
 * Package: exception02
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/18-23:49
 */
public class Test1 {
    @Test
    public void test1(){
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        System.out.println("程序结束......");
    }

    @Test
    public void test2(){
        FileInputStream fis = null;
        try {
            File file = new File("D://hello.txt");
            fis = new FileInputStream(file);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fis != null) fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
