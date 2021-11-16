package interfaces;

import java.lang.reflect.Modifier;

interface StaticFinalTest {
    String RED = "Red";
}

class Test implements StaticFinalTest {
    public Test() {
// Compile-time error: cannot assign a value
// to final variable RED:
//! RED = "Blue";
    }
}

public class E17_ImplicitStaticFinal {
    public static void main(String args[]) throws NoSuchFieldException {
// Accessing as a static field:
        System.out.println("StaticFinalTest.RED = "
                + StaticFinalTest.RED);

        int red = StaticFinalTest.class.getDeclaredField("RED").getModifiers();
        System.out.println(Modifier.toString(red));
    }
}