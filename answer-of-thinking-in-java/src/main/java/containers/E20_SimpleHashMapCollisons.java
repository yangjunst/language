package containers;

import net.mindview.util.Countries;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class SimpleHashMap2<K, V> extends SimpleHashMap<K, V> {
    @Override
    public V put(K key, V value) {
        V oldValue = null;
        int index = Math.abs(key.hashCode()) % SIZE;
        MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
        if (buckets[index] == null)
            buckets[index] = new LinkedList<MapEntry<K, V>>();
// Lines added here:
        else {
            System.out.print(
                    "Collision while adding \t" + pair
                            + "\tbucket already contains:"+"\n");
            Iterator<MapEntry<K, V>> it =
                    buckets[index].iterator();
//            while (it.hasNext())
//                System.out.println(it.next());
        }
// End of lines added
        LinkedList<MapEntry<K, V>> bucket = buckets[index];
        boolean found = false;
        ListIterator<MapEntry<K, V>> it = bucket.listIterator();
        while (it.hasNext()) {
            MapEntry<K, V> iPair = it.next();
            if (iPair.getKey().equals(key)) {
                oldValue = iPair.getValue();
                it.set(pair); // Replace old with new
                found = true;
                break;
            }
        }
        if (!found)
            buckets[index].add(pair);
        return oldValue;
    }
}

public class E20_SimpleHashMapCollisons {
    public static void main(String[] args) {
        SimpleHashMap2<String, String> m =
                new SimpleHashMap2<String, String>();
        m.putAll(Countries.capitals(25));
        m.putAll(Countries.capitals(25));
        System.out.println(m);
    }
}