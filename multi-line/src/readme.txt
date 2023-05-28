- 多线程
    程序（program）：为完成特定任务，用某种语言编写的一组指令的集合。即指一段静态代码，静态对象。
    进程（process）：程序的一次执行过程，或是正在内存中运行的应用程序。是动态的。
    线程（thread）：进程可以进一步细化为线程，是程序内部的一条执行路径。一个进程中至少有一个线程。

    并行（parallel）：指两个或多个事件在同一时刻发生，比如多个人同时做不同的事。
    并发（concurrency）：指两个或多个事件在同一个时间段内发生。

    线程的创建方式一
        继承Thread类
            1.创建一个继承于Thread类的子类
            2.重写Thread类的run()方法 ----> 此线程要执行的操作，声明在此方法体中
            3.创建当前Thread子类的对象
            4.通过对象调用start()

    线程的创建方式二
        实现Runnable接口
            1.创建一个实现Runnable接口的类
            2.实现接口中的run()方法 ----> 此线程要执行的操作，声明在此方法体中
            3.创建当前实现类的对象
            4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
            5.Thread类的实例调用start()

    对比两种方式：
        共同点：
            1.启动线程，使用的都是Thread类中定义的start()方法
            2.创建的线程对象，都是Thread类或其子类的实例
        不同点：一个事类的继承，一个是接口的实现
        建议：使用Runnable
            原因：
                1.避免了类的单继承的局限性
                2.更适合处理有共享数据的问题


    线程的常用结构
        1.线程中的构造器
            public Thread():分配一个新的线程对象
            public Thread(String name):分配一个指定名字的新的线程对象
            public Thread(Runnable target):指定创建线程的目标对象，他实现了Runnable接口中的run方法
            public Thread(Runnable target,String name):分配一个带有指定目标新的线程对象并指定名字

        2.线程中常用的方法
            start():启动线程，调用线程的run()
            run():声明线程要执行的操作
            currentThread():获取当前执行代码对应的线程
            getName():获取当前执行代码对应的线程的名字
            setName():设置线程的名字
            sleep(毫秒值):静态方法，调用时，可以使得当前线程睡眠指定的毫秒数
            yield():一旦执行此方法，就释放cpu的执行权
            join():在线程A中，通过线程B调用join(),意味着线程A进入阻塞状态，直到线程B执行结束，线程A才结束阻塞状态，重新执行
            isAlive():判断线程是否还存活

        3.线程的优先级
            getPriority():获取当前线程的优先级
            setPriority():设置当前线程的优先级 // setPriority(Thread.MAX_PRIORITY)

            MAX_PRIORITY = 10
            MIN_PRIORITY = 1
            NORM_PRIORITY = 5

        4.生命周期

