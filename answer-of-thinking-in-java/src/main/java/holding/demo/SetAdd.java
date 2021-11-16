package holding.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/1 17:03
 * Program Goal:
 * Set��֤�ظ�����ǻ���equals��hashcode
 * �������������ġ����⣬����set��������Ȼ���ڵ�Ԫ�أ�
 * �ǲ����ظ���ӽ�ȥ��
 *
 * LinkedHashSet��HashSet��add������
 * ����String�������ݵĻ���������˳��һ��
 * ���������������ͣ�����˳�����ӡ˳��һ�¡�
 *
 *********************************************/
class Person{
    private Integer id;
    private final String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return id.equals(person.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SetAdd {
    public static void main(String[] args) {
        Set<Person> set=new HashSet<>();
        Person person1 = new Person(1,"yangjun");
        Person person2 = new Person(2, "maomao1");
        Person person3 = new Person(3, "maomao2");
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person1);
        System.out.println(set);
        set=new LinkedHashSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person1);
        System.out.println(set);

        Set<String> s=new LinkedHashSet<>();
        s.add("name1");
        s.add("name2");
        s.add("name3");
        s.add("name4");
        s.add("name1");
        System.out.println(s);
        Set<String> s1=new HashSet<>();
        s1.add("name1");
        s1.add("name2");
        s1.add("name3");
        s1.add("name4");
        s1.add("name1");
        System.out.println(s1);
        Set<Integer> ss1=new HashSet<>();
        ss1.add(1);
        ss1.add(2);
        ss1.add(3);
        ss1.add(4);
        ss1.add(1);
        System.out.println(ss1);

        Set<Integer> ss=new LinkedHashSet<>();
        ss.add(1);
        ss.add(2);
        ss.add(3);
        ss.add(4);
        ss.add(1);
        System.out.println(ss);

    }

}
