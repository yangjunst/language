package operators.demo;

import static net.mindview.util.Print.print;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/13 16:50
 * Program Goal:
 * ������λ������ĸ������
 * answer:
 * ��Ҫ��λ��λ�����ڱ���������Ӧ�����������ܱ�ʾ�����λ��ʱ��
 * ��ô�Ƚ�Ҫ����λ���Ը��������ܱ�ʾ�����λ�������
 * �ٽ�����������λ����������Ӧ����ֵ��Ч�����䡣��
 * ����100>>35=100>>(35%32)=100>>3=12��
 *********************************************/
public class URShift {
    public static void IntAndLong() {
        int i = -1;
        System.out.println(i >>> 2);
        System.out.println(Integer.MAX_VALUE / 2);
        System.out.println(Integer.MAX_VALUE);
        long b = i << 10;
        System.out.println(Long.toBinaryString(b).length());
        System.out.println(Integer.toBinaryString((int) b).length());
        long c = i >>> 10;
        System.out.println(Long.toBinaryString(c).length());
        long d = i >> 10;
        System.out.println(Long.toBinaryString(d));
        int a = -0x333;
        System.out.println(Integer.toBinaryString(a));
        int x = a >>> 20;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        long y = x;
        System.out.println(Long.toBinaryString(y));
    }

    public static void Short1() {
        short s = -1;
        print(Integer.toBinaryString(s));
        s >>>= 10;
        print(Integer.toBinaryString(s));

    }



    public static void Short3() {
        short s = -1;
        print(Integer.toBinaryString(s));
        print(Integer.toBinaryString(s).length());
        System.out.println("------------------");
        int i=s>>>94;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i).length());
        System.out.println(Integer.toBinaryString(i));
        System.out.println("------------------");
        s >>>= 33;
        print(Integer.toBinaryString(s));
        print(Integer.toBinaryString(s).length());

    }
    public static void Short2() {
        short s = -1;
        int i = s >>> 10;
        print(i);
        print(Integer.toBinaryString(i));
        print(Integer.toBinaryString(i).length());
        s>>>=10;
        System.out.println("===============");
        print(s);
        print(Integer.toBinaryString(s));
        print(Integer.toBinaryString(s).length());
    }

    public static void cutLowBit() {
        int i=0b1001101111011;
        System.out.println(Integer.toBinaryString(i));
        byte b=(byte)i;
        b>>>=2;
        System.out.println(Integer.toBinaryString(b));
    }
    public static void main(String[] args) {
        cutLowBit();
    }
}
