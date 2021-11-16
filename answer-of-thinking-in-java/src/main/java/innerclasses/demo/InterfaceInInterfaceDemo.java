package innerclasses.demo;

import java.lang.reflect.Modifier;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/31 20:56
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
