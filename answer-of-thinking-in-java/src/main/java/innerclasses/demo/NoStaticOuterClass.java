package innerclasses.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/31 20:15
 * Program Goal: ��ͨ�ڲ������治����
 * ��̬������,��̬����,��̬�ڲ���
 *********************************************/
public class NoStaticOuterClass {
    class InnerClass{
        private InnerClass(){
            System.out.println("InnerClass Constructor...");
        }
//        private static String name="yangjunst";
//        private static void show(){
//            System.out.println("show-->"+name);
//        }
//
//        static class InnerInnerClass{
//            private String addr;
//            private int age;
//        }
    }

    public static void main(String[] args) {
        NoStaticOuterClass outerClass=new NoStaticOuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);
    }
}
