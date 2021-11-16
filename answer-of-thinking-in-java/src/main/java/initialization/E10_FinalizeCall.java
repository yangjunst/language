package initialization;

public class E10_FinalizeCall extends Object{
    protected void finalize() {
        System.out.println("finalize() called");
    }

    public static void main(String args[]) {
        new E10_FinalizeCall();
//        System.gc();
//        System.gc();
        System.runFinalization();
    }
}