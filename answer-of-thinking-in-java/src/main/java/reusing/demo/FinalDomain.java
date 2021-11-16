package reusing.demo;

import java.util.Random;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/19 16:03
 * Program Goal:
 * 静态常量域只能在static块中初始化或饿汉式初始化
 * 不可被构造函数初始化
 *********************************************/
public class FinalDomain {
    private static final String NAME;

    static {
        NAME = "yangjun";
    }

    public FinalDomain(String NAME) {
    }

    @Override
    public String toString() {
        return "FinalDomain{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}

class TestFinal {
    private final int rand=new Random().nextInt(100);
    public static void main(String[] args) {
        int rand1 = new TestFinal().rand;
        int rand2 = new TestFinal().rand;
        int rand3 = new TestFinal().rand;
        int rand4 = new TestFinal().rand;

        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);
        System.out.println(rand4);
    }
}