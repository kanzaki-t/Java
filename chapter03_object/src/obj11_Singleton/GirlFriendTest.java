package obj11_Singleton;

/**
 * ClassName: GirlFriendTest
 * Package: obj11_Singleton
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/05-22:17
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        System.out.println(GirlFriend.getInstance());
    }
}

class GirlFriend{

    private String name;
    private GirlFriend() {
    }

    private  static GirlFriend instance = new GirlFriend();

    public static GirlFriend getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
