数组存储多个数据方面的特点：
    > 数组一旦初始化，其长度就是确定的
    > 数组中的多个元素是一次紧密排列的，有序的，可重复的
    > 数组一旦初始化完成，其元素的类型就是确定的，不是此类型的元素，就不能添加到此数组中
    > 元素的类型既可以是基本数据类型，也可以是引用数据类型
数组存储多个数据方面的弊端：
    > 数组一旦初始化，其长度就不可变了
    > 数组中存储数据特点的单一性，对于无序的，不可重复的场景的多个数据就无能为力了
    > 数组中可用的方法，属性都极少。
    > 针对于数组中元素的删除，插入操作，性能较差


集合（java.util包下）
    java.util.Collection：存储一个一个的数据
        子接口：List:存储有序的，可重复的数据（“动态”数组）
            ArrayList，LinkedList，Vector

        子接口：Set：存储无序的，不可重复的数据
            HashSet，LinkedHashSet，TreeSet

    java.util.Map：存储一对一对的数据（key--value）
        HashMap，LinkedHashMap，TreeMap，Hashtable，Properties