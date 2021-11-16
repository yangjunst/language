package innerclasses.demo.p3;

import innerclasses.demo.p1.OneMethodInterface;
import innerclasses.demo.p2.SimpleClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/8/31 14:53
 * Program Goal:
 *********************************************/
public class Test extends SimpleClass {
    public OneMethodInterface getInstance(){
        return new SimpleClassImpl();
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Constructor<SimpleClassImpl> declaredConstructor1 = SimpleClassImpl.class.getDeclaredConstructor(SimpleClass.class);
        String name = declaredConstructor1.getName();
        System.out.println(name);
        int modifiers = declaredConstructor1.getModifiers();
        System.out.println(Modifier.toString(modifiers));



    }
}
