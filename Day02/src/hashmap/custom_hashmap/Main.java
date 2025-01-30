package Day02.hashmap.custom_hashmap;


import java.util.*;


public class Main
{
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Dave", 40);

        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Contains Bob? " + map.containsKey("Bob"));

        map.remove("Charlie");
        System.out.println("Contains Charlie? " + map.containsKey("Charlie"));

        System.out.println("Current size: " + map.size());
        map.display();
    }
}
