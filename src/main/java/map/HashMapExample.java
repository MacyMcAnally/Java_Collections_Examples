package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
  public static void main(String[] args) {

    HashMap <String, Integer> h = new HashMap<String, Integer>();
    h.put("A", 10);
    h.put("B", 85);
    h.put("C", 2);
    h.put("D", 120);

    //Print the specified key and value from the HashMap:
    for (Map.Entry x : h.entrySet())
      System.out.println(x.getKey() + " : " + x.getValue());

    //Count the number of key-value (size) mappings in a map:
    System.out.println("The size of the HashMap is:" + h.size());

    //Copy all of the mappings from specified to another map:
    HashMap<String, Integer> ch = new HashMap<String, Integer>();
    ch.putAll(h);
    System.out.println("Copied HashMap from h: " + ch);

    //Remove all of the mappings from a map:
    System.out.println("HashMap before removing all elements: " + h);
    h.clear();
    System.out.println("HashMap after removing elements: " + h);

    //Check if a map contains key-value mappings (empty) or not:
    System.out.println("Check if HashMap is contains empty key-value pairs or not: " + h.isEmpty());
    h.clear();
    System.out.println("After clear() applied to the HashMap: " + h.isEmpty());

    //Get a shallow copy of a HashMap instance:
    HashMap<String, Integer> c = (HashMap) h.clone();
    System.out.println("Shallow copy of HashMap: " + c);

    //Test if a map contains a mapping for the specified key and value:
    System.out.println("HashMap contains a specific key for A: " + h.containsKey("A"));
    System.out.println("HashMap contains a specific value for A: " + h.containsValue(10));

    //Create a set view of the mappings contained in a map:
    Set set = h.entrySet();
    System.out.println("Set values are: " + set);

    //Get the value of a specified key in a Map:
    System.out.println("The value for key B is: " + h.get("B"));

    //Get a set view of the keys contained in a map:
    Set s = h.keySet();
    System.out.println("Key set values are: " + s);

    //Get a collection view of the values contained in this map:
    System.out.println("Collection view is: " + h.values());

  }
}
