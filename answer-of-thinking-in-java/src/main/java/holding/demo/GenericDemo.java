package holding.demo;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/2 12:40
 * Program Goal:
 *********************************************/
public class GenericDemo<T,E> {
    private T a;
    private E name;

    public GenericDemo(T a, E name) {
        this.a = a;
        this.name = name;
    }

    public  static void main(float e) {
    }

    public static void main(String[] args) {
        new GenericDemo<>(1,"yangjunst").main(1.0f);

    }
}
