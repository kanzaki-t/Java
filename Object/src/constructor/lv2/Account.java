package constructor.lv2;

/**
 * ClassName: Account
 * Package: constructor.lv2
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/28-15:09
 */
public class Account {
    private int id;
    private double yue;

    // 构造器,初始账户状态
    public Account(int i,double y){
        id = i;
        yue = y;
    }

    public int getId(){
        return id;
    }

    public double getYue(){
        return yue;
    }

    // 取钱
    public void withdraw(double money){
        if(yue >= 0 && money <= yue){
            yue -= money;
            System.out.println("成功取出：" + money);
        }else{
            System.out.println("余额不足：" + yue);
        }
    }

    // 存钱
    public void deposit(double money){
        if(money > 0 ){
            yue += money;
            System.out.println("成功存入：" + money);
        }else {
            System.out.println("存款失败");
        }
    }
}
