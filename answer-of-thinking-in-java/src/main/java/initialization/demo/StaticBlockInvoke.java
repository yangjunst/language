package initialization.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/15 17:09
 * Program Goal:
 * 引发定位某个类的字节码文件的情况：
 * 1，调用类的静态域或静态方法
 * 2，Class.forName(name);
 * 3,new对象
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
