/*
Description

You are given an arrayAof sizeN, and an integerK

You have to find out if there is a subset in the arrayA, such that

1. The number of distinct elements in the subset is `K`
2. The sum of all the elements in the subset is odd
If the above two conditions are true, printTrue, else printFalse


Input
The first line of the input containsN, the size of the array

The next line containsNspace separated integers, denoting the elements in the array

The last line of the input containsK, as mentioned in the problem statement

Constraints

1 <=N<= 18

1 <=A[i]<= 100


Output
If a subset exists, such that both the conditions given in the problem statement is true, printTrue, else printFalse


Sample Input 1 

3 
1 2 3
2
Sample Output 1

True
Sample Input 2 

3
2 2 2
2
Sample Output 2

False
Hint

In the first sample test case, all the subsets of the given array are

[]
[1]
[1, 2]
[1, 2, 3]
[1, 3]
[2]
[2, 3]
[3]

The value ofK = 2. The subset [2,3] has 2 distinct elements, and the sum is 5. Hence, the answer isTrue

In the second test case, there is no subset with sum odd. Therefore, the answer isFalse */
import java.util.*;
public class Main{
    public static boolean flag = false;
    public static void subs(int n, int[] arr, int k, ArrayList<Integer> ans , int index){
        if(ans.size()!=0){
            HashMap<Integer, Integer> chk = new HashMap <Integer,Integer>();
            for( Integer i : ans){
                if(chk.containsKey(i)){
                    int value = chk.get(i)+1;
                    chk.put(i,value);
                }else{
                  chk.put(i,1);  
                }
                int sum = 0;
                for (Integer y:ans){
                    sum+=y;
                }
                if(chk.size()==k&&sum%2!=0){
                    flag = true;
                }
            }
        }
        if( ans.size()==n){
            return;
        }
        for ( int i = index; i < n ; i++){
            ans.add(arr[i]);
            subs(n,arr,k,ans,i+1);
            ans.remove(ans.size() -1);
        }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int count = 1;
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int index = 0;
        ArrayList <Integer> ans = new ArrayList<Integer>();
        subs(n, arr, k, ans , 0);
        if( flag == true){
            System.out.print("True");
        }else{
            System.out.println("False");
        }
        
    }
}
