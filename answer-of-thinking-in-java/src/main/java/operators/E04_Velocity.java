package operators;

import java.util.Arrays;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/9 20:38
 * Program Goal:
 * javac -g package\*.java
 * -g可以使得编译后的字节码保留变量的原始值
 *********************************************/
public class E04_Velocity {
    public static void main(String[] args) {
//    args仅仅判断长度小于某个数值，而不是等于，
//    这样可以为多出的命令行参数作为兼容处理
        if (args.length < 2) {
            System.err.println(
                    "Usage: java E04_Velocity distance time");
            System.exit(1);
        }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.print("Velocity = ");
        System.out.print(distance / time);
        System.out.println(" m/s");
        System.out.println("-------------------");
        System.out.println(Arrays.toString(args));
    }
}