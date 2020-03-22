import static Range.Range.*;

/**
 * @program on_java8_demo
 * @description:
 * @author: gwsh
 * @create: 2020/03/22 18:45
 */
public class ForInInt {
    public static void main(String[] args) {
        int[] range = range(10,10,1000,3);
        for(int i : range){
            System.out.print(i+" ");
        }
    }
}
