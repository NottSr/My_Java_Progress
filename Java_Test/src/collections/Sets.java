package collections;

import java.util.Set;
import java.util.HashSet;

public class Sets {
    
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Grapes");

        System.out.println(fruits);
        System.out.println("Have grapes? " + fruits.contains("Grapes"));

        fruits.remove("Banana");
        System.out.println("Number of elements after removing bananas: " + fruits.size());

        Set<String> moreFruits = Set.of("Lemon", "Raisin", "Pear");
        System.out.println(moreFruits);
    }
}
