/*
Description

Given an array of N elements, find the next greater element for each element in the array, print -1 if it does not exits. Refer to the sample I/O for better understanding


Input
The first line contains T, the number of test cases.

The first line of each test case contains N, the number of elements in the array. The next line contains N space separated integers denoting the elements of the array

Constraints

1 <= T <= 10

1 <= N <= 10^5

0 <= A[i] <= 10000


Output
For each test case, print N space separated integers, denoting the next greater element for each element,  on a new line.


Sample Input 1 

1
4
1 3 2 4
Sample Output 1

3 4 4 -1
Hint

In the sample test case, the array contains 4 elements, and for the first element, the next greater element will be 3, similarly for the next element, the next greater element will be 4, and for the third element as well, the next greater element will be 4. Since, the last element has no elements ahead of it, the next greater element will be -1.
*/
import java.util.*;
 public class Main{
    public static int [] find (int [] array){
        int [] answer = new int[array.length];
        Stack<Integer>st=new Stack<>();
        for ( int i = array.length-1; i>=0; i--){
        while(!st.isEmpty()&&st.peek()<=array[i])st.pop();
            if(st.isEmpty())answer[i] = -1;
            else{
                answer[i] = st.peek();}
                st.push(array[i]);}
                return answer ;}
                public static void main (String [] args){
                    Scanner sc = new Scanner ( System.in);
                    int test= sc.nextInt();
                    while( test--!=0){
                    int num = sc.nextInt();
                    int [] array = new int [num];
                    for ( int i = 0; i < num ; i++)
                    array[i] = sc.nextInt();
                    int[] answer = find(array);
                    for(Integer i : answer)
                    System.out.print(i + " ");
                    System.out.println();
                    }
                }
          }
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int test = sc.nextInt();
//         for (int t = 0; t < test; t++) {
//             int num = sc.nextInt();
//             int[] array = new int[num];
//             for (int i = 0; i < num; i++) {
//                 array[i] = sc.nextInt();
//             }
//             for (int i = 0; i < num; i++) {
//                 int mx = 0;
//                 if (i == num - 1){
//                 mx = -1;
//                 }else
//               for (int j = i + 1; j < num; j++) {
//                 if (i != num - 1 && array[j] > array[i]) {
//                 mx = array[j];
//                  break;
//                 }else
//                  mx = -1;
//                 }
//               System.out.print(mx + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int test = sc.nextInt();
//         // for (int t = 0; t < test; t++) { 
//           while (test-- >0){
//             int num = sc.nextInt();
//             int[] arr = new int[num];
//             for (int i = 0; i < num; i++)
//             arr[i] = sc.nextInt();
//             for (int i = 0; i < num - 1; i++) {
//                 for (int j = i + 1; j < num; j++) {
//                     if (arr[j] > arr[i]) {
//                         System.out.print(arr[j] + " ");
//                         break;
//                     } else if (j == num - 1) {
//                         System.out.print("-1");
//                     }
//                 }
//             }
//             System.out.println("-1");
//         }
//     }
// }
