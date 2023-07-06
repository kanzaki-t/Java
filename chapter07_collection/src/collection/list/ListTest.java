package collection.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: list
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/06/26-22:18
 */
public class ListTest {
    @Test
    public void test1(){
        List list = new ArrayList();

        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add(123);

        System.out.println(list);// [AA, BB, CC, 123]
        System.out.println(list.size());// 4
        System.out.println(list.get(2));// CC
        list.set(2,"aaaa");
        System.out.println(list.get(2));// aaaa
        list.add(2,"cccc");
        System.out.println(list);// [AA, BB, cccc, aaaa, 123]
        System.out.println(list.get(2));// cccc

        for (Object obj : list){
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        List list = new ArrayList();

        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add(2);

        list.remove(2);
        System.out.println(list); // [AA, BB, 2]

        list.remove(Integer.valueOf(2));
        System.out.println(list); // [AA, BB]
    }
}
