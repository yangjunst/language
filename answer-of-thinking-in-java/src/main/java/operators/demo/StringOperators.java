package operators.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/14 8:25
 * Program Goal:
 * ����Integer.toString(),String.valueOf()
 *********************************************/
public class StringOperators {
    public static void IntProcess(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
       /* Integer x=null;
        IntProcess(x); *///java.lang.NullPointerException
        Integer a = -1;
        Integer b = null;
        System.out.println(a.toString());
        System.out.println(Integer.toString(b));
        System.out.println(String.valueOf(b));
        System.out.println(b.toString());
    }
}
