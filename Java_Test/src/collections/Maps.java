package collections;

import java.util.Map;
import java.util.HashMap;

public class Maps {
    
    public static void main(String[] args) {
        
        Map<String, Integer> fruitCalories = new HashMap<>();

        fruitCalories.put("Apple", 95);
        fruitCalories.put("Lemon", 20);
        fruitCalories.put("Banana", 105);
        fruitCalories.put("Orange", 45);
        fruitCalories.put("Cherry", 70);

        // fruitCalories.put("Lemon", 12); // Overrides existing values
        fruitCalories.putIfAbsent("Lemon", 12); // Overrides if value doesn't exist

        // Conditions
        if (fruitCalories.containsValue(45)){
            var removedValue = fruitCalories.remove("Orange");
            System.out.println("Value removed: " + removedValue + " from Orange");
        }

        if (fruitCalories.containsKey("Cherry")){
            System.out.println("Cherry old value: " + fruitCalories.get("Cherry"));
            fruitCalories.replace("Cherry", 90);
            System.out.println("Cherry new value: " + fruitCalories.get("Cherry"));
        }

        // Immutable map
        Map<String, Integer> immutableFruitCalories = Map.of(
            "Pear", 65,
            "Passion fruit", 82,
            "Pitaya", 150);

        // Output
        System.out.println(fruitCalories);
        System.out.println("Banana: " + fruitCalories.get("Banana"));
        System.out.println(immutableFruitCalories);
    }
}
