/*On a string, perform the following operations

Declare a new string "AbC"
Replace "A" with "a"
Replace "b" with "B"
Update the value at index 2 to "Y"
Add "Z" to the beginning of the string
Add "A" to the end of the string
Delete the character present at index 2
Print the final string [Use a stringbuilder for this operation]*/
public class Stringreplaceposition {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("AbC");
    sb.setCharAt(0,'a');
    sb.setCharAt(1,'B');
    sb.setCharAt(2,'Y');
    sb.setCharAt(0,'Z');
    sb.setCharAt(2,'A');
    sb.deleteCharAt(2);
    System.out.println(sb);
  }
}
