package holding.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/1 17:24
 * Program Goal:
 * Arrays.asList() return
 * private static class ArrayList<E> extends AbstractList<E>
 * remove()/add()
 * Exception in thread "main" java.lang.UnsupportedOperationException
 * but can set(index,value);
 *********************************************/
public class ArrayAsListDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4,5);
//        list.add(1);
//        Integer remove = list.remove(1);
//        System.out.println(remove);
        list.set(2,20);
        System.out.println(list);
        System.out.println(list.getClass());
        List<Integer> integers=new ArrayList<>();
        integers.addAll(list);
        System.out.println(integers);
    }
}
