package reusing.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/5 9:35
 * Program Goal:
 * 子类是否继承了父类的静态成员:can
 *********************************************/
class SuperExample{
    static String name="yangjunst";
    static void display(){
        System.out.println("display--->"+name);
    }
}

public class StaticClassDemo extends SuperExample{
    public static void main(String[] args) {
        String name = StaticClassDemo.name;
        System.out.println(name);
        StaticClassDemo.display();
        StaticClassDemo demo=new StaticClassDemo();
        System.out.println(demo.name);
        demo.display();

                

    }
}
