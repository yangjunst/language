package innerclasses.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/1 8:05
 * Program Goal:
 *********************************************/
public class InnerInterface {
    interface InterfaceExample{
        void show();
        void display();
    }
    class A implements InterfaceExample{

        @Override
        public void show() {

        }

        @Override
        public void display() {
            System.out.println("display...");
        }
    }

    InterfaceExample get(){
        return new A();
    }
}
class Example{
    public static void main(String[] args) {
        InnerInterface innerInterface=new InnerInterface();
        InnerInterface.InterfaceExample interfaceExample = innerInterface.get();
        interfaceExample.display();

    }
}