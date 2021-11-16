package containers.demo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/29 17:31
 * Program Goal:
 *********************************************/
public class ListAddAllIndex {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collection<String> c=new HashSet<>();
        c.add("x");
        c.add("y");
        c.add("z");
        list.add("a");
        list.add("b");
        list.add("c");
        list.addAll(1,c);
        list.add(3,"d");
        System.out.println(list);
        System.out.println(c);
        System.out.println(list.containsAll(c));
    }
}
