package reusing.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/17 16:05
 * Program Goal:
 * super�ؼ��ֵ��ø��෽����ֱ�����ϵ���
 * �ҵ������һ������
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
