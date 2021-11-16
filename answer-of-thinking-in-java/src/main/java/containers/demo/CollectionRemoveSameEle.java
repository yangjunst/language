package containers.demo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/27 16:46
 * Program Goal:
 *********************************************/
public class CollectionRemoveSameEle {
    public static void main(String[] args) {
        Collection collection=new LinkedList();
        collection.add(Collections.class);
        collection.add(Collections.class);
        collection.add(Collections.class);
        collection.add(Collections.class);
        collection.add(Collections.class);
        collection.add(Collection.class);
        collection.add(Collection.class);
        collection.add(Collection.class);
        System.out.println(collection);
        collection.remove(Collections.class);
        Collection c=new LinkedList();
        c.add(Collection.class);
        c.add(String.class);
        collection.retainAll(c);
        System.out.println(collection);
    }
}
