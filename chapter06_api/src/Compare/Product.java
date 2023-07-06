package Compare;

/**
 * ClassName: Product
 * Package: Compare
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/06/21-10:49
 */
public class Product implements Comparable{
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        // 如果比较对象的类和当前类一致则返回0
        if(o == this){
            return 0;
        }

        // 如果比较对象的类是Product的实例
        if(o instanceof Product){
            // 则把比较对象进行强转
            Product p = (Product) o;

            // 比较当前类的价格和比较对象类的价格
            int value = Double.compare(this.price, p.price);

            // 如果价格不相等，则返回value
            if(value != 0){
                return value;
            }

            return this.name.compareTo(p.name);
        }
        throw new RuntimeException("类型不对");
    }
}
