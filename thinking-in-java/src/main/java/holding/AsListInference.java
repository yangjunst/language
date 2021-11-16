package holding;//: holding/AsListInference.java
// Arrays.asList() makes its best guess about type.

import java.util.*;

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}
class Test{
  private static class ArrayList<E> extends AbstractList<E> {
    ArrayList(E[] array) {
      if (array==null)
        throw new NullPointerException();
    }
    @Override
    public E get(int index) {
      return null;
    }

    @Override
    public int size() {
      return 0;
    }
  }

  public static <T> List<T> asList(T... a) {
    return new ArrayList<T>(a);
  }
  public static <T> List<T> asList1(T... a) {
    return new ArrayList<>(a);
  }
  public static void main(String[] args) {
    List<Snow> snows=asList1(new Heavy(),new Light());
  }
}
public class AsListInference {
  public static void main(String[] args) {
    List<Snow> snow1 = Arrays.asList(
      new Crusty(), new Slush(), new Powder());

    // Won't compile:
     List<Snow> snow2 = Arrays.asList(
       new Light(), new Heavy());
    // Compiler says:
    // found   : java.util.List<Powder>
    // required: java.util.List<Snow>

    // Collections.addAll() doesn't get confused:
    List<Snow> snow3 = new ArrayList<Snow>();
    Collections.addAll(snow3, new Light(), new Heavy());

    // Give a hint using an
    // explicit type argument specification:
    List<Powder> snow4 = Arrays.<Powder>asList(
       new Light(), new Heavy());
  }
} ///:~
