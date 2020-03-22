/**
 * @program on_java8_demo
 * @description:
 * @author: gwsh
 * @create: 2020/03/22 18:10
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++)
            if (Character.isLowerCase(c))
                System.out.println("value: " + (int) c + " character: " + c);
        demo();
    }

    public static void demo() {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {

            System.out.println("i = " + i + " j = " + j);

        }
    }
}
