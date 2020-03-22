import java.util.Random;

/**
 * @program on_java8_demo
 * @description:
 * @author: gwsh
 * @create: 2020/03/22 18:20
 */
public class ForIn {
    public static void main(String[] args) {
        Random random = new Random(47);
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt(100);
        }
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
