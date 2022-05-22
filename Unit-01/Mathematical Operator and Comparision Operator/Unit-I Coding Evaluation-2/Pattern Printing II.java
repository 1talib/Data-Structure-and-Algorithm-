/*
Description

You are given an integer stored in a variable with the nameN

You have to print the following pattern according to the value stored inN

For example, consider the value stored inN = 5, then the required output will be

*       *
*       *
*       *
*       *
* * * * *
Note : Please check for spaces 


Input
The first and the only line of the input contains the value stored inN

Output
Print the pattern as shown in the problem statement

Sample Input 1 

5
Sample Output 1

*       *
*       *
*       *
*       *
* * * * *
Hint

In the sample test case, the value stored inN = 5, then the required output will be

*       *
*       *
*       *
*       *
* * * * *
The following figure shows the spaces in the pattern with the help of_. The_is only for your understanding, and not to be printed in the actual output

*_______*
*_______*
*_______*
*_______*
*_*_*_*_**/
public static void patternPrinting(int n){
    //write your code here
    for(int i = 1; i<n; i++){
     System.out.print("*");
    
   for(int j=1; j<=(n-2+n-1); j++){
       System.out.print(" ");
   }
     System.out.println("*");
   }
   for(int i = 0; i<n; i++){
       System.out.print("*"+" ");
      } 
      System.out.println();
    }
