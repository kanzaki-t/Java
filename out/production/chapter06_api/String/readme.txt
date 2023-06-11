一.String类的理解
    1.类的声明
    public final class String
        implements java.io.Serializable, Comparable<String>, CharSequence,
                   Constable, ConstantDesc {
                   }
    final:
        String是不可被继承的
    Serializable：
        可序列化的接口，凡是实现此接口的类的对象就可以通过网络或本地流进行数据的传输
    Comparable：
        凡是实现此接口的类，其对象都可以比较大小

    2.内部声明的属性
    jdk8
    private final char value[];

    jdk9~ 为了节省内存空间，做了优化
    private final byte[] value;

    3.字符串常量的存储位置
    字符串常量都存储在字符串常量池（StringTable）中
    字符串常量不允许存放两个相同的字符串常量（一旦声明了两个相同的字符串，那么他们的内存地址一样，所以可以判断两个字符串是否相等）

    4.String实例化的两种方式
        - String s1 = "hello"
        - String s2 = new String("hello")
            在内存中创建了2个对象
                一个在堆空间中
                一个在字符串常量池中

    5.String方法
        boolean isEmpty():字符串是否为空
        int length():字符串的长度
        String concat(xx):拼接
        boolean equals(Object obj):比较字符串是否相等，区分大小写
        boolean equalsIgnoreCase(Object obj):比较字符串是否相等，区分大小写
        int compareTo(String other):比较字符串大小，区分大小写
        int compareToIgnoreCase(String other):比较字符串大小，不区分大小写
        String toLowerCase():将字符串中大写字母转为小写
        String toUpperCase():将字符串中小写字母转为大写
        String trim():去除字符串中前后的空格

        boolean contains(xx):字符串中是否包含xx
        int indexOf(xx):从前往后找当前字符串中的xx，如果有，则返回第一次出现的下标，没有则返回-1
        String substring(int beginIndex):截取并返回指定的脚标开始的字符串内容
        char charAt(index):取出指定脚标的字符
        boolean startsWith(xx):检查字符串是否是以xx开头的
        boolean startsWith(xx，index):检查字符串脚标index开始是否是以xx开头的
        boolean endsWith(xx):检查字符串是否是以xx结束的
        boolean endsWith(xx，index):检查字符串脚标index开始是否是以xx结束的

    String，StringBuffer，StringBuilder
        String：不可变的
        StringBuffer：可变的，jdk1.0，线程安全的
        StringBuilder：可变的，jdk5.0，线程不安全的

        开发中需要频繁的针对于字符串进行增删改查等操作，建议使用StringBuffer，StringBuilder替换String，
        因为String效率低

        常用方法：
            增：
                append(xx)
            删：
                delete(int start,int end)
                deleteCharAt(int index)
            改：
                replace(int start,int end,String str)
                setChatAt(int index,char c)
            查：
                chatAt(int index)
            插入：
                insert(int index,xx)
