/*Description

You are given two sorted arrays each of length N. Your task is to write a program that merges both the arrays such that the final array formed after merging is sorted.

Note: You must not use sort() function in your entire code


Input
Input Format :

First line contains N which is the number of integers present in both the arrays.

Second line contains N sorted integers which are elements of first array.

Third line contains N sorted integers which are elements of second array.



Constraints :

N < 1000


Output
Output the array formed after merging elements such that it is sorted


Sample Input 1 

4
1 5 7 9
2 4 6 8
Sample Output 1

1 2 4 5 6 7 8 9*/
import java.lang.*;
import java.io.*;
import java.util.*;
class Main{
    public static int [] solve ( int [] a, int[] b, int i, int j, int ans [], int cur){
        if ( i == a.length && j == b.length) return ans;
        if ( i == a.length){
            ans [cur] = b[j];
            return solve ( a, b, i , j+1,ans ,cur+1);
        }else if ( j == b.length){
            ans [cur] = a[i];
            return solve (a,b,i+1,j,ans,cur+1);
        }else {
            if ( a[i] < b[j]){
                ans [cur] = a[i];
                return solve (a,b,i+1,j,ans,cur+1);
            }else{
                ans [cur] = b[j];
                return solve (a,b,i,j+1,ans,cur+1);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
       for( int i = 0; i<a.length; i++) a[i] = sc.nextInt();
    for( int i = 0; i<b.length; i++) b[i] = sc.nextInt();
        int ans [] = new int[2*n];
        ans = solve(a,b,0,0,ans,0);
        for (Integer i : ans) System.out.print(i + " ");
    }
}
// import java.util.*;
// class Main{

//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         int len=s.nextInt();
//         //int length=2*len;
//         int arr1[]=new int[len];
//         int arr2[]=new int[len];
//         ArrayList<Integer>arr=new ArrayList<Integer>();
//         for(int i=0;i<len;i++){
//             arr1[i]=s.nextInt();
//             arr.add(arr1[i]);
//         }
//         for(int i=0;i<len;i++){
//             arr2[i]=s.nextInt();
//             arr.add(arr2[i]);
//         }
//         for(int i=0;i<arr.size();i++){
//             for(int j=i+1;j<arr.size();j++){
//                 if(arr.get(i)>arr.get(j)){
//                     int temp=arr.get(i);
//                     arr.set(i,arr.get(j));
//                     arr.set(j,temp);
//                 }
//             }
//         }
//         for(int i=0;i<arr.size();i++){
//             System.out.print(arr.get(i)+" ");
//         }
//     }
// }
