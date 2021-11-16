package initialization.demo;

import java.util.stream.IntStream;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/15 15:44
 * Program Goal:
 * ����Thinking In Java�еľ�̬counter��ʹ������
 *********************************************/
public class CounterInstance {
    static int counter;
    int id = counter++;

    public void show() {
        System.out.println(this + " id----->" + id);
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10).forEach((e) -> {
            new CounterInstance().show();
        });
    }
}
