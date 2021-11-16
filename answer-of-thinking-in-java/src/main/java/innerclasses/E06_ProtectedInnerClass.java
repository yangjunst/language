package innerclasses;

import innerclasses.exercise6b.*;
import innerclasses.exercise6.*;

public class E06_ProtectedInnerClass extends SimpleClass {
    public SimpleInterface get() {
        return new Inner();
    }

    public static void main(String args[]) {
        new E06_ProtectedInnerClass().get().f();
    }
}