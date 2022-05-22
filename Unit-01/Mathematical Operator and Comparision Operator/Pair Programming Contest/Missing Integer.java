/*Description

You are given an array of N-1 integers and integers are in the range of 1 to N. There are no duplicates in the array. One of the integers is missing in the array. Find the missing integer


Input
Input Format

The first and only line contains N-1 integers

Constraints

N<100


Output
Print the one number belonging from 1 to N which is not present in the array


Sample Input 1 

4 5 1 3
Sample Output 1

2*/
public static void missingInteger(int[] arr){
    //write your code here
    int sum =0;
  int newsum=0;
  for(int i =0; i< arr.length;i++){sum += arr[i];}
  for(int j =1; j <= arr.length+1; j++){
   newsum += j;}
   System.out.println(newsum-sum) ;
  }
