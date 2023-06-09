import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * ClassName: guess
 * Package: PACKAGE_NAME
 * Description:
 * <p>
 * Author: Kanzaki
 * Create: 2023/04/16-9:59
 */
public class guess {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random();

        while (set.size() < 6) {
            int num = random.nextInt(43) + 1;
            set.add(num);
        }

        int[] arr = new int[6];
        int i = 0;
        for (int num : set) {
            arr[i++] = num;
        }

        System.out.println("随机生成的数字为：" + Arrays.toString(arr));
    }
}
