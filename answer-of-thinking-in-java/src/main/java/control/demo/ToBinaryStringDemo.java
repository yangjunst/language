package control.demo;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/14 11:48
 * Program Goal:
 * �Զ��彫����ת��Ϊ�������ַ���
 *********************************************/
public class ToBinaryStringDemo {
    private static void toBinaryString(int i) {
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] =
                    ((i & 0x01) != 0) ? '1' : '0';
            i >>>= 1;
        } while (i != 0);
        for (int j = bufferPosition; j < 32; j++) {
            printnb(buffer[j]);
        }
        print();
    }

    public static void main(String[] args) {
        toBinaryString(0x12);
    }
}
