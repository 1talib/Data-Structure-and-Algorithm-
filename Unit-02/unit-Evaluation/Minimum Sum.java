/*Description

Given an array of N integers. Find the minimum sum of K consecutive elements


Input
Input Format

The first line contains the number of testcases T

For each testcase, the first line contains the number N and K

The second line of each testcase consists of the elements of the array

Constraints

1<=T<=10

1<=N<=10^5

1<=K<=N

-1000<=arr[i]<=1000


Output
For each testcase print the minimum sum of K consecutive elements in a new line.


Sample Input 1 

2
5 3
9 9 -5 9 5 
5 4
2 7 6 2 -5 
Sample Output 1

9
10
Hint

For the first testcase the different sums of K consecutive elements are : 13 13 9

For the second testcase the different sums of K consecutive elements are : 17 10*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            
        int n = sc.nextInt();
        
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        
        for ( int i = 0; i<n; i++){
            
        arr[i] = sc.nextInt();
            
        }
        int sum = 0,min = 1000000;
        
        for ( int i = 0; i < k; i++){
            
         sum = sum + arr[i];
            
        }
         min = Math.min(min, sum);
         
        for( int i = k;  i < n; i++){
            
            sum = sum +arr[i];
            
            sum = sum - arr[i-k];
            
            min = Math.min(min, sum);
              }
        System.out.println(min);
      }
    }
}
