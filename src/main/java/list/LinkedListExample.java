package list;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import sun.awt.image.ImageWatched;

import java.util.*;

public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<String> a2 = new LinkedList<String>();
    a2.add("tiger");
    a2.add("monkey");
    a2.add("sheep");

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

    //Swap two elements in a linkedlist:
    System.out.println("LinkedList before swapping: " + animals);
    Collections.swap(animals, 0, 2);
    System.out.println("LinkedList after swapping: " + animals);

    //Shuffle the elements in a linkedlist:
    System.out.println("LinkedList before swapping: " + animals);
    Collections.shuffle(animals);
    System.out.println("LinkedList after swapping: " + animals);

    //Joining 2 linkedlists:
    LinkedList<String> list = new LinkedList<String>();
    list.addAll(animals);
    list.addAll(a2);
    System.out.println(list);

    //Clone an linkedlist to another linkedlust:
    LinkedList copylinkedlist = (LinkedList) animals.clone();
    System.out.println(copylinkedlist);

    //Remove and return the 1st element of the linkedlist:
    System.out.println("LinkedList: " + animals);
    System.out.println("1st element in the LinkedList is: " + animals.pop());
    System.out.println("Linkedlist after removing element: " + animals);

    //Retrieve but does not remove, the last element of a linkedlist:
    System.out.println("LinkedLst: " + animals);
    System.out.println("Showing the last element in the Linkedlist: " + animals.peekLast());

    //Check if a particular element exits in a linkedlist:
    System.out.println("LinkedList: " + animals);
    if(animals.contains("cat")){
      System.out.println("It Does!");
    }else{
      System.out.println("It doesn't");
    }

    //Convert a linkedlist into an arrauList:
    List<String> arr = new ArrayList<String>(animals);
    for (String s : arr)
      System.out.println(s);

    //Comparing 2 linkedlists:
    LinkedList<String> c = new LinkedList<String>();
    for (String x : animals)
      c.add(a2.contains(x) ? "Yes" : "No");
    System.out.println(c);

  }
}
