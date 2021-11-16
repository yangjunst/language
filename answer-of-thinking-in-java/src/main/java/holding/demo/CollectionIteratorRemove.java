package holding.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/3 8:43
 * Program Goal:
 * 在集合中调用remove方法的几个常见错误：
 *
 *********************************************/
public class CollectionIteratorRemove {

    /**
     * @throws java.util.ConcurrentModificationException
     * @return
     */
    static boolean removeInForEach(){
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        Iterator<Integer> it = ints.iterator();
        System.out.println(ints);
        for(Integer p:ints){
            ints.remove(p);
        }
        System.out.println(ints);
        return false;

    }

    /**
     * 部分元素被移除掉，还有一部分留在容器内
     * 主要在于索引及元素伴随着跳动，致使结果
     * @return
     */
    static boolean removeForLoop(){
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        Iterator<Integer> it = ints.iterator();
        System.out.println(ints);
        for(int i=0;i<ints.size();i++){
            ints.remove(i);
        }
        System.out.println(ints);
        return false;
    }

    /**
     * @throws java.lang.IllegalStateException
     * @return
     */

    static boolean removeInIteratorByWrongWay(){
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        Iterator<Integer> it = integers.iterator();
        System.out.println(integers);
        while (it.hasNext()) {
            it.remove();//remove与next的调用先后顺序很关键
            Integer next = it.next();
            System.out.println("--->" + next);
        }
        return false;
    }

    /**
     *
     * @return
     */
    static boolean removeInIteratorByCorrectWay(){
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        Iterator<Integer> it = ints.iterator();
        System.out.println(ints);
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println("--->" + next);
            it.remove();
        }
        System.out.println(ints);
        return true;
    }
    public static void main(String[] args) {

        System.out.println(removeInIteratorByCorrectWay());
    }
}
