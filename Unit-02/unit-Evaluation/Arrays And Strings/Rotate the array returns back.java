/*
Rotate the array returns back Ended
Description

You are given an array of n elements and an integer k, you need to rotate the array by k units.



Input
First-line contains t, which is the number of test cases

For each test cases, first-line has n & k - the number of elements in the array and the number of times the array has to be rotated

The second line of each test case contains n numbers which represent the elements of the array

Constraints

1<=T<=20

1<=N<=50000, 0<=K<=1000000000

1 <= Ai <= 1000000


Output
out put N elements, elements of the array , rotated by K units



Sample Input 1 

3
2 1
1 2
2 2
1 2
3 1
1 2 3
Sample Output 1

2 1
1 2
3 1 2*/
import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while( T > 0 ){
            int a = sc.nextInt();
            int z = sc.nextInt();
              z = z % a;
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
             for (int i = a-z; i < a; i++) {
            System.out.print(arr[i]+ " ");}
            for (int i = 0; i < a-z ; i++) {
            System.out.print(arr[i]+ " ");}
            System.out.println();
            T--;
      }
    }
}
