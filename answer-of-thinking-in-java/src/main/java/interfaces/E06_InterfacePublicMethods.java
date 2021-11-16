package interfaces;

import interfaces.ownpackage.AnInterface;

import java.lang.reflect.Modifier;

public class E06_InterfacePublicMethods
        implements AnInterface {
    // Each of these produces a compile-time error message,
// stating that you cannot reduce the access of the
// base class public method in a derived class.
// void f() {}
// void g() {}
// void h() {}
// Compiles OK:
    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public static void main(String args[]) throws NoSuchMethodException {
        int f = AnInterface.class.getDeclaredMethod("f").getModifiers();
        System.out.println(Modifier.isAbstract(f));

    }
}