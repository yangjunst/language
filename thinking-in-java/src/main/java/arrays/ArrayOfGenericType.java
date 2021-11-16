package arrays;//: arrays/ArrayOfGenericType.java
// Arrays of generic types won't compile.

import java.util.Arrays;

public class ArrayOfGenericType<T> {
  T[] array; // OK
  @SuppressWarnings("unchecked")
  public ArrayOfGenericType(int size) {
    //! array = new T[size]; // Illegal
    array = (T[])new Object[size]; // "unchecked" Warning
  }

    public static void main(String[] args) {
        Object[] array = new ArrayOfGenericType(2).array;
        System.out.println(Arrays.toString(array));

    }
  // Illegal:
  //! public <U> U[] makeArray() { return new U[10]; }
} ///:~
