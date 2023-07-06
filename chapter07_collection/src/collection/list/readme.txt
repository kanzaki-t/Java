    java.util.Collection：存储一个一个的数据
        子接口：List:存储有序的，可重复的数据（“动态”数组）
            ArrayList，LinkedList，Vector

    常用方法
        1.collection中的15个方法

        2.因为List是有序的，所以就有索引，进而就会增加一些针对于索引的方法
            增
                add(Object obj)
                addAll(Collection coll)
            删
                remove(Object obj)
                remove(int index)
            改
                set(int index, Object ele)
            查
                get(int index)
            插
                add(int index, Object ele)
                addAll(int index, Collection ele)
            长度
                size()
            遍历
                iterator
                增强for循环
                一般for循环

    ArrayList：List的主要的实现类，底层使用Object[]数组存储
                在添加数据，查找数据时，效率较高，在插入，删除数据时，效率较低
    LinkedList：底层使用双向链表的方式进行存储
                在添加数据，查找数据时，效率较低，在插入，删除数据时，效率较高
    Vector:List的古老的实现类底层使用Object[]数组存储