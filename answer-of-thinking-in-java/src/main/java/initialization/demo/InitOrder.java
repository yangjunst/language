package initialization.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/10/3 18:05
 * Program Goal:
 *********************************************/
class SuperExample{
    static{
        System.out.println("super static");
    }
    {
        System.out.println("super constructor block");
    }

    SuperExample(){
        System.out.println("super constructor....");
    }
}
public class InitOrder extends SuperExample{
    static {
        System.out.println("sub static");
    }
    {
        System.out.println("sub constructor block...");
    }

    InitOrder(){
        System.out.println("super constructor...");
    }

    public static void main(String[] args) {
        new InitOrder();
    }
}
