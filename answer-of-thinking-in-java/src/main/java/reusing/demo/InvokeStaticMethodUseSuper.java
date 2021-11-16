package reusing.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/17 15:55
 * Program Goal:
 * ��̬��������Ҫ����ʵ������  eg:this,super
 *********************************************/
class SuperClass{
    public static void show(String args) {
        System.out.println("super-->"+args);
    }
}
public class InvokeStaticMethodUseSuper extends SuperClass {
    public static void show(String args){
        System.out.println("sub--->"+args);
    }
    public static void main(String[] args) {
        SuperClass superClass=new InvokeStaticMethodUseSuper();
        superClass.show("a");
    }
}
