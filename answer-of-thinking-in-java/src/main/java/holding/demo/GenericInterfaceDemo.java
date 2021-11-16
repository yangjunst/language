package holding.demo;

import java.util.Iterator;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/3 8:24
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
