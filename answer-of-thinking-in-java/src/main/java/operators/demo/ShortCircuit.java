package operators.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/12 16:25
 * Program Goal:
 * 逻辑运算的短路运算
 *********************************************/
public class ShortCircuit {

    public static boolean test1(int val) {
        System.out.println("test1");
        return val > 3;
    }

    public static boolean test2(int val) {
        System.out.println("test2");
        return val > 5;
    }

    public static boolean test3(int val) {
        System.out.println("test3");
        return val > 10;
    }

    public static void main(String[] args) {
        boolean b = test1(4) && test2(3) && test3(5);
        System.out.println(b);
//        boolean b1 = ~b;  布尔值不能进行按位取反

    }
}
