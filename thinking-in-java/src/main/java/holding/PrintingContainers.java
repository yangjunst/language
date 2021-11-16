package holding;//: holding/PrintingContainers.java
// Containers print themselves automatically.

import java.util.*;

import static net.mindview.util.Print.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("dog");
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        print("ArrayList-->\n"+fill(new ArrayList<String>()));
        print("LinkedList-->\n"+fill(new LinkedList<String>()));
        print("HashSet-->\n"+fill(new HashSet<String>()));
        print("TreeSet-->\n"+fill(new TreeSet<String>()));
        print("LinkedHashSet-->\n"+fill(new LinkedHashSet<String>()));
        print("HashMap-->\n"+fill(new HashMap<String, String>()));
        print("TreeMap-->\n"+fill(new TreeMap<String, String>()));
        print("LinkedHashMap-->\n"+fill(new LinkedHashMap<String, String>()));
    }
} /* Output:
[rat, cat, dog, dog]
[rat, cat, dog, dog]
[dog, cat, rat]
[cat, dog, rat]
[rat, cat, dog]
{dog=Spot, cat=Rags, rat=Fuzzy}
{cat=Rags, dog=Spot, rat=Fuzzy}
{rat=Fuzzy, cat=Rags, dog=Spot}
*///:~
