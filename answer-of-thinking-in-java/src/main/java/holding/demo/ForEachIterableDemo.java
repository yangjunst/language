package holding.demo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/24 18:35
 * Program Goal:
 *********************************************/
//interface Iterable<T>{
//    Iterator<T> iterator();
//}
public class ForEachIterableDemo implements Iterable<String>{
    static List<String> stringList=new ArrayList<>();
    public static void main(String[] args) {

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        System.out.println(stringList);
        for(String s:new ForEachIterableDemo()){
            System.out.println(s);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return stringList.iterator();
    }
}
