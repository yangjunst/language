package containers.demo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/29 17:31
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
