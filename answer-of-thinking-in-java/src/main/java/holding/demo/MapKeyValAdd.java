package holding.demo;

import java.util.HashMap;
import java.util.Map;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/2 13:00
 * Program Goal:
 * ����map,keyֵһ��������ӣ�ֵ�Ḳ�Ǿɵ�����
 * ����set��������Ȼ���ڵ�Ԫ��,�ǲ����ظ���ӽ�ȥ��
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
