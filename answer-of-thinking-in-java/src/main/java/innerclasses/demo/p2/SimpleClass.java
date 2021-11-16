package innerclasses.demo.p2;

import innerclasses.demo.p1.OneMethodInterface;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/31 14:52
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
