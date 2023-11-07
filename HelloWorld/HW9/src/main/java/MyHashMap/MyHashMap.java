package MyHashMap;

import java.util.Iterator;

public class MyHashMap<K, V> {

    private Entry<K, V>[] buckets;
    private int size;

    public MyHashMap() {
        this.buckets = new Entry[10];
        this.size = 0;
    }

    public void remove (K key){
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;

        Entry<K, V> currentEntry = buckets[bucketNumber];

        while (currentEntry.getNextEntry() != null) {
            if (key == currentEntry.getKey()) {
                currentEntry.setKey(null);
            }
            currentEntry = currentEntry.getNextEntry();
        }
        size--;
    }


    public void put(K key, V value) {
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;
        Entry<K, V> kvEntry = new Entry<K, V>();
        kvEntry.setKey(key);
        kvEntry.setValue(value);


        if (buckets[bucketNumber] == null) {
            buckets[bucketNumber] = kvEntry;
        } else {
            kvEntry.setNextEntry(buckets[bucketNumber]);
            buckets[bucketNumber] = kvEntry;
        }
        size++;
    }

    public V get(K key) {
        int hash = key.hashCode();
        int bucketNumber = hash % buckets.length;

        Entry<K, V> currentEntry = buckets[bucketNumber];


        while (currentEntry.getNextEntry() != null) {
            V v = checkEquals(currentEntry, key);
            if (v != null) {
                return v;
            }
            currentEntry = currentEntry.getNextEntry();
        }
        return checkEquals(currentEntry, key);
    }

    private V checkEquals(Entry<K, V> e, K key) {
        if (e.getKey().equals(key)) {
            return e.getValue();
        }
        return null;
    }
    public int size(){
        return size;
    }


    public void clear() {
        this.buckets = new Entry[10];
        size = 0;
    }

}
