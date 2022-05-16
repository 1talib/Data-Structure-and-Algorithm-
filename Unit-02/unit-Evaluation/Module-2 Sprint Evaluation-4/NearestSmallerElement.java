/*
Description

You are given an array A of size N. For each element, in the array find the closest element with a smaller value, than the current value. If no such element exists, print -1. If two values are equidistant to the current value, print the one that occurs to the left of it. Refer the sample I/O for better understanding.


Input
The first line contains T, the number of test cases. The first line of each test case contains N, the size of the array.

Next line contains N space separated integers denoting the closest smaller values, or -1, if no such values exist.

Constraints

1 <= T <= 10

1 <= N <= 10^5

1 <= A[i] <= 10^4


Output
For each test case, print N space separated integers, denoting the nearest smaller elements, or -1 if it does not exists, on a new line.


Sample Input 1 

1
8
39 27 11 4 24 32 32 1
Sample Output 1

27 11 4 1 4 24 1 -1 
Hint

In the sample test case, the array has 8 elements. The closest value to the first element 39, which is lesser than it is 27. Similarly, for 27 is 11, for 11 is 4, for 4 is 1, for 24 is 4, for the first instance of 32, the closest value is 24, and for the second instance, the closest value is 1, and for 1, the value is -1, as it has no values lesser than it in the array.
*/
import java.io.*;
import java.lang.*;
import java.util.*;
class Main{
    public static int [] right(int[]arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        for ( int i=arr.length-1; i>=0;i--){
     while(!stack.isEmpty() && arr[stack.peek()]>= arr[i]) stack.pop();
            if (stack.isEmpty()) ans[i]=-1;
            else{
                ans[i]= stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    public static int [] left (int[] arr){
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            if(stack.isEmpty()) ans[i]=-1;
        else{
            ans[i] = stack.peek();
        }
       stack.push(i); 
    }
    return ans;
}
public static int [] solve (int [] left, int[] right){
    int [] ans = new int [left.length];
    for (int i = 0; i<left.length; i++){
        if ( left[i]==-1 && right[i]==-1) ans[i] = -1;
        else if ( left[i] == -1) ans[i]= right[i];
        else if ( right[i] == -1) ans[i]= left[i];
    else{
    int temp1 = Math.abs(i-left[i]);
    int temp2 = Math.abs(i- right[i]); 
    if ( temp1 > temp2){
        ans[i] = right[i];
    }
    else {
        ans [i] = left[i];
        }
    }
}
     return ans;
}
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t--!=0){
        int n =sc.nextInt();
        int [] arr = new int [n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        int [] left = left (arr);
        int [] right = right(arr);
        int [] ans = solve(left,right);
        for (int i = 0; i < ans.length; i++){
     if (ans [i] != -1) System.out.print(arr[ans[i]] + " ");
            else{
                System.out.print(-1 + " ");
                      }
                 }
                System.out.println();
             }
         }
     }
