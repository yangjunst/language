package operators.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/12 15:32
 * Program Goal:
 * 对于浮点数包装类比较，也会为false;
 *********************************************/
public class NumberCompareDemo {
    public static void main(String[] args) {
        Double a = 1.0;
        Double b = 1.0;
        System.out.println(a == b);//false
        Float c = 1.0f;
        Float d = 1.0f;
        System.out.println(c == d);//false
    }
}
