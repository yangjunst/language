package holding.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/3 10:39
 * Program Goal:
 * ListIteration�õ���Ĭ��������
 * ��hasPrevious��previous����
 * ��ʹ�ó���
 *
 *********************************************/
public class ListIteration {
    static List<Integer> ints = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7));

    public static void main(String[] args) {
        ListIterator<Integer> integerListIterator = ints.listIterator(4);
        while (integerListIterator.hasPrevious()){
            System.out.println(integerListIterator.previous());
        }
    }
}
