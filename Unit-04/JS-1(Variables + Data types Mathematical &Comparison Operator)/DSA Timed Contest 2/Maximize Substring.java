/*Description

Manu Loves to play with alphabets.One day his friend gave him a string and tells him to try the following task:

Given a string S consisting of lowercase English alphabets of size N, he has to find the lexicographically maximum substring of this string .Help him finding the substring.


Input
Input Format :

The first line contains a single integer N denoting the length of string S. The next line contains the string S.

Constraints :

1 <= N <= 5000


Output
Print the lexicographically maximum substring of String S on a single line.


Sample Input 1 

6
ababaa
Sample Output 1

babaa
Hint

Output Explanation :

Lexicographically maximum string of the given string is *babaa*/
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String str=sc.nextLine();
    //to stroe the final result 
    String output="";
    for(int i=0; i<str.length(); i++){
      if(output.compareTo(str.substring(i))<=0){
        output=str.substring(i);
      }
    }
    System.out.println(output);
  
  }
}
