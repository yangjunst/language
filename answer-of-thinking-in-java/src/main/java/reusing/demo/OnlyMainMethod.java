package reusing.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/17 15:25
 * Program Goal:
 * ÿ�����ļ��ж�����ͬʱ����main()������
 * ������̬�ڲ���
 *********************************************/
public class OnlyMainMethod {
    public static void main(String[] args) {
        System.out.println("Only");
    }

    static class Inner{
        public static void main(String[] args) {
            System.out.println("Inner");
        }
    }
}
