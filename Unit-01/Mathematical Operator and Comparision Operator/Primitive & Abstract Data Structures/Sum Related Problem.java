/*
Description

You are given a numberN, you need to find sum of all the even numbers which are less than or equal to N.


Input
Input Format

First and the only line contains one number N.

Constraints

1 <= N <=10000


Output
Output Format

Output sum of all even number which are less than equal to N.


Sample Input 1 

4
Sample Output 1

6
Sample Input 2 

3
Sample Output 2

2
Hint

Numbers less than or equal to 4 are :- [1 2 3 4]

Even Numbers less than or equal to 4 are :- [2 4], whose sum is 2 + 4 = 6.

Numbers less than or equal to 3 are :- 1 2 3

Even Numbers less than or equal to 4 are :- [2], whose sum is 2.*/
public static void sumRelatedProblem(int n){
    //write your code here
    int sum = 0;
    for(int i=1; i<= n; i++){
    if (i%2==0){
      sum +=i;}}
    System.out.print(sum);}
