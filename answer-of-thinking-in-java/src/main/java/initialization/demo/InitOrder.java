package initialization.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/10/3 18:05
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
