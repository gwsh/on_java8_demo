/*
 * @Description:
 * @Author: gwsh
 * @Date: 2020-03-22 11:49:17
 * @LastEditTime: 2020-03-22 17:48:42
 * @LastEditors: gwsh
 */
import java.util.Random;

public class Operator {
    private static Random random = new Random(47);

    public static void x0Demo(){
        int i = 2147483647;
        int i_ = 0x7fffffff;
        System.out.println("i:");
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i_));
        System.out.println(i==i_);
    }

    /**
     * 逻辑运算符
     */
    public static void logicOperator() {
        Integer i = random.nextInt(1000);
        Integer i2 = random.nextInt(1000);
        // 短路的逻辑运算符
        System.out.println(!(i < 100 && i2 > 100));
    }

    public static void main(String[] args) {
        short _short = 8;
        System.out.println(_short>>2);
        Operator.logicOperator();
        Operator.x0Demo();
        /**
         * 整除一个常识
         */
        System.out.println(3 / 2);
        System.out.println(3.0 / 2);
        /**
         * 还有 * 乘法 + 加号 -减号 %取模
         */
        // 取模的话就是余数  常用语来判断 奇数和偶数
        System.out.println(5 % 2);
        System.out.println(4 % 2);
        System.out.println(200 % 2);
        /**
         * 在java里面 也是和c++一样存在 简写形式
         * 我用加法做一个 案例
         */
        int result1 = 23;
        int result2 = 11;
        // 不简写的形式：
//        result1 = result1 + result2;
        // 简写形式
        result1 += result2;
        System.out.println(result1);

        // Random 随机数生成器
        int i = random.nextInt(100);
        int z = random.nextInt(100);
        System.out.println(z);
        System.out.println("随机数 " + i);

        // 一元加减法
        int e = 8;
        System.out.println("取反" + (-e + 8));
    }
}
