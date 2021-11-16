package holding.demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/3 9:31
 * Program Goal:
 * Iterator��forѭ���е���ӱʵ�÷�ʽ
 *********************************************/
public class IteratorPerfactUseWay {
    private static final List<String> s = Arrays.asList("A", "B", "C", "D");


    static void perfactWay() {
        for (Iterator it = s.iterator(); it.hasNext(); System.out.println(it.next())) ;
    }

    public static void main(String[] args) {
        perfactWay();
    }
}
