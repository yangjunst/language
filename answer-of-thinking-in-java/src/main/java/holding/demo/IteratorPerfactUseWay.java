package holding.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/3 9:31
 * Program Goal:
 * Iterator在for循环中的新颖实用方式
 *********************************************/
public class IteratorPerfactUseWay {
    private static final List<String> s = Arrays.asList("A", "B", "C", "D");


    static void perfactWay() {
        for (Iterator it = s.iterator(); it.hasNext(); System.out.println(it.next())) ;
    }

    public static void main(String[] args) {
        perfactWay();
    }
}
