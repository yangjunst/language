package holding.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/2 16:09
 * Program Goal:
 *********************************************/
public class IntListRemove {
    static List<Integer> ints = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    public static void main(String[] args) {
        ints.remove(1);
        System.out.println(ints);
        ints.remove(Integer.valueOf(1));
        System.out.println(ints);
    }
}
