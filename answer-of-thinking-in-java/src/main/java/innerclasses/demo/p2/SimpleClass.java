package innerclasses.demo.p2;

import innerclasses.demo.p1.OneMethodInterface;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/31 14:52
 * Program Goal:
 *********************************************/
public class SimpleClass {
    public SimpleClass() {

    }

    protected final class SimpleClassImpl implements OneMethodInterface{
        public SimpleClassImpl() {

        }

        @Override
        public void f() {

        }
    }

}
