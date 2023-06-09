package obj4_tem1;

/**
 * ClassName: CustomerList
 * Package: obj4_tem1
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/05/01-13:43
 */
public class CustomerList {
    // 用来保存客户对象的数组
    private Customer[] customers;

    // 记录已保存客户的数量
    private int total;

    /**
     * 用途：构造器，用来初始化customers数组
     * @param totalCustomer 指定数组长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 用途：将参数customer添加数组中最后一个客户对象记录之后
     * @param customer 指定要添加的客户对象
     * @return 添加成功返回true，数组满了返回false
     */
    public boolean addCustomer(Customer customer){
        if(total < customers.length){
            customers[total] = customer;
            total++;
            return true;
        }
        return false;
    };

    /**
     * 用途：用参数cust替换数组中由index指定的对象
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index >=0 && index < total){
            customers[index] = cust;
            return true;
        }
        return false;
    }

    /**
     * 用途：删除数组中由index指定的对象
     * @param index
     * @return
     */
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }

        // 思路是指定脚标的元素之后的元素都往前覆盖一位，原本最后一位赋值为null
        for (int i = index;i < total-1;i++){
            customers[i] = customers[i+1];
        }

        customers[total] = null;
        total--;
        return true;
    };

    /**
     * 用途：获取当前所有的信息
     * @return
     */
    public Customer[] getAllCustomers() {
        // return customers; 这么写会把所有都显示出来，比如数组长度为10，只添加了两个元素，这个时候这么写就会把其他null的都显示

        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 用途：返回指定index的元素
     * @param index
     * @return
     */
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }else{
            return customers[index];
        }
    }

    public  int getTotal(){
        return total;
    }
}
