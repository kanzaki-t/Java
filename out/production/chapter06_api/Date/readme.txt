-jdk8之前
    1.currentTimeMillis()
        获取当前时间对应的毫秒数，long类型，时间戳
        当前时间与1970年1月1日0时0分0秒之间的毫秒数
        常用来计算时间差

    2.两个Date类
        java.util.Date
            两个构造器的使用
                1.空参
                2.放入long型的毫秒数
            两个方法的使用
                1.toString()
                2.getTime()
        java.sql.Date  对应着数据库中的Date类型
            没有空参构造器，只有放入long型的毫秒数
            方法一样

    3.SimpleDateFormat类
        用于日期时间的格式化和解析
        格式化：日期 ---> 字符串
        解析：字符串 ---> 日期

    4.Calendar类
        1.实例化
            由于Calender是一个抽象类，所以我们需要创建其子类的实例。
            这里我们通过Calendar的静态方法 getInstance() 即可获取
        2.方法
            get() set() add() getTime() setTime()

-jdk8之后
    LocalDate LocalTime LocalDateTime

    Instant:瞬时
