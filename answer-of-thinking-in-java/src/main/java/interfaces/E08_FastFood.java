package interfaces;

import static net.mindview.util.Print.*;

interface FastFood {
    void rushOrder();

    void gobble();
}

class FastSandwich  implements FastFood {
    public void rushOrder() {
        print("Rushing your sandwich order");
    }

    public void gobble() {
        print("Chomp! Snort! Gobble!");
    }
}

public class E08_FastFood {
    static String swap(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length() - 1; i += 2) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            sb.setCharAt(i, c2);
            sb.setCharAt(i + 1, c1);
        }
        return sb.toString();
    }
    public static void main(String args[]) {
       String s="abcdefghijklmn";
        String swap = swap(s);
        System.out.println(swap);
    }
}