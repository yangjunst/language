package access.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/16 13:56
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
