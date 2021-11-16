package holding.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/3 12:03
 * Program Goal:
 * Idea编辑器对接口对象调用方法，
 * 会智能回显着实现类方法。
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
