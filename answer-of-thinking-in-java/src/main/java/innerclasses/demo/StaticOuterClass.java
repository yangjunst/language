package innerclasses.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/31 20:23
 * Program Goal:
 *********************************************/
public class StaticOuterClass {
    private static class InnerClass{
        private static String name;
        private static int age;
        private static class InnerInnerClass{

        }
        class InnerInnerClass2{
            private String addr;

        }

    }

    public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}
