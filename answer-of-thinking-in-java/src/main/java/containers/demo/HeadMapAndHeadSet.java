package containers.demo;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/27 16:26
 * Program Goal:
 *********************************************/
public class HeadMapAndHeadSet {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        map.put("f",6);
        System.out.println(map);
        SortedMap<String, Integer> c = map.headMap("c");
        System.out.println(c);
        TreeSet<String> set=new TreeSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        System.out.println(set);
        SortedSet<String> d = set.headSet("d");
        System.out.println(d);

    }
}
