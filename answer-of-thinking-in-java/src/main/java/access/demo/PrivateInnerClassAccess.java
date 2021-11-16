package access.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/16 13:56
 * Program Goal:
 *********************************************/
public class PrivateInnerClassAccess {
    private static class Inner{
        private static final String NAME="YANGJUN";

        private static void show() {
            System.out.println("show-->"+NAME);
        }
    }

    public static void main(String[] args) {
        Inner.show();
    }
}
