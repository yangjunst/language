package reusing.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/17 15:55
 * Program Goal:
 * 静态方法不需要对象实例引用  eg:this,super
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
