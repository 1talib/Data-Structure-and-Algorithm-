/*
Description

Given a sorted array of integers, return indices of two numbers such that they add up to a target value.

Print -1 -1 if not found.


Input
First line contains T, number of test cases

Second line contains N and B where N is the size of the array and B is the target sum

1 <= T <= 10

2 <= N <= 1000, 2 <= B <= 3e5

1 <= Ai <= 1e5

it is guaranteed that sum of N over all test cases is at most 1000.


Output
Two values a, b i.e. indexes of any two elements that are found else -1 -1 if not found. Indexing is 0 based indexing. If multiple solutions exist, output the one with the lowest values of a and b.

Note - the answer should print the smaller index first followed by the larger index. The smallest such index pair should be printed.

If we have 2 sorted pairs [a1, b1] and [a2, b2], the first pair is said to be smaller than the second one if a1 < a2 or (a1 == a2 and b1 < b2 )


Sample Input 1 

3
4 9
2 7 11 15
5 10
1 2 3 5 5
2 100
48 49
Sample Output 1

0 1
3 4
-1 -1*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int N = sc.nextInt();
            int Target = sc.nextInt();
            int[] Arr = new int[N];
            for (int i = 0; i < N; i++) {
                Arr[i] = sc.nextInt();
            }
          int ind = -1, index=-1;
          int i = 0, j = N-1;
          while ( i < j){
              if (Arr[i] + Arr[j]==Target){
                  ind = i;
                  index = j;
                  break;
                    }
         else if (Arr[i] + Arr[j] < Target){
             i++;
                    }
         else{ j--;
                }
             }
    System.out.println(ind + " " + index);
        }
     }
 }
