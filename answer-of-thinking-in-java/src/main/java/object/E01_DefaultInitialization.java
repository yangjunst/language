package object;

public class E01_DefaultInitialization {
    int i;
    char c;

    public E01_DefaultInitialization() {
        System.out.println("i = " + i);
        System.out.println("c = [" + c + ']');
        System.out.println("c = [" + c + "]");
        System.out.println("c = ---"+c+"---");
    }

    public static void main(String[] args) {
        new E01_DefaultInitialization();
    }
}