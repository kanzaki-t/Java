实现对象的排序，可以考虑两种方法：自然排序，定制排序

方式一 自然排序
    实现Comparable接口的方式
    步骤：
        1.具体的类实现Comparable接口
        2.重写Comparable接口中的compareTo（Object obj）方法，
            在此方法中指明比较类A的对象的大小的标准
        3.创建类A的多个实例，进行大小的比较，或者排序

方式二 定制排序
    实现Comparator接口的方式
    步骤：
        1.创建一个实现了Comparator接口的实现类A
        2.实现类A要求重写Comparator接口中的 public int compare(Object o1, Object o2) 方法
            在此方法中指明要比较大小的对象的大小关系
        3.将此实现类A的对象传入到相关方法的参数位置

对比两种方式：
    自然排序：单一的，唯一的
    定制排序：灵活的，多样的

    自然排序：一劳永逸的
    定制排序：临时的