package innerclasses.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/31 20:23
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
