package innerclasses.demo;

import java.util.ArrayList;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/1 9:38
 * Program Goal:遍历集合容器期间删除元素的可达性
 * 使用新容器包装旧容器
 *********************************************/
class Event {
    private int i;

    public Event(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Event{" +
                "i=" + i +
                '}';
    }
}

public class ContainerRemoveDemo {

    public static void main(String[] args) {
        List<Event> events = new ArrayList<>();
        events.add(new Event(1));
        events.add(new Event(2));
        events.add(new Event(3));
        events.add(new Event(4));
        ArrayList<Event> events1 = new ArrayList<>(events);


        for (Event e : events1) {
            boolean remove = events.remove(e);
            System.out.println(e+"-->"+remove);
        }

        System.out.println(events);
        System.out.println("======================");
        System.out.println(events1);
    }
}
