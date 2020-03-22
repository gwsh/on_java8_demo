/*
 * @Description:
 * @Author: gwsh
 * @Date: 2020-03-22 11:27:04
 * @LastEditTime: 2020-03-22 11:35:32
 * @LastEditors: gwsh
 */

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();

        Tank t2 = new Tank();

        t1.level = 9;

        t2.level = 47;
        // 56
        // 9 47
        System.out.println("1: t1.level: " + t1.level +

                ", t2.level: " + t2.level);

        t1 = t2;
        // 94
        // 47 47
        System.out.println("2: t1.level: " + t1.level +

                ", t2.level: " + t2.level);

        t1.level = 27;
        // 74
        // 27 27
        /**
         * 非基本数据类型 赋值 是赋值 对象的引用
         * 记住了 此时 t1 和t2 是指向同一个内存地址 对象的复制 是一个引用复制
         * 他们此刻操作的是同一个对象 所以你改变 t1 其实同时改变了 t2
         */
        System.out.println(": t1.level: " + t1.level +
                ", t2.level: " + t2.level);
        /**
         * 注: 上面那种情况 ；其实就是编程中常常会出现的别名现象 其实他们只是变量名的不同
         * 实际上他们操作的都是 堆内存中的同一个 对象地址
         * 为了避免这种情况 你可以使用 t1.level =  t2.level 这样的话 你只是操作一个基本数据类型的复制
         * 切记！！！！！
         */
    }

}

class Tank {

    int level;

}