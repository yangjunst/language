package reusing.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/17 14:47
 * Program Goal:
 * �����ÿ���ֱ�ӱ���ӡ
 * ��null�ؼ��ֲ��ܱ�ֱ�Ӵ�ӡ��
 * ��Ϊprintln()���طֲ���
 *********************************************/
public class PrintNullReferenceDemo {
    private static PrintNullReferenceDemo demo;

    public static void main(String[] args) {
        System.out.println(demo);
//        System.out.println(null);
    }
}
