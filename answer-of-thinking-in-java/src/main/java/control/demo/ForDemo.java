package control.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/14 10:23
 * Program Goal:
 * ����forѭ���Ĳ�����䣬��������������������ִ�У�
 * ֻ��һ��ѭ�����������󣬲Ż�ִ�в�����䡣
 * ��ѭ������û��break���ж����,����continueʱ���Խ���ִ�С�
 *********************************************/
public class ForDemo {
    public static void forDemo() {
        int a = 5;
        int b = 2;
        for (; a > b; b++, System.out.print(b + ",")) {
            continue;
        }
    }

    public static void Two() {
        int i = 0, j = 0;
        ok:
        for (i = 0; i < 15; i++) {
            System.out.println("outer---i----->" + i + " j--------->" + j);
            for (j = 10; j < 20; j++) {
                System.out.println("inner---i----->" + i + " j--------->" + j);
                if (i > j) {
                    System.out.println("ok");
                    continue ok;
                }
            }
        }
    }


    public static void Three() {
        int i = 0, j = 0;

        for (i = 0; i < 10; i++) {
            ok:
            for (j=0; j < 20; j++) {
                System.out.println("---i----->" + i + " j--------->" + j);
                continue ok;
            }
        }
    }


    public static void main(String[] args) {
        Three();
    }
}
