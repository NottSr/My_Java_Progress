package collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Lemon");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.set(2, "Grapes");
        fruits.add("Lemon");
        fruits.remove(4);

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println("Index of the first lemon: " + fruits.indexOf("Lemon"));
        System.out.println("Index of the last lemon: " + fruits.lastIndexOf("Lemon"));

        List<String> moreFruit = List.of("Orange", "Cranberry", "Plum");
        System.out.println(moreFruit);
    }
}
