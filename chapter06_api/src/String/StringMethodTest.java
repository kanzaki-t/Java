package String;

import org.junit.Test;

/**
 * ClassName: StringMethodTest
 * Package: String
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/06/11-21:23
 */
public class StringMethodTest {
    @Test
    public void test1(){
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");

        System.out.println(s1.isEmpty());// true
        System.out.println(s2.isEmpty());// true
        System.out.println(s3.isEmpty());// true

    }
    @Test
    public void test2(){
        String s1 = "abc";
        System.out.println(s1.length());// 3
    }
    @Test
    public void test3(){
        String s1 = "abc";
        String s2 = "123";
        String s3 = s1.concat(s2);
        System.out.println(s3);// abc123
    }
    @Test
    public void test4(){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "Abc";
        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// false 区分大小写
        System.out.println(s1.equalsIgnoreCase(s3));// true 不区分大小写
    }
    @Test
    public void test5(){
        String s1 = "abc";
        System.out.println(s1.contains("s"));// false
        System.out.println(s1.contains("a"));// true
    }
    @Test
    public void test6(){
        String s1 = "abc";
        System.out.println(s1.indexOf("c")); // 2 也是从0开始计算下标
        String s2 = "勉強会";
        System.out.println(s1.indexOf("勉強")); // -1
        System.out.println(s2.indexOf("勉強")); // 0
    }
    @Test
    public void test7(){
        StringBuffer sb3 = new StringBuffer("abc");
        sb3.append("aaa").append("123");
        System.out.println(sb3);// true

    }
}
