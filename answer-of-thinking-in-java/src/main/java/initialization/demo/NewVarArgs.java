package initialization.demo;

import java.util.Date;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/15 18:22
 * Program Goal:
 *********************************************/
public class NewVarArgs {
    public static void m(String... args) {
        System.out.println(args.getClass());
    }
    public static void m1(int... args) {
        System.out.println(args.getClass());
    }
    public static void m2(Integer... args) {
        System.out.println(args.getClass());
    }
    public static void main(String[] args) {
        m();
        m1();
        m2();
        System.out.println(new Date().getClass());
    }
}
