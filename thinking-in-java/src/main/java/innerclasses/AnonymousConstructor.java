package innerclasses;//: innerclasses/AnonymousConstructor.java
// Creating a constructor for an anonymous inner class.

import java.util.Random;

import static net.mindview.util.Print.*;

abstract class Base {
    public Base(int i) {
        print("Base constructor, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            private final String name=String.valueOf(i);
            private Random random=new Random();
            private  Double d=1.0;
            {
                print("Inside instance initializer="+random.nextInt(9999)+"---->"+name);
            }

            public void f() {
                print("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
} /* Output:
Base constructor, i = 47
Inside instance initializer
In anonymous f()
*///:~
