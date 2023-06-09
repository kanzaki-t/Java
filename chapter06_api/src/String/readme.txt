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