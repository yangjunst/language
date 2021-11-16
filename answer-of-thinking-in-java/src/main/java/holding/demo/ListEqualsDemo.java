package holding.demo;

import java.util.ArrayList;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/2 14:41
 * Program Goal: 对于List:判断一个元素是否属于
 * 某个List, 发现某个元素的索引，及从某个List中
 * 移除一个元素时，会用到equals方法，不像Set去
 * 重那样还需要hashCode()方法
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
