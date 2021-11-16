package reusing;

import java.util.Arrays;

import static net.mindview.util.Print.print;

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser a = new Cleanser();
        a.dilute();
        a.apply();
        a.scrub();
        print(a);
        System.out.println(Arrays.toString(args));
    }
}

class DetergentDelegation {
    private Cleanser cleanser = new Cleanser();


    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public String toString() {
        return cleanser.toString();
    }

    public void scrub() {
        append(" DetergentDelegation.scrub()");
        cleanser.scrub();
    }

    public void foam() {
        append(" foam()");
    }
        /*
          Cleanser dilute() apply() DetergentDelegation.scrub() scrub()  foam()
          Testing base class:
          Cleanser dilute() apply()  scrub()
          []
        */

    public static void main(String[] args) {
        DetergentDelegation x = new DetergentDelegation();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class:");
        Cleanser.main(args);
    }
}

public class E11_Delegation {
    public static void main(String[] args) {
        DetergentDelegation.main(args);
    }
}