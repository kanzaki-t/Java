package constructor.lv2;

/**
 * ClassName: Person
 * Package: constructor.lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/28-15:16
 */
public class Person {
    private String name;
    private int age;
    // 自定义一个账户类
    private Account account;

    public Person(String n,int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAccount(Account a){
        account = a;
    }

    public  Account getAccount(){
        return  account;
    }
}
