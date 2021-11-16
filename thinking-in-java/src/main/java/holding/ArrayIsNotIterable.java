package holding;//: holding/ArrayIsNotIterable.java

import java.util.*;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib)
            System.out.print(t + " ");
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        // An array works in foreach, but it's not Iterable:

        // You must explicitly convert it to an Iterable:
        test(Arrays.asList(strings));
        System.out.println();
        for (String s : strings) {
            System.out.println(s);
        }
    }
} /* Output:
1 2 3 A B C
*///:~
