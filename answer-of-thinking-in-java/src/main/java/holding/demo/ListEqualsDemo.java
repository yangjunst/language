package holding.demo;

import java.util.ArrayList;
import java.util.List;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/2 14:41
 * Program Goal: ����List:�ж�һ��Ԫ���Ƿ�����
 * ĳ��List, ����ĳ��Ԫ�ص�����������ĳ��List��
 * �Ƴ�һ��Ԫ��ʱ�����õ�equals����������Setȥ
 * ����������ҪhashCode()����
 *********************************************/
public class ListEqualsDemo {
    private static final class Person{
        private String name;
        private int age;
        private int id;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;

            Person person = (Person) o;

            return id == person.id;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id=" + id +
                    '}';
        }
    }
    public static void main(String[] args) {
        Person p1=new Person("yangjun1",31);
        Person p2=new Person("yangjun2",31);
        Person p3=new Person("yangjun3",31);
        Person p4=new Person("yangjun4",31);
        p1.setId(1);
        p2.setId(1);
        p3.setId(1);
        p4.setId(1);
        List<Person> set=new ArrayList<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        System.out.println(set);
        Person p5=new Person("yangjun5",31);
        p5.setId(1);
        System.out.println(set.contains(p5));
        System.out.println(set.indexOf(p5));
        set.remove(p5);
        set.remove(p5);
        set.remove(p5);
        set.remove(p5);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());
        System.out.println(p5.hashCode());
        System.out.println(set);
    }
}
