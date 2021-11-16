package holding.demo;

import java.util.*;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/1 16:19
 * Program Goal:add和set方法对于索引的要求，
 * 及初始容器大小的物理意义
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
