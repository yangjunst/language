package initialization;//: initialization/DefaultConstructor.java

import java.util.Arrays;

class Bird {
}

public class DefaultConstructor {
    public static void main(String[] args) {
        Bird b = new Bird(); // Default!
        Arrays.stream(DefaultConstructor.class.getDeclaredConstructors()).forEach(System.out::println);
    }
} ///:~
