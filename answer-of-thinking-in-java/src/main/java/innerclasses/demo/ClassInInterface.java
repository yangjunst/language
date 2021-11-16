package innerclasses.demo;

import java.lang.reflect.Modifier;

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {

        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            int modifiers = Test.class.getModifiers();
            System.out.println(Modifier.toString(modifiers));

        }
    }
}
class TestInterface extends ClassInInterface.Test{

    public static void main(String[] args) {
        ClassInInterface.Test test = new ClassInInterface.Test();
        System.out.println(test.getClass());


    }
}