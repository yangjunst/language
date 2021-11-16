package operators.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/9 19:32
 * Program Goal:
 * float与float类型的变量进行数值运算，
 * 那么得到的结果是double还是float
 *********************************************/
public class FloatDoubleDemo {
    public static void main(String[] args) {
        float m=Float.MIN_VALUE;
        float n=Float.MAX_VALUE;
        float x=n*m;
        System.out.println(x);
    }
}
