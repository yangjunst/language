package reusing;

import static net.mindview.util.Print.*;
public class E24_JapaneseBeetle {
    public static void main(String args[]) {
        new JapaneseBeetle();
    }
}

/**
 * static Insect.x1 initialized
 * static Beetle.x2 initialized
 * static JapaneseBeetle.x3 initialized
 * i = 9 j = 0
 * Beetle.k initialized
 * k = 47
 * j = 39
 * JapaneseBeetle.m initialized
 * m = 47
 * j = 39
 *
 */
class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 =
            printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}


class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 =
            printInit("static Beetle.x2 initialized");
}

class JapaneseBeetle extends Beetle {
    int m = printInit("JapaneseBeetle.m initialized");

    JapaneseBeetle() {
        print("m = " + m);
        print("j = " + j);
    }

    static int x3 =
            printInit("static JapaneseBeetle.x3 initialized");
}


