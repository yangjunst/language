package holding.demo;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/2 12:40
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
