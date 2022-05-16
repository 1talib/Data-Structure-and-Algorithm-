/*
Description

Multiple Test cases, such that each test case contains a sentence


Input
The first line of the test case containsT, the number of test case

The nextTlines contain a sentence each


Output
For each test case, print the sentence on a new line, as shown in the sample test case

Sample Input 1 

2
my name is ankush
my name is rutwik
Sample Output 1

my name is ankush
my name is rutwik*/
import java.util.*;  
class Main {
public static void main( String[] args ){
    Scanner scn= new Scanner(System.in);
    int w = scn.nextInt();
    scn.nextLine();
     while (w>0){
     String s = scn.nextLine();
     System.out.println(s);
      w = w-1;
     }  
   } 
}
