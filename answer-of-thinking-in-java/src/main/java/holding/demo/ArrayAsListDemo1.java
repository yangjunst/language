package holding.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/1 17:32
 * Program Goal:
 *********************************************/
class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ArrayAsListDemo1 {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(
                new People("yangjun", 31),
                new People("maomao", 32),
                new People("XYQZ", 20));
        List<People> peoples =new ArrayList<>(people);
        peoples.get(1).setName("MAOMAO");
        peoples.remove(2);
        System.out.println(people);
        System.out.println(peoples);
    }
}
