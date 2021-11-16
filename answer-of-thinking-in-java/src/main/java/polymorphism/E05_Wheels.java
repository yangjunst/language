package polymorphism;

class Cycle {
    public int wheels() {
        return 0;
    }
}

class Unicycle extends Cycle {
    public int wheels() {
        return 1;
    }
    public void balance() {
        System.out.println("Unicycle balance...");
    }
}

class Bicycle extends Cycle {
    public int wheels() {
        return 2;
    }
    public void balance() {
        System.out.println("Bicycle balance...");
    }
}

class Tricycle extends Cycle {
    public int wheels() {
        return 3;
    }
}

public class E05_Wheels {
    public static void ride(Cycle c) {
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}