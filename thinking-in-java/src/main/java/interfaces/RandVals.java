package interfaces;//: interfaces/RandVals.java
// Initializing interface fields with
// non-constant initializers.

import java.util.*;

import static net.mindview.util.Print.print;

public interface RandVals {
    Random RAND = new Random();
    int RANDOM_INT = RAND.nextInt();
    long RANDOM_LONG = RAND.nextLong();
    float RANDOM_FLOAT = RAND.nextLong();
    double RANDOM_DOUBLE = RAND.nextDouble() ;


} ///:~
