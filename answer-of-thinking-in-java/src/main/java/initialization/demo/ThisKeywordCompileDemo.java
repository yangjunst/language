package initialization.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/15 14:41
 * Program Goal:
 *********************************************/
public class ThisKeywordCompileDemo {
    ThisKeywordCompileDemo(){this(1);}
    ThisKeywordCompileDemo(int a){this("",a);}
    ThisKeywordCompileDemo(String str){}
    ThisKeywordCompileDemo(String str,int a){}
    public void main1() {
//        this("");
        main2();
        main3();
    }

    public void main2() {

    }

    public void main3() {

    }

    public static void main(String[] args) {
        ThisKeywordCompileDemo demo = new ThisKeywordCompileDemo();
        demo.main1();
    }
}
