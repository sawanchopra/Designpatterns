package HashMap;

import java.util.HashMap;

public class MyHashMap <K,V>{
    private static final int  INITIAL_SIZE = 1<<4; //16
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    public Entry[] hashTable;

    public MyHashMap() {
        hashTable= new Entry[INITIAL_SIZE];
    }
    public MyHashMap(int capacity) {
        int tableSize = tableSizeFor(capacity);
        hashTable= new Entry[tableSize];
    }

    private int tableSizeFor(int capacity) {
        int n = capacity - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }


    public void put(K k, V v) {
        int index = k.hashCode() % hashTable.length;

        if(hashTable[index] == null) {
            Entry<K,V> entry = new Entry<>(k,v);
            hashTable[index] = entry;
        } else {
            Entry<K,V> current = hashTable[index];
            while(current != null) {
                if(current.key.equals(k)) {
                    current.value = v;
                    return;
                }
                current = current.next;
            }
            Entry<K,V> entry = new Entry<>(k,v);
            current.next = entry;
        }
    }

    public V get(K k) {
        int index = k.hashCode() % hashTable.length;
        while (hashTable[index] != null){
            Entry<K,V> entry = hashTable[index];
            if(entry.key.equals(k)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }
}
