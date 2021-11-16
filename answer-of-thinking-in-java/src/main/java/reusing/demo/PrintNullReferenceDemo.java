package reusing.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/17 14:47
 * Program Goal:
 * 空引用可以直接被打印
 * 但null关键字不能被直接打印，
 * 因为println()重载分不清
 *********************************************/
public class PrintNullReferenceDemo {
    private static PrintNullReferenceDemo demo;

    public static void main(String[] args) {
        System.out.println(demo);
//        System.out.println(null);
    }
}
