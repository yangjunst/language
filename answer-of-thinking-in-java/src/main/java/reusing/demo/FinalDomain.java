package reusing.demo;

import java.util.Random;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/19 16:03
 * Program Goal:
 * ��̬������ֻ����static���г�ʼ�������ʽ��ʼ��
 * ���ɱ����캯����ʼ��
 *********************************************/
public class FinalDomain {
    private static final String NAME;

    static {
        NAME = "yangjun";
    }

    public FinalDomain(String NAME) {
    }

    @Override
    public String toString() {
        return "FinalDomain{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}

class TestFinal {
    private final int rand=new Random().nextInt(100);
    public static void main(String[] args) {
        int rand1 = new TestFinal().rand;
        int rand2 = new TestFinal().rand;
        int rand3 = new TestFinal().rand;
        int rand4 = new TestFinal().rand;

        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);
        System.out.println(rand4);
    }
}