package innerclasses.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/31 20:15
 * Program Goal: 普通内部类里面不能有
 * 静态数据域,静态方法,静态内部类
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
