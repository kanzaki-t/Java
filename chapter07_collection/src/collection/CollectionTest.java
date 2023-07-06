package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: CollectionTest
 * Package: PACKAGE_NAME
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/06/21-14:15
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();

        // add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(123);// 自动装箱
        System.out.println(coll);// [aaa, bbb, ccc, 123]

        // size() 集合元素有几个
        System.out.println(coll.size());// 4

        // isEmpty() 集合是否为空
        System.out.println(coll.isEmpty());// false

        // contains() 集合是否包含某个元素
        System.out.println(coll.contains("aaa"));// true
        System.out.println(coll.contains(234));// false
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();

        // add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(123);// 自动装箱
        System.out.println(coll);// [aaa, bbb, ccc, 123]

        // clear
        coll.clear();
        System.out.println(coll.size());// 0
    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();

        // add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(123);// 自动装箱
        System.out.println(coll);// [aaa, bbb, ccc, 123]

        // remove
        coll.remove("ccc");
        System.out.println(coll);// [aaa, bbb, 123]
    }
    @Test
    public void test4(){
        Collection coll = new ArrayList();

        // add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(123);// 自动装箱
        System.out.println(coll);// [aaa, bbb, ccc, 123]

        // toArray 集合转化为数组
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));// [aaa, bbb, ccc, 123]
    }

    @Test
    public void test5(){
        String[] arr = new String[]{"aa","vv","fff"};

        // 数组转化为集合
        List<String> coll = Arrays.asList(arr);
        System.out.println(coll);// [aa, vv, fff]
    }
    /*
    *  Iterator：遍历集合元素
    * */
    @Test
    public void test6(){
        Collection coll = new ArrayList();

        // add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(123);// 自动装箱

        Iterator iterator = coll.iterator();

        // 遍历方式一  由于集合只有4个元素，如果调用5此next就会报错
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

    }

    @Test
    public void test7(){
        Collection coll = new ArrayList();

        // add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(123);// 自动装箱

        Iterator iterator = coll.iterator();

        // 遍历方式二 开发中不这么写
        for (int i = 0; i < coll.size(); i++) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test8(){
        Collection coll = new ArrayList();

        // add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(123);// 自动装箱

        Iterator iterator = coll.iterator();

        // 遍历方式三
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    /*
    *   增强for循环
    *       可以遍历数组和集合
    * */
    @Test
    public void test9(){
        Collection coll = new ArrayList();

        // add
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add(123);// 自动装箱

        // 遍历方式四
        for (Object obj : coll){
            System.out.println(obj);
        }

        // 遍历数组
        int[] arr = new int[]{1,2,3,4,5};
        for (int i : arr){
            System.out.println(i);
        }
    }
}
