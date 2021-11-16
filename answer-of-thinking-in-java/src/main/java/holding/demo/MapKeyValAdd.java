package holding.demo;

import java.util.HashMap;
import java.util.Map;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/2 13:00
 * Program Goal:
 * 对于map,key值一样，在添加，值会覆盖旧的内容
 * 对于set容器中已然存在的元素,是不会重复添加进去的
 *********************************************/
public class MapKeyValAdd {
    public static void main(String[] args) {
        Person p1=new Person(1,"yangjun");
        Person p2=new Person(1,"maomao");
        Map<Person,String> map=new HashMap<>();
        map.put(p1,"p1");
        map.put(p1,"p2");
        System.out.println(map);
    }
}
