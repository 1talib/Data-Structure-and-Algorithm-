/*
On a string, perform the following operations

Declare a new string "abc"
Add "a" to the end of the string
Add "b" to the beginning of the string
Add "c" at position 2
Remove the character present at index 1
Update the character at position 1 with the character "z"
Print the final string [Use a stringbuilder for the above operations]*/
public class Stringposition {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    StringBuilder sb = new StringBuilder("abc");
    sb.setCharAt(2,'a');
    sb.setCharAt(0,'b');
    sb.setCharAt(1,'c');
    sb.deleteCharAt(1);
   sb.setCharAt(1,'z');
    System.out.println(sb);
  }
}
