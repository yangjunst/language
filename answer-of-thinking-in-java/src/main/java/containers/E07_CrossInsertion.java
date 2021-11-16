package containers;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import static net.mindview.util.Print.print;

public class E07_CrossInsertion {
    public static void main(String args[]) {
        ArrayList<String> al =
                new ArrayList<>(Countries.names(5));
        LinkedList<String> ll =
                new LinkedList<>(
                        Countries.names(10).subList(5, 10));
        for (Iterator<String> it = al.iterator(); it.hasNext(); )
            System.out.print(it.next()+"\t");
        System.out.println();
        for (Iterator<String> it = ll.iterator(); it.hasNext(); )
            System.out.print(it.next()+"\t");
        System.out.println();
        int alindex = 0;
        for (ListIterator<String> lit2 = ll.listIterator();
             lit2.hasNext(); ) {
            al.add(alindex, lit2.next());
            alindex += 2;
        }
        print("al = " + al);
        print("********");
        alindex = 0;
// Start at the end:
        for (ListIterator<String>
             lit2 = ll.listIterator(ll.size());
            lit2.hasPrevious(); ) {
            String previous = lit2.previous();
            System.out.println(previous);
            al.add(alindex, previous);
            alindex += 2;
        }
        print("al = " + al);
    }
}