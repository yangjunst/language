package holding.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/3 8:43
 * Program Goal:
 * �ڼ����е���remove�����ļ�����������
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
     * ����Ԫ�ر��Ƴ���������һ��������������
     * ��Ҫ����������Ԫ�ذ�������������ʹ���
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
            it.remove();//remove��next�ĵ����Ⱥ�˳��ܹؼ�
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
