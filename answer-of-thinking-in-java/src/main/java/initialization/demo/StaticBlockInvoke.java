package initialization.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/15 17:09
 * Program Goal:
 * ������λĳ������ֽ����ļ��������
 * 1��������ľ�̬���̬����
 * 2��Class.forName(name);
 * 3,new����
 *********************************************/
public class StaticBlockInvoke {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.
        /*String name = Demo.class.getName();
        Class.forName(name);*/
        //2.
       /* Demo instance = Demo.instance;
        System.out.println(instance)  ;*/
       //3.
        /*Demo.show();*/


    }
}

class Demo {
    static Demo instance;

    static {
        System.out.println("static block invoke...");
        instance = new Demo();
    }

    static void show(){
        System.out.println("show...");
    }

    public Demo() {
        System.out.println("constructor....");
    }

}
