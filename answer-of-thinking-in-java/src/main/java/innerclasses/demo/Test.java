package innerclasses.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/31 17:21
 * Program Goal:��̬��Ա���������ڲ������
 * *********************************************/
interface Factory{
    void show(String name);

    void diplay(Integer age);
}
public class Test {
    private static Factory factory=new Factory() {
        @Override
        public void show(String name) {
            System.out.println("show "+name);
        }

        @Override
        public void diplay(Integer age) {
            System.out.println("display "+age);
        }
    };

    public static void main(String[] args) {
        factory.show("yangjunst");
        factory.diplay(31);
    }
}
