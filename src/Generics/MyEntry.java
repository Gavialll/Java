package Generics;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class MyEntry <K, V>{
    private K key;
    private V value;

     Set<Obj> keySet = new HashSet();

     public void add(K key ,V value) {
         keySet.add(new Obj(key, value));
     }

     public void printMap(){
         System.out.println(keySet);
     }
    public class Obj<K, V> {
        private K key;
        private V value;

        public Obj(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
        return Objects.equals(key, myEntry.key) && Objects.equals(value, myEntry.value) && Objects.equals(keySet, myEntry.keySet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, keySet);
    }
}
