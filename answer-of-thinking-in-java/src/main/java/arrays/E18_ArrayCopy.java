package arrays;

import java.util.*;
import java.lang.reflect.*;

import static net.mindview.util.Print.*;

public class E18_ArrayCopy {
    static void setID(BerylliumSphere bs, long value) {
        try {
            Field fid =
                    BerylliumSphere.class.getDeclaredField("id");
            fid.setAccessible(true);
            fid.setLong(bs, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BerylliumSphere[] a = new BerylliumSphere[4];
        Arrays.fill(a, new BerylliumSphere());
        BerylliumSphere[] b = new BerylliumSphere[4];
        print("a = " + Arrays.toString(a));
        print("b = " + Arrays.toString(b));
        System.arraycopy(a, 0, b, 0, b.length);
        print("b = " + Arrays.toString(b));
// Changing a reference in 'a' will not impact 'b'.
        a[1] = a[3] = new BerylliumSphere();
        print("a = " + Arrays.toString(a));
        print("b = " + Arrays.toString(b));
//// Changing an object's state will impact 'b', as well.
        setID(a[0], -1L);
        print("a = " + Arrays.toString(a));
        print("b = " + Arrays.toString(b));
    }
}