package reusing.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/5 9:35
 * Program Goal:
 * �����Ƿ�̳��˸���ľ�̬��Ա:can
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
