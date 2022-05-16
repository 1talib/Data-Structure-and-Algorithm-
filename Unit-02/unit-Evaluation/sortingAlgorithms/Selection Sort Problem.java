/*
Description

You are given an array of N unsorted numbers. Your task is to write SELECTION SORT such that numbers present in the array gets sorted.

USING ANY OTHER ALGORITHM OR USING IN BUILT SORT FUNCTION WOULD LEAD TO YOUR DISQUALIFICATION


Input
Input Format:

First line of input contains N

Second line of input contains N numbers

Constraints:

N < 500


Output
Output the numbers given after sorting it in increasing order


Sample Input 1 

5
3 5 0 9 8
Sample Output 1

0 3 5 8 9*/
import java.util.Scanner;  
public class Main  
{  
   public static void main(String args[])  
   {  
        Scanner scan = new Scanner(System.in); 
       int size, i, j, temp;  
        size = scan.nextInt(); 
       int []arr = new int[size];  
       for(i=0; i<size; i++)  
       {  
           arr[i] = scan.nextInt();  
       }  
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
       }  
       for(i=0; i<size; i++)  
       {  
           System.out.print(arr[i]+ " ");  
       }  
   }  
}  
