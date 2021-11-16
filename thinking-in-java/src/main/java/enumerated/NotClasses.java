package enumerated;//: enumerated/NotClasses.java
// {Exec: javap -c LikeClasses}

import static net.mindview.util.Print.print;


public class NotClasses {
    enum LikeClasses {
        WINKEN {
            void behavior() {
                print("Behavior1");
            }
        },
        BLINKEN {
            void behavior() {
                print("Behavior2");
                System.out.println(this.getClass().getName());
            }
        },
        NOD {
            void behavior() {
                print("Behavior3");
                System.out.println(this.getClass());
                System.out.println(this.getClass().getSuperclass());
                System.out.println(this.getClass().getSuperclass().getSuperclass());
                System.out.println(this.getClass().getSuperclass().getSuperclass().getSuperclass());
            }
        };

        abstract void behavior();
    }

    public static void main(String[] args) throws NoSuchFieldException {
       LikeClasses.NOD.behavior();
       LikeClasses.BLINKEN.behavior();

    }

     void f1(LikeClasses instance) {
    } // Nope
} /* Output:
Compiled from "NotClasses.java"
abstract class LikeClasses extends java.lang.Enum{
public static final LikeClasses WINKEN;

public static final LikeClasses BLINKEN;

public static final LikeClasses NOD;
...
*///:~
