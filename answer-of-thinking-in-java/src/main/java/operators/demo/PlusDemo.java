package operators.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/9 19:32
 * Program Goal:
 * 自增等操作符用于基本数据类型
 * Integer属于int的包装类，未初始化就++或者>等运算
 * 会报空指针异常
 *********************************************/
public class PlusDemo {
    private static Integer a;
    private static int x;
    public static void main(String[] args) {
        /*Integer integer = a++;
        System.out.println(integer);*/
        int i = x++;
        System.out.println(i);
    }
}
