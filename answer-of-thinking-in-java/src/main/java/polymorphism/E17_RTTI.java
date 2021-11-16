package polymorphism;

public class E17_RTTI {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{new Unicycle(),
                new Bicycle(), new Tricycle()};
//        ((Unicycle) cycles[0]).balance(); // Downcast/RTTI
//        ((Bicycle) cycles[1]).balance(); // Downcast/RTTI
//        ((Unicycle) cycles[2]).balance(); // Exception thrown
    }
} ///:~

