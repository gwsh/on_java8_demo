import static Range.Range.*;

/**
 * @program on_java8_demo
 * @description:
 * @author: gwsh
 * @create: 2020/03/22 18:45
 */
public class ForInInt {
    public static void main(String[] args) throws Exception {
        int[] range = range(10,1,100);
        for(int i : range){
            System.out.print(i+" ");
        }
    }
}
