package reusing.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/18 19:58
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
