package operators.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/12 18:44
 * Program Goal:
 * & | ^ ~按位运算符在布尔值中的应用
 *********************************************/
public class BitwiseOperatorsDemo {

    public static boolean test1() {
        System.out.println("test1");
        return true;
    }

    public static boolean test2() {
        System.out.println("test2");
        return true;
    }

    public static boolean test3() {
        System.out.println("test3");
        return false;
    }

    public static boolean test4() {
        System.out.println("test4");
        return false;
    }


    public static void main(String[] args) {
        boolean b = test1();
        System.out.println(b);
        b|=true;
        System.out.println(b);
        boolean c=!b;
        System.out.println(c);

    }

}
