package reusing.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/17 16:05
 * Program Goal:
 * super关键字调用父类方法，直接往上倒，
 * 找到最近的一个运行
 *********************************************/
class Root{
    public  void main() {
        System.out.println("Root");
    }
}
class Parent extends Root {
    public void main() {
        System.out.println("Parent");
    }
}
public class TheWayOfUsingSuper extends Parent {
    public void main() {
        super.main();
    }
    public static void main(String[] args) {
        TheWayOfUsingSuper theWayOfUsingSuper=new TheWayOfUsingSuper();
        theWayOfUsingSuper.main();
    }
}
