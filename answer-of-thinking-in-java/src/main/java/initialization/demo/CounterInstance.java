package initialization.demo;

import java.util.stream.IntStream;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/15 15:44
 * Program Goal:
 * 检验Thinking In Java中的静态counter的使用困扰
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
