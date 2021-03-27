package Generics;

import java.util.*;

public class MyEntry <K, V>{

     private Set<Obj> keySet = new LinkedHashSet();

     public V get(K key){
         for (Obj obj : keySet){
             if(obj.key.equals(key)){
                 return (V) obj.value;
             }
         }
         throw new NullPointerException();
     }

     public void add(K key, V value) {
        Obj<K, V> obj = new Obj<>(key, value);
        keySet.add(obj);
    }

     public void printMap(){
         for (Obj obj : keySet) {
             System.out.println("Key: " + obj.key + "; Value: " + obj.value + ";");
         }
     }

     public void removeElementKey(K key){
         Iterator<Obj> iterator = keySet.iterator();
         while (iterator.hasNext()){
             if(iterator.next().getKey().equals(key)) {
                 iterator.remove();
             }
         }
     }

     public void removeElementValue(V value){
         Iterator<Obj> iterator = keySet.iterator();
         while (iterator.hasNext()){
             if(iterator.next().getValue().equals(value)) {
                 iterator.remove();
             }
         }
     }

     public void setKey (){
         for(Obj obj: keySet){
             System.out.println("Key: " + obj.key);
         }
     }

     public void setValue(){
         for(Obj obj : keySet){
             System.out.println("Value: " + obj.value + ";");
         }
     }

     private class Obj<K, V> {
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

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             Obj<?, ?> obj = (Obj<?, ?>) o;
             return Objects.equals(key, obj.key);
         }

         @Override
         public int hashCode() {
             return Objects.hash(key);
         }
     }
}
