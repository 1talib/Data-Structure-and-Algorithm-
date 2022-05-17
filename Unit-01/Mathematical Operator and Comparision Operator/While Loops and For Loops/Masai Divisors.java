/*
Description

You are provided 3 integers: left, right and k. 
Your task is to write a program that,
finds out the count of all such numbers between lefts and right (both inclusive) which are divided by k.


Input
Input Format

First line contains 3 space separated integers which are left, right and k respectively.

Constraints

0 <= left, right, k <= 10000


Output
Output the count as mentioned in problem description.

Sample Input 1 

1 10 3
Sample Output 1

3
Hint

In this test case

left is 1, right is 10 and k is 3.

So all numbers between 1 to 10 are [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].

From above numbers, numbers divisible by 3 are [3, 6, 9]. So total count of numbers divisible by 3 are 3.*/
public static void masaiDivisors(int left,int right,int k){
    //write your code here
    int y=0;
    for (int i = left; i<=right; i=i+1){
        if (i%k==0)
        y = y+1;
  }
  System.out.println(y);
}
