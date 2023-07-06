    java.util.Map：存储一对一对的数据（key--value）
        HashMap，LinkedHashMap，TreeMap，Hashtable，Properties

    |---- HashMap:
        主要实现类，线程不安全的，效率高，可以添加值为null的key和value，底层使用数组+单向链表+红黑树

        HashMap的元素特点：
            > HashMap中所有的key彼此之间是不可重复的，无序的，所有的key就构成一个Set集合
                key所在的类需要重写hashCode()和equals()
            > HashMap中所有的value彼此之间是可重复的，无序的，所有的value就构成一个Collection集合
                value所在的类需要重写equals()
            > HashMap中的一个key-value，就构成了一个entry，
                entry之间是不可重复的，无序的，
                所以所有的entry就构成了一个Set集合

        Map中的常用方法：
            增
                put(Object key,Object value)
                putAll(Map m)
            删
                Object remove(Object key)
            改
                put(Object key,Object value)
            查
                Object get(Object key)
            长度
                size()
            遍历
                遍历key集
                    Set keySet()
                遍历value集
                    Collection values()
                遍历entry集
                    Set entrySet()

        |---- LinkedHashMap：
            HashMap的子类，在HashMap使用的数据结构的基础上，增加了一对双向链表，用于记录添加的元素的顺序，
            进而在遍历元素时，就可以按照添加的顺序显示
            开发中，对于频繁的遍历操作，建议使用此类

    |---- TreeMap:
        底层使用红黑树存储，可以按照添加的key-value中的key元素的指定的属性的大小顺序进行遍历，
        需要考虑①自然排序 ②定制排序
        要求：
            > 添加的key必须是同一个类型的对象

    |---- Hashtable：
        古老实现类，线程安全的，效率低，不可以添加值为null的key和value，底层使用数组+单向链表

        |---- Properties：
            其key和value都是String类型，常用来处理属性文件