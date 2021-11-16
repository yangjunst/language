package operators.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/12 15:00
 * Program Goal:布尔类型的数据不能进行大小比较运算
 * ，只能有等于不等于运算
 * *********************************************/
public class BooleanCompareDemo {
    public static void main(String[] args) {
        Boolean b=new Boolean(true);
        Boolean e=new Boolean(true);
        boolean d=true;
//        System.out.println(b>c);
        System.out.println(b==e);  //false
        System.out.println(b==d);  //true
    }
}
