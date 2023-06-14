package Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Package: Date
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/06/13-21:35
 */
public class DateTimeTest {
    @Test
    public void test1(){
        // 创建一个基于当前系统时间的Date的实例
        Date date1 = new Date();
        System.out.println(date1);// Tue Jun 13 21:39:02 JST 2023
        System.out.println(date1.toString());// Tue Jun 13 21:39:02 JST 2023
        System.out.println(date1.getTime());// 1686659942826

        Date date2 = new Date(1686659942826L);
        System.out.println(date2);// Tue Jun 13 21:39:02 JST 2023
    }

    @Test
    public void test2(){
        java.sql.Date date1 = new java.sql.Date(1686659942826L);
        System.out.println(date1); // 2023-06-13
    }

    @Test
    public void test3(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        // 格式化：日期 ---> 字符串
        Date date1 = new Date();
        System.out.println(date1);// Tue Jun 13 21:54:28 JST 2023
        String strDate = sdf.format(date1);
        System.out.println(strDate);// 2023/06/13 21:54

        // 解析：字符串 ---> 日期
        try {
            Date date2 = sdf.parse("2023/06/13 21:54");
            System.out.println(date2);// Tue Jun 13 21:54:00 JST 2023
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 格式化：日期 ---> 字符串
        Date date1 = new Date();
        System.out.println(date1);// Tue Jun 13 22:25:01 JST 2023
        String strDate = sdf.format(date1);
        System.out.println(strDate);// 2023-06-13 22:25:01

    }
    @Test
    public void test5(){
        Calendar calender = Calendar.getInstance();

        System.out.println(calender.get(Calendar.DAY_OF_WEEK));
    }

    @Test
    public void test6(){
        // 如何把正常时间转换成java.sql.Date
        Date date1 = new Date();
        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);// 2023-06-13
    }
}
