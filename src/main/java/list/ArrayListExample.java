package list;
import java.util.*;
public class ArrayListExample {
  public static void main(String[] args) {
    //Example 1:
    ArrayList<String> colors = new ArrayList<String>();
    colors.add("red");
    colors.add("bule");
    colors.add("yellow");
    colors.add("green");

    ArrayList<String> c1 = new ArrayList<String>();
    c1.add("red");
    c1.add("blue");
    c1.add("yellow");
    c1.add("green");

    ArrayList<String> c2 = new ArrayList<String>();
    c2.add("pink");
    c2.add("blue");
    c2.add("yellow");
    c2.add("white");

    //Iterate the list of colors:
    for (String x : colors){
      System.out.println(x);
    }

    //Print out the whole list of colors:
    System.out.println(colors);

    //Insert an element into the arraylist at the 1st position:
    colors.add(0,"pink");

    //Retrieve an element at a specific index:
    System.out.println("The color in index of 1 is: " + colors.get(1));

    //Update specific array element:
    colors.set(0, "purple");
    System.out.println(colors);

    //Remove the 3rd element in the array:
    colors.remove(2);
    System.out.println("Removed the 3rd elemet in the ArrayList: " + colors);

    //Search an elemeent in an Array:
      if(!colors.contains("red")){
        System.out.println("this element doesn't exist in the Arraylist!");
      }else {
        System.out.println("this element exist in the Arraylist!");
      }

      //Sort an arraylist:
      Collections.sort(colors);
      System.out.println(colors);

      //Copy one array list into another:
      Collections.copy(c1, c2);
      System.out.println("c1 : " + c1);
      System.out.println("c2 : " + c2);

      //Shuffle elements in the ArrayList:
      Collections.shuffle(colors);
      System.out.println("After shuffling: " + colors);

      //Reverse element in the list:
      Collections.reverse(colors);
      System.out.println("ArrayList after reversing it: " + colors);

      //Extract a potion of the ArrayList:
    List<String> subColors = colors.subList(1,3);
    System.out.println("This is the subList from colors: " + subColors);

    //Compare two arrayList:
    ArrayList<String> c3 = new ArrayList<String>();
    for(String x : c1) {
      c3.add(c2.contains(x) ? "Yes": "No");
    }
    System.out.println(c3);

    //Swap 2 elements in the arraylist:
    System.out.println("ArrayList before swap: ");
    for(String a : c1){
      System.out.println(a);
    }

    Collections.swap(c1, 0, 3);
    System.out.println("ArrayList after swap: ");
    for(String b : c1) {
      System.out.println(b);
    }

    //Join 2 arraylist together:
    ArrayList<String> conbine = new ArrayList<String>();
    conbine.addAll(c1);
    conbine.addAll(c2);
    System.out.println("Joining 2 arraylists into this new arraylist : " + conbine);

    //Clone an arraylist to another arraylist:
     ArrayList cnew = (ArrayList) colors.clone();
     System.out.println("This is ArrayList - colors: " + colors);
     System.out.println("This is Arraylist - cnew used the clone() from colors: " + cnew);

    //Empty an arraylist:
    //Time complexity of using clear() -> O(n)
    System.out.println("c1 before clearing: " + c1);
    c1.clear();
    System.out.println("c1 after clearing: " + c1);
    //Time complexity using removeAll() -> O(n^2)
    System.out.println("c1 before clearing: " + c1);
    c1.removeAll(c1);
    System.out.println("c1 after clearing: " + c1);

    //Testing if the arraylist is empty or NOT:
    System.out.println("Before: " + c1);
    System.out.println("Checking if this arraylist is empty or not: " + c1.isEmpty());
    c1.clear();
    System.out.println("After: " + c1);
    System.out.println("Checking if this arraylist is empty or not: " + c1.isEmpty());

    //Trim the capacoty of an arraylist to the current arraylist size:
    c1.trimToSize();
    System.out.println("ArrayList after trimming to size: " + c1);

    //Increase the size in an arraylist:
    System.out.println("Original arraylist: " + c1);
    c1.ensureCapacity(8);
    c1.add("pink");
    c1.add("white");
    c1.add("black");
    c1.add("orange");
    System.out.println("New ArrayList: " + c1);

    //Replace the 2nd element in the arraylist with the specified elemeent:
    System.out.println("Orignal arrayllist: " + c1);
    c1.set(1, "navy-blue");
    System.out.println("Replaced BLUE to NAVY-BLUE: " + c1);

    //Print all the eleements of an arraylist using the position of the elements:
    System.out.println("ArrayList: " + colors);
    System.out.println("Print ArrayList usinf index: ");
    for(String x : colors)
      System.out.println(x);
  }
}
