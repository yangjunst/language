package innerclasses.demo;

import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/31 15:19
 * Program Goal:构造代码块及静态代码块中构建内部类
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
