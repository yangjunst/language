//: polymorphism/PrivateOverride.java
// Trying to override a private method.
package polymorphism;

import java.lang.reflect.Modifier;

import static net.mindview.util.Print.print;

public class PrivateOverride {
    private void f() {
        print("private f()");
    }

    public static void main(String[] args) throws NoSuchMethodException {
//        PrivateOverride po = new Derived();
//        po.f();
        int f = PrivateOverride.class.getDeclaredMethod("f").getModifiers();
        System.out.println(Modifier.toString(f));

    }
}

class Derived extends PrivateOverride {
    public void f() {
        print("public f()");
    }
} /* Output:
private f()
*///:~
