package reusing.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/19 18:54
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
