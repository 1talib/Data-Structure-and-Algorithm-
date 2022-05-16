/*
Description

For each test case, you are given N integers and K, your task is to write a program that prints "1" (without quotes) if there are 2 integers present in the array whose sum is K. Else print "-1" (without quotes).


Input
10^6Input Format :

First line contains T, no of test cases.

First line of each test case contains 2 space separated integers: N & K

Second line of each test case contains **N** space separated integers

Constraints :

1 <= T <= 10

1 <= N <=1000000

1 <= abs(A[i]) <=10^6<= abs(K) <= 2*10^6




Output
Output 1/-1 depending on the condition for each test case on new line


Sample Input 1 

1
5 2
3 4 0 2 7
Sample Output 1

1*/
import java.util.*;
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
        int z = sc.nextInt();
        int T = sc.nextInt();
        int[] arr = new int[z];
        for ( int i = 0; i<z; i++){
        arr[i] = sc.nextInt();}
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean got = false;
        for (int i = 0; i < z ; i++){
            if(hm.containsKey(T-arr[i])){
                got = true;
                break;
            }
            hm.put(arr[i],1);
        }
        System.out.println((got) ? 1 : -1);
      }
    }
}
