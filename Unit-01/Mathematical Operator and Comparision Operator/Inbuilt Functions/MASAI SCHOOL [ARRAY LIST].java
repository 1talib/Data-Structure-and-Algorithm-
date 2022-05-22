/*
Perform the following operations on an arraylist containing names of Individual, and print the arraylist in the end

Add "Aman" to the list
Add "Shubendu" to the list
Add "Shivaraj" to the list
Check if "Ankush" is present in the list or not - Print the output of this operation
Add "Ankush" to the list
Add "Vishal" to the list
Add "Nrupul" at the zeroth index of the list
Remove "Ankush" from the list
Print the final list*/
import java.util.ArrayList;
  public class Masaischool{
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Aman");
    list.add("Shubendu");
    list.add("Shivaraj");
    if(list.contains("Ankush")){
      System.out.println("Ankush is present in the list");
    } else {
      System.out.println("Ankush is not present in the list");
    }
    list.add("Ankush");
    list.add("Vishal");
    list.add(0,"Nrupul" );
    list.remove("Ankush");
    System.out.println(list);
  }
}
