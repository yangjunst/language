package reusing.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/19 18:54
 * Program Goal:
 *********************************************/
class SuperClassExample {
    private static SuperClassDemo superClassDemo = printInit();

    private static SuperClassDemo printInit() {
        System.out.println("printInit...");
        return new SuperClassDemo();
    }

    static {
        System.out.println("static block...");
    }
}

public class InitialOrder extends SuperClassExample{
    static{
        System.out.println("sub static init...");
    }

    private static InitialOrder order=printInit();

    private static InitialOrder printInit() {
        System.out.println("printInit....");
        return new InitialOrder();
    }

    public static void main(String[] args) {
        System.out.println("main method");
        InitialOrder initialOrder = new InitialOrder();
        System.out.println(initialOrder);

    }

}
