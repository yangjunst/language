package operators.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/12 16:25
 * Program Goal:
 * �߼�����Ķ�·����
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
//        boolean b1 = ~b;  ����ֵ���ܽ��а�λȡ��

    }
}
