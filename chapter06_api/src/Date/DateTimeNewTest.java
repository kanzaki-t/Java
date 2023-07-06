package Date;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * ClassName: DateTimeNewTest
 * Package: Date
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/06/21-9:29
 */
public class DateTimeNewTest {
    /*
    * JDK8中的API：LocalDate LocalTime LocalDateTime
    * */
    @Test
    public void test1(){
        // now():获取当前日期和时间对应的实例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);// 2023-06-21
        System.out.println(localTime);// 09:33:26.028689400
        System.out.println(localDateTime);// 2023-06-21T09:33:26.028689400
    }

    @Test
    public void test2(){
        // of:获取指定日期和时间对应的实例
        LocalDate localDate = LocalDate.of(2023, 6, 21);
        LocalDateTime localDateTime = LocalDateTime.of(2023, 6, 21, 9, 30, 10);

        System.out.println(localDate);// 2023-06-21
        System.out.println(localDateTime);// 2023-06-21T09:30:10
    }
    /*
    * Instant
    * */
    @Test
    public void test3(){
        Instant instant = Instant.now();
        System.out.println(instant);// 2023-06-21T00:51:02.520839700Z

        //获取毫秒数
        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli);// 1687308880535
    }

    /*
    * DateTimeFormatter
    * */
    @Test
    public void test4(){
        // 自定义的格式：
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化：日期，时间 ---> 字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);// 2023-06-21 10:02:13

        // 解析：字符串 ---> 日期，时间
        TemporalAccessor parse = dateTimeFormatter.parse("2023-06-21 10:02:13");
        System.out.println(parse);// {},ISO resolved to 2023-06-21T10:02:13
        LocalDateTime localDateTime1 = LocalDateTime.from(parse);
        System.out.println(localDateTime1);// 2023-06-21T10:02:13
    }
}
