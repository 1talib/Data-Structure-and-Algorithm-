/*Description

You are given a number, stored in the variable with the nameN

If the number is even, printEven, else printOdd

If the number is divisible by 2, the number is consideredEven, else the number is consideredOdd


Input
Input Format

There is just one positive integer in input

Constraints

integer > 1


Output
Output Format

Print "Even" or "Odd" depending on the value.


Sample Input 1 

5
Sample Output 1

Odd*/
public static void masaiEvenOrOdd(int n){
    //write your code here
    if (n%2 == 0) {
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }
  }
