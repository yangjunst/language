package reusing.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/18 19:58
 * Program Goal:
 *********************************************/
class SuperClassDemo {
    protected int a=10;
}
public class TheSameFieldInParentAndSubClass extends SuperClassDemo{
    public int a=20;

    public static void main(String[] args) {
        int a = new TheSameFieldInParentAndSubClass().a;
        System.out.println(a);

    }

}
