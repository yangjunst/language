package operators.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/12 18:44
 * Program Goal:
 * & | ^ ~��λ������ڲ���ֵ�е�Ӧ��
 *********************************************/
public class BitwiseOperatorsDemo {

    public static boolean test1() {
        System.out.println("test1");
        return true;
    }

    public static boolean test2() {
        System.out.println("test2");
        return true;
    }

    public static boolean test3() {
        System.out.println("test3");
        return false;
    }

    public static boolean test4() {
        System.out.println("test4");
        return false;
    }


    public static void main(String[] args) {
        boolean b = test1();
        System.out.println(b);
        b|=true;
        System.out.println(b);
        boolean c=!b;
        System.out.println(c);

    }

}
