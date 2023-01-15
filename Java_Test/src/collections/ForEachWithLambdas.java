package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachWithLambdas {
    
    public static void printCollection_ForEach() {
        
        List<String> fruits = new ArrayList<>();
        fruits.add("Lemon");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
        fruits.forEach(f -> {
            f = "fruits: " + f;
            System.out.println(f);
        });
    }

    public static void printMap_ForEach() {

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("Lemon", 20);
        fruitCalories.put("Banana", 105);
        fruitCalories.put("Orange", 45);

        fruitCalories.forEach((k,v) -> System.out.println(k + ": " + v));
    }

    public static void main(String[] args) {
        printCollection_ForEach();
        printMap_ForEach();
    }
}
