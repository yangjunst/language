package containers;

import java.util.*;

import static net.mindview.util.Countries.*;

public class E03_VerifySet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        for (int i = 0; i < 5; i++)
            set.addAll(names(10));
        System.out.println(set);
    }
}