package map;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: HashMapTest
 * Package: map
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/07/05-10:57
 */
public class HashMapTest {
    /*
     *  测试map中的实现类
     * */
    @Test
    public void test1(){
        HashMap map = new HashMap();

        map.put("name","Tom");
        map.put("age",20);

        System.out.println(map);
    }

    /*
    *   测试常用方法
    * */
    @Test
    public void test2(){
        HashMap map = new HashMap();

        // put(Object key,Object value)
        map.put("name","Tom");
        map.put("age",20);
        map.put("aa",33);
        map.put("bb",44);
        map.put("cc",66);
        // 修改
        map.put("cc",55);

        System.out.println(map); // {aa=33, bb=44, cc=55, name=Tom, age=20}

        // size()
        System.out.println(map.size()); // 5

        // Object remove(Object key)
        map.remove("name");

        System.out.println(map); // {aa=33, bb=44, cc=55, age=20}

        Object value = map.remove("bb");

        System.out.println(value); // 44
        System.out.println(map); // {aa=33, cc=55, age=20}

        // Object get(Object key)
        Object value1 = map.get("aa");

        System.out.println(value1); // 33

    }

    /*
    *   遍历
    * */
    @Test
    public void test3(){
        HashMap map = new HashMap();

        map.put("name","Tom");
        map.put("age",20);
        map.put("aa",33);
        map.put("bb",44);
        map.put("cc",66);

        // Set keySet()
        Set keySet = map.keySet();
        System.out.println(keySet); // [aa, bb, cc, name, age]

        // 遍历所有key
        for (Object o : keySet) {
            System.out.println(o);
        }

        // Collection values()
        Collection values = map.values();
        System.out.println(values); // [33, 44, 66, Tom, 20]

        // 遍历所有value
        for (Object value : values) {
            System.out.println(value);
        }

        // Set entrySet()
        Set entrySet = map.entrySet();
        System.out.println(entrySet); // [aa=33, bb=44, cc=66, name=Tom, age=20]

        // 遍历所有entry
        for (Object o : entrySet) {
            //System.out.println(o);
            Map.Entry entry = (Map.Entry) o;

            System.out.println((entry.getKey() + "--->" + entry.getValue()));
            /*
            * aa--->33
            * bb--->44
            * cc--->66
            * name--->Tom
            * age--->20
            * */
        }
    }
}
