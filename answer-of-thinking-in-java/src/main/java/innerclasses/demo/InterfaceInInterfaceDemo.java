package innerclasses.demo;

import java.lang.reflect.Modifier;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/31 20:56
 * Program Goal:
 *********************************************/
public interface InterfaceInInterfaceDemo {
    interface A {
    }

    static void main(String[] args) {
        int modifiers = A.class.getModifiers();
        System.out.println(Modifier.toString(modifiers));//public abstract static interface

    }
}
