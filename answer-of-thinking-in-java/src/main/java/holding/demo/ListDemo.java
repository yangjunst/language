package holding.demo;

import java.util.*;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/1 16:19
 * Program Goal:add��set��������������Ҫ��
 * ����ʼ������С����������
 *********************************************/
public class ListDemo {
    public static void m() {
        List list = new ArrayList();
        list.set(0,1);
        Set set = new HashSet();
        set.add(1);
    }

    public static void main(String[] args) {
        m();

        /*List<String> list = new ArrayList<>(10);
        System.out.println(list.size());
        list.add(0, new Date().toLocaleString());
        System.out.println(list);*/
    }
}
