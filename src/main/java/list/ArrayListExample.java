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
      ArrayList c1 = (ArrayList) colors.clone();
      System.out.println("This is the clone copy of the ArrayList called c1: " + c1);

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

  }
}
