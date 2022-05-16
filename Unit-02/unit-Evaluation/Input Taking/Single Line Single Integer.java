/*Description

Single Line Single Integer


Input
The first and the only line contains the single integer, which is the input


Output
Print the input taken as the output by adding 1 to the input


Sample Input 1 

4
Sample Output 1

5*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int age = myObj.nextInt();
    System.out.println(age+1);
   
  }
}
