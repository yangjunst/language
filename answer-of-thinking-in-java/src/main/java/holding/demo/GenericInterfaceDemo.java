package holding.demo;

import java.util.Iterator;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/9/3 8:24
 * Program Goal:
 *********************************************/
interface CollectionClass<E>{
    Iterator<E> iterator();
}
interface ListClass<E> extends CollectionClass<E>{
    void show();
}

public class GenericInterfaceDemo implements ListClass<String> {


    @Override
    public void show() {

    }


    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
