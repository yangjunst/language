package control.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/14 10:40
 * Program Goal:
 * ����char���ͱ�����ֵ���ֺ������
 *********************************************/
public class CharDemo {
    public static void main(String[] args) {
//        for (char c = 0; c < 128; c++) {
//            System.out.println("value: " + (int) c + " character: " + c);
//        }
        Character c=23,d=24,e=0,f='0';
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(d).equals(String.valueOf(c)));
        System.out.println(e==f);
    }
}
