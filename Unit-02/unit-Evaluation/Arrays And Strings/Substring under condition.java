/*
Description

Given a string S, you need to find the count of all contiguous substrings starting and ending with same character.


Input
Input Format :

First and the only line contains a string S

Constraints:

Length of S <= 1000


Output
Output the count


Sample Input 1 

abcab
Sample Output 1

7*/
import java.util.*;
class Main {
 public static void main (String [] args){
   Scanner sc = new Scanner(System.in);
   String  s = sc.next();  
    int count = 0;
    for (int i=0; i<s.length(); i++){
    for (int j=i; j<s.length(); j++){
        if(s.charAt(i)==s.charAt(j)){
            count++;}}}
    System.out.println(count);}}
