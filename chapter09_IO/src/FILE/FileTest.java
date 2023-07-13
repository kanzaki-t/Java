package FILE;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileTest
 * Package: FILE
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/07/13-22:26
 */
public class FileTest {

    /*
    * 相对路径：
    *   > 在IDEA中，如果使用单元测试方法，相对于当前的module来将
    *   > 如果使用main()方法，相对于当前的project来将
    * */
    @Test
    public void test1(){
        File file1 = new File("abc");
    }
}
