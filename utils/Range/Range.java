package Range;

import java.util.Random;

/**
 * @program on_java8_demo
 * @description: 生成指定长度的数据并返回
 * @author: gwsh
 * @create: 2020/03/22 18:26
 */
public class Range {

    private static Random random = null;
    private final static int INT_M = Integer.MAX_VALUE;

    static {
        random = new Random(47);
    }

    /**
     * int 类型
     *
     * @param length
     * @return
     */
    public static int[] range(int length) {
        checkLength(length);
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(INT_M - 1);
        }
        return ints;
    }

    /**
     * @param length 数组长度
     * @param end    数组内部数据的返回 默认是0开始到end
     * @return 返回一个int类型的对象 长度为length 每一个元素的范围是 0-end的整数
     */
    public static int[] range(int length, int end) {
        checkLength(length);
        if (end == 0) {
            new Exception("end cannot be zero");
            return null;
        }
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = random.nextInt(end);

        }
        return ints;
    }

    /**
     * 生成一个指定阶梯的 数组
     *
     * @param length
     * @param start
     * @param end
     * @param equal
     * @return
     */
    public static int[] range(int length, int start, int end, int equal) {
        checkNegativeNumber(start);
        checkLength(length);
        int[] ints = new int[length];
        int _int = start;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                ints[i] = _int;
            } else {
                _int = _int + equal;
                ints[i] = _int;
            }
        }
        return ints;
    }

    /**
     * 生成一个指定长度 且 可以指定数据元素的范围
     *
     * @param length
     * @param start
     * @param end
     * @return
     */
    public static int[] range(int length, int start, int end) {
        checkNegativeNumber(start);
        checkLength(length);
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i] = intBuilder(start, end);
        }
        return ints;
    }

    /**
     * 用于生成指定范围的一个随机数
     *
     * @param start
     * @param end
     * @return
     */
    public static int intBuilder(int start, int end) {
        checkNegativeNumber(start);
        int result = random.nextInt(end);
        while (result < start) {
            result = random.nextInt(end);
        }
        return result;
    }

    /**
     * 用来判断数组长度是否大于1的
     *
     * @param length
     * @return
     */
    private static boolean checkLength(int length) {
        if (length < 2) {
            new Exception("length is not or length < 2");
            return false;
        } else {
            return true;
        }
    }

    /**
     * 判断是否为负数
     *
     * @param i
     * @return
     */
    public static boolean checkNegativeNumber(int i) {
        if (i < 0) {
            new Exception("length is not or length < 2");
            return false;
        } else {
            return true;
        }
    }
}
