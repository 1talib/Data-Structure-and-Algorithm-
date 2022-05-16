/*
Description

Given arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits.


Input
Input Format:

First-line contains a number of trains n

Second-line contains array containing arrival time of n trains

The third line contains an array containing departure time of n trains

Constraints:

n <= 100


Output
Output one number which is the minimum number of platforms required


Sample Input 1 

6
9:00 9:40 9:50 11:00 15:00 18:00
9:10 12:00 11:20 11:30 19:00 20:00
Sample Output 1

3
*/
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int[] depart=new int[n];
    for(int i=0; i<n; i++){
      String str=sc.next();
      str = str.replace(":","");
      arr[i] = Integer.parseInt(str);
    }
    for(int i=0; i<n; i++){
        String str=sc.next();
        str = str.replace(":","");
       depart[i] = Integer.parseInt(str);
    }
    int a = 1;
    int d = 0;
    int count = 1, platforms = 1;
    while(a<n && d<n) {
      if(arr[a] < depart[d]) {
        platforms++;
        a++;
        if(platforms>count) count = platforms;
      } else {
        platforms--;
        d++;
      }
    }
    System.out.println(count);
  }
}
