package holding.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/29 17:45
 * Program Goal:
 *********************************************/
public class IteratorRemove {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("a","b","c","d"));
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
            it.remove();
        }
        System.out.println(list);
    }
}
