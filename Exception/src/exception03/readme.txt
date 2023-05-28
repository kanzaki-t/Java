- 自定义异常类
    1.继承于现有的异常体系。通常继承RuntimeException或者Exception
    2.通常提供几个重载的构造器
    3.提供一个全局变量，声明为：static final long serialVersionUID = -33875416999L

    为什么要用自定义类？
        通过异常的名称就能直接判断此异常的原因，见名知意