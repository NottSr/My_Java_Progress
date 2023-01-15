package collections;

import java.util.HashSet;
import java.util.Set;

public class Iterators {
    
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Lemon");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");

        // Iterator
        var i = fruits.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
