- 单元测试
    黑盒测试：不关注源码
    白盒测试：关注源码

    1.需要导入的包
        junit-4.12.jar
        hamcrest-core-1.3.jar

    2.导入步骤
        File -> Project Structure -> Libraries -> + -> Java
        -> 导入的包的文件夹的路径 -> Modules -> Dependencies

    3.格式：
        @Test

    4.创建单元测试类
        要求：必须是public，非抽象的，包含唯一的无参构造器(一般不用写构造器)
            @Test 标记的方法本身必须是public，非抽象的，非静态的，void无返回值，（）无参数的