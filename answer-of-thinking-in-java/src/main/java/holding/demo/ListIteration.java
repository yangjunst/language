package holding.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/3 10:39
 * Program Goal:
 * ListIteration得到的默认索引，
 * 及hasPrevious与previous方法
 * 的使用场景
 *
 *********************************************/
public class ListIteration {
    static List<Integer> ints = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7));

    public static void main(String[] args) {
        ListIterator<Integer> integerListIterator = ints.listIterator(4);
        while (integerListIterator.hasPrevious()){
            System.out.println(integerListIterator.previous());
        }
    }
}
