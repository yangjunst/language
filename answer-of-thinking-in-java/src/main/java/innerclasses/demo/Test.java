package innerclasses.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/31 17:21
 * Program Goal:静态成员创造匿名内部类对象
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
