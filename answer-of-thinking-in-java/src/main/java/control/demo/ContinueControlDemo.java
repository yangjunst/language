package control.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/19 20:34
 * Program Goal:
 *********************************************/
public class ContinueControlDemo {
    public static void main(String[] args) {
        OK:
        for (int i = 0; i < 3; i++) {
            System.out.println("yes"+i);
            for (int j = 0; j < 3; System.out.println("-->" + j)) {
                System.out.println("ok"+j);
                continue OK;
            }
        }
    }
}
