package innerclasses;//: innerclasses/InheritInner.java
// Inheriting an inner class.

class WithInner {
    WithInner(String name,Double d){}
    class Inner {
        Integer age;
        Float f;

        public Inner(Integer age, Float f) {
            this.age = age;
            this.f = f;
        }

        @Override
        public String toString() {
            return "Inner{" +
                    "age=" + age +
                    ", f=" + f +
                    '}';
        }
    }
}

public class InheritInner extends WithInner.Inner {
//    InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super(1,2f);
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner("",1.0);
        InheritInner ii = new InheritInner(wi);
        System.out.println(ii.toString());
    }
} ///:~
