package innerclasses.demo.bibao;

import static net.mindview.util.Print.print;
class Callee2 extends MyIncrement implements Incrementable{
    private int i = 0;

    public void increment() {
        super.increment();
        i++;
        print(i);
    }

    private class Closure implements Incrementable {
        public void increment() {
            // Specify outer-class method, otherwise
            // you'd get an infinite recursion:
            Callee2.this.increment();
        }
    }

    Incrementable getCallbackReference1() {
        return new Closure();
    }
    Incrementable getCallbackReference2() {
        return this;
    }

    public static void main(String[] args) {
        Callee2 callee2=new Callee2();
        Incrementable callbackReference1 = callee2.getCallbackReference1();
        MyIncrement callbackReference2 = (MyIncrement)callee2.getCallbackReference2();
        System.out.println(callbackReference1.getClass());
        System.out.println(callbackReference2.getClass());
        callbackReference1.increment();
        callbackReference2.increment();
        callee2.increment();


    }
}