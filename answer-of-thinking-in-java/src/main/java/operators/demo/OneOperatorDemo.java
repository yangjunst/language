package operators.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/9 20:47
 * Program Goal:
 *   int c=a*-b;
 *   a*-b�е�-b������Ϊһ������ȥ��a���в���
 *********************************************/
public class OneOperatorDemo {
    public static void main(String[] args) {
        byte a=-1;
        short b=3;
        int c=a*-b;
        System.out.println(c);
    }
}
