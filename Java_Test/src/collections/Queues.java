package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    
    public static void main(String[] args) {
        Queue<String> fruits = new LinkedList<>();
        fruits.add("Lemon");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Banana");
        var removed = fruits.remove();
        
        System.out.println(fruits);
        System.out.println("Removed: " + removed);
        System.out.println("Head of queue: " + fruits.peek());
    }
}
