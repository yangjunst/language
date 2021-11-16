package control;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/********************************************
 * ������Ա: ѩ������
 * ��ְʱ��: 2016/05/16
 * ����ʱ��: 2021/8/31 20:31
 * Program Goal:
 *********************************************/
public class OuterPrivateInnerClass {
     private final class InnerClass{

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Constructor<InnerClass> declaredConstructor = InnerClass.class.getDeclaredConstructor(OuterPrivateInnerClass.class);

        System.out.println(Modifier.toString(declaredConstructor.getModifiers()));
    }
}
