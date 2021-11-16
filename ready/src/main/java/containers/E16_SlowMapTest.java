package containers;

import net.mindview.util.CountingMapData;

import java.util.*;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;
/********************************************
 * 开发人员: 雪域青竹
 * 入职时间: 2016/05/16
 * 开发时间: 2021/9/30 19:36
 * Program Goal:每个方法的实现细节
 * questions:entrySet的恰当实现应该在Map中提供视图，
 * 而不是副本，并且这个视图允许对原始映射表进行修改。
 * 练习16提供了修正这个问题的机会、
 * 哪里在修正，没弄清楚...
 *
 *********************************************/
// Does not support null value as key!
class SlowMap2<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<K>();
    private List<V> values = new ArrayList<V>();

    @Override
    public V put(K key, V value) {
        if (key == null)
            throw new NullPointerException();
        V oldValue = get(key); // The old value or null
        if (!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else
            values.set(keys.indexOf(key), value);
        return oldValue;
    }

    @Override
    public V get(Object key) {
        if (key == null)
            throw new NullPointerException();
        if (!keys.contains(key))
            return null;
        return values.get(keys.indexOf(key));
    }

    private EntrySet entrySet = new EntrySet();

    @Override
    public Set<Entry<K, V>> entrySet() {
        return entrySet;
    }

    // Uses the 'Flyweight' pattern
    private class EntrySet
            extends AbstractSet<Entry<K, V>> {
        @Override
        public Iterator<Entry<K, V>> iterator() {
            return new Iterator<Entry<K, V>>() {
                private int index = -1;
                boolean canRemove;

                public boolean hasNext() {
                    return index < keys.size() - 1;
                }

                public Entry<K, V> next() {
                    canRemove = true;
                    ++index;
                    return new MapEntry<K, V>(
                            keys.get(index), values.get(index));
                }

                public void remove() {
                    if (!canRemove)
                        throw new IllegalStateException();
                    canRemove = false;
                    keys.remove(index);
                    values.remove(index--);
                }
            };
        }

        @SuppressWarnings("unchecked")
        @Override
        public boolean contains(Object o) {
            if (o instanceof MapEntry) {
                MapEntry<K, V> e = (MapEntry<K, V>) o;
                K key = e.getKey();
                if (keys.contains(key))
                    return e.equals(
                            new MapEntry<K, V>(key, get(key)));
            }
            return false;
        }

        @SuppressWarnings("unchecked")
        @Override
        public boolean remove(Object o) {
            if (contains(o)) {
                MapEntry<K, V> e = (MapEntry<K, V>) o;
                K key = e.getKey();
                V val = e.getValue();
                keys.remove(key);
                values.remove(val);
                return true;
            }
            return false;
        }

        @Override
        public int size() {
            return keys.size();
        }

        @Override
        public void clear() {
            keys.clear();
            values.clear();
        }
    }
}

public class E16_SlowMapTest {
    public static void printKeys(Map<Integer, String> map) {
        printnb("Size = " + map.size() + ", ");
        printnb("Keys: ");
        print(map.keySet()); // Produce a Set of the keys
    }

    public static void test(Map<Integer, String> map) {
        print(map.getClass().getSimpleName());
        map.putAll(new CountingMapData(25));
// Map has 'Set' behavior for keys:
        map.putAll(new CountingMapData(25));
        printKeys(map);
// Producing a Collection of the values:
        printnb("Values: ");
        print(map.values());
        print(map);
        print("map.containsKey(11): " + map.containsKey(11));
        print("map.get(11): " + map.get(11));
        print("map.containsValue(\"F0\"): "
                + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        print("First key in map: " + key);
        map.remove(key);
        printKeys(map);
        map.clear();
        print("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData(25));
// Operations on the Set change the Map:
        map.keySet().removeAll(map.keySet());
        print("map.isEmpty(): " + map.isEmpty());
    }

    public static void main(String[] args) {
        System.out.println("Testing SlowMap");
        test(new SlowMap<Integer, String>());
        System.out.println("Testing SlowMap2");
        test(new SlowMap2<Integer, String>());
    }
}