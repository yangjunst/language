package holding.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/3 12:03
 * Program Goal:
 * Idea�༭���Խӿڶ�����÷�����
 * �����ܻ�����ʵ���෽����
 *********************************************/
interface QueueExample{
    void show();
    void display();
}
class QueueExampleImpl implements QueueExample{

    public void love(){}
    public void hate(){}

    @Override
    public void show() {

    }

    @Override
    public void display() {

    }
}
public class QueueClass {
    public static void main(String[] args) {
      QueueExample example=new QueueExampleImpl();
      ((QueueExampleImpl) example).love();
      ((QueueExampleImpl) example).hate();
      example.display();
      example.show();
    }
}
