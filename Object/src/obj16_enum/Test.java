package obj16_enum;

/**
 * ClassName: Test
 * Package: obj16_enum
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/10-15:54
 */
public class Test {
    public static void main(String[] args) {

        // 枚举类常用方法

        // 1.toString() 可以重写成想要的格式，不重写得到对象名 SPRING
        System.out.println(Season1.SPRING);

        // 2.name() 可以得到对象名 SPRING
        System.out.println(Season1.SPRING.name());

        // 3.values() 用枚举类类型的数组接收所有对象
        Season1[] season = Season1.values();
        for (int i = 0; i < season.length; i++) {
            System.out.println(season[i]);
        }

        // 4.valueOf() 通过传参对象名，可以得到指定对象名的对象，如果参数跟任何对象名都不一样，则会报错
        System.out.println(Season1.valueOf("AUTUMN"));

        // 5.ordinal() 返回当前枚举常量的次序号（第几个声明）默认从0开始
        System.out.println(Season1.WINTER.ordinal()); // 3

        // 接口
        Season2.WINTER.show();
    }
}

enum Season1 {
    // 1.必须在枚举类的开头声明多个对象，对象之间用 , 隔开
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","白雪皑皑");

    // 2.声明当前类的对象的实例变量，使用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    // 3.私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}

interface Info1{
    void show();
}

enum Season2 implements Info1{
    // 1.必须在枚举类的开头声明多个对象，对象之间用 , 隔开
    SPRING("春天","春暖花开"){
        public void show() {
            System.out.println("桃花");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        public void show() {
            System.out.println("荷花");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        public void show() {
            System.out.println("枫叶");
        }
    },
    WINTER("冬天","白雪皑皑"){
        public void show() {
            System.out.println("梅花");
        }
    };

    // 2.声明当前类的对象的实例变量，使用private final修饰
    private final String seasonName;
    private final String seasonDesc;

    // 3.私有化类的构造器
    private Season2(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
