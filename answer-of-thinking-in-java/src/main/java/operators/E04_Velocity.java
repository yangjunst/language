package operators;

import java.util.Arrays;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/9 20:38
 * Program Goal:
 * javac -g package\*.java
 * -g����ʹ�ñ������ֽ��뱣��������ԭʼֵ
 *********************************************/
public class E04_Velocity {
    public static void main(String[] args) {
//    args�����жϳ���С��ĳ����ֵ�������ǵ��ڣ�
//    ��������Ϊ����������в�����Ϊ���ݴ���
        if (args.length < 2) {
            System.err.println(
                    "Usage: java E04_Velocity distance time");
            System.exit(1);
        }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.print("Velocity = ");
        System.out.print(distance / time);
        System.out.println(" m/s");
        System.out.println("-------------------");
        System.out.println(Arrays.toString(args));
    }
}