package list;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<String> a2 = new LinkedList<String>();
    a2.add("tiger");
    a2.add("monkey");

    //Append the specified element to the end of the linkedlist:
    LinkedList<String> animals = new LinkedList<String>();
    animals.add("cat");
    animals.add("dog");
    animals.add("giraffe");
    animals.add("squirrel");
    //System.out.println(animals);

    //Iterate through all elements in the linkedlist:
    System.out.println("Iterate the LinkedList: ");
    for(String s : animals)
      System.out.println(s);

    //Iterate through all elements in a linkedlist starting at the specified position:
    Iterator p = animals.listIterator(1);
    while (p.hasNext()){
      System.out.println(p.next());
    }

    //Iterate a linkedlist in reverse order:
    System.out.println("LinkedList before reversing order: " + animals);
    Iterator u = animals.descendingIterator();
    System.out.println("LinkedList in reversing order: ");
    while (u.hasNext()){
      System.out.println(u.next());
    }

    //Insert the specified element into the linkedlist at the specified position in the linkedlist:
    System.out.println("LinkedList before inserting: " + animals);
    animals.add(2, "sheep");
    System.out.println("LinkedList after inserting: " + animals);

    //Insert the specified element into the linkedlist at the first and last position:
    System.out.println("LinkedList before inserting: " + animals);
    animals.addFirst("tiger");
    animals.addLast("lion");
    System.out.println("LinkedList after inserting: " + animals);

    //Insert the specified element at the front of a linkedlist:
    System.out.println("LinkedList before inserting: " + animals);
    animals.offerFirst("monkey");
    System.out.println("LinkedList after inserting: " + animals);

    //Insert the specified element at the end of a linkedlist:
    System.out.println("LinkedList before inserting: " + animals);
    animals.offerLast("elephant");
    System.out.println("LinkedList after inserting: " + animals);

    //Insert some elements at the specified position into a linkedlist:
    System.out.println("Original LinkedList: " + animals);
    animals.addAll(1, a2);
    System.out.println("New LinkedList: " + animals);

    //Get the 1st and last occurrence of the specified elements in a linkedlist:
    System.out.println("First element in the LinkedList: " + animals.getFirst());
    System.out.println("Last element in the LinkecList: " + animals.getLast());

    //Display the elements and their positions in a linkedlist:
    System.out.println("LinkedList: " + animals);
    for (int i = 0; i < animals.size(); i++) {
      System.out.println("Element at index " + i + " : " + animals.get(i));
    }

    //Remove a specified element from a linkedlist:
    System.out.println("Original LinkecList: " + animals);
    animals.remove(1);
    System.out.println("LinkedList after removing element: " + animals);

    //Remove the 1st and last element from the LinkedList:
    System.out.println("Original LinkecList: " + animals);
    animals.removeFirst();
    animals.removeLast();
    System.out.println("LinkedList after removing element: " + animals);

    //Remove the all elements from the LinkedList:
    System.out.println("Original LinkecList: " + animals);
    //removeAll() and clear() will remove all the elements in the linkedlist
    animals.removeAll(animals);
    animals.clear();
    System.out.println("LinkedList after removing element: " + animals);

  }
}
