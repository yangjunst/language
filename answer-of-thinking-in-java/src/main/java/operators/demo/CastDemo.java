package operators.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/14 8:36
 * Program Goal:
 *********************************************/
public class CastDemo {
    public static void cast() {
        byte b=-100;
        System.out.println(Integer.toBinaryString(b));
        int i=b;
        System.out.println(Integer.toBinaryString(i));
        long l=i;
        System.out.println(Long.toBinaryString(l));
        float f=b;
        float max=Short.MAX_VALUE;
        System.out.println(f);
        System.out.println(max+"---->"+Long.MAX_VALUE);
    }

    public static void plusForByteAndShort() {
        byte a=2;
        byte b=3;
        byte c=-13-115;
    }

    public static void main(String[] args) {
        plusForByteAndShort();
    }
}
