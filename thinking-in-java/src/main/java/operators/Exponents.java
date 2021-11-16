package operators;//: operators/Exponents.java

// "e" means "10 to the power."
public class Exponents {
    public static void main(String[] args) {
        // Uppercase and lowercase 'e' are the same:
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; // 'd' is optional
        double expDouble2 = 477e47; // Automatically double
        System.out.println(expDouble);
        System.out.println(expDouble2);
        double d=23e2;
        System.out.println(d);
        float f=213e3f;
        System.out.println(f);

    }
}
/* Output:
1.39E-43
4.7E48
*///:~