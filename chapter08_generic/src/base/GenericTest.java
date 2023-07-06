package base;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: GenericTest
 * Package: base
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/07/06-23:17
 */
public class GenericTest {

    @Test
    public void test1(){
        List<Integer> list = new ArrayList<>();

        // 自动装箱
        list.add(11);
        list.add(22);
        list.add(33);

        for (Integer o : list){

            // 自动拆箱
            int score = o;
            System.out.println(score);
        }


    }

    @Test
    public void test2(){
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Tom",88);
        map.put("Jack",22);
        map.put("Tony",55);

        // 基础写法
//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        // 新特性，类似于js中的变量声明
        var entries = map.entrySet();
        var iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "---->" + value);
        }
    }
}
