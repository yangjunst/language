package innerclasses.demo;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/31 15:19
 * Program Goal:�������鼰��̬������й����ڲ���
 *********************************************/
public class DomainClass {
    private static Iterator iterator;
    private Iterable iterable;
    {
        class A implements Iterable{
            @Override
            public Iterator iterator() {
                return null;
            }
        }

        iterable=new A();
    }

    static {
        class B implements Iterator{
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        }
        iterator=new B();
    }


    public static void main(String[] args) {
        class C implements Observer{
            @Override
            public void update(Observable o, Object arg) {

            }
        }

       if(1<args.length) {
            class D implements Listener{

                @Override
                public void handleEvent(Event event) {

                }
            }
        }
    }
}
