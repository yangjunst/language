package control;

public class E06_RangeTest {
    static boolean test(int testval, int begin, int end) {
        boolean result = false;
        if (testval >= begin && testval <= end)
            result = true;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}