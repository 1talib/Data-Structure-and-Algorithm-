/*
Description

You are given a word of length N and a dictionary containing some non-empty words.

You need to check whether the given word can be segmented into a space-separated sequence of one or more dictionary words i.e, you can choose some words from the dictionary such that it is possible to obtain the exact original word by joining them in some order.

Note

You can use any word of the dictionary any number of times in the segmentation.


Input
The first line contains T denoting the number of test cases.

For each test case, the first line contains two single positive integers N and M denoting the length of the word and size of the dictionary.

The next line contains a string of length N in lowercase Latin letters.

The next M lines of input contain the strings present in the dictionary in lowercase Latin letters.

Constraints

1 <= T <= 10

1 <= N <= 200

1 <= M <= 10^6

The sum of the length of the strings present in the dictionary <= 10^6


Output
For each test case, you should print “Yes” (without quotes)  if the word can be segmented else “No” (without quotes).


Sample Input 1 

2
5 4
masai
as
mas
ai
asai
4 2
hack
hac
ack
Sample Output 1

Yes
No
Sample Input 2 

1
3 1
aaa
a
Sample Output 2

Yes
Hint

Explanation for Sample 1

For first sample we can use 2nd( “mas” ) and 3rd( “ai” ) ( 1 based indexing ) string of the dictionary to form “mas” + “ai” = “masai”
*/
import java.util.*;
   class Main{
    static boolean check (String s, String arr[]){ 
        HashMap <String, Integer> mp = new HashMap <>(); 
        for (int i = 0; i < arr.length; i++) mp.put (arr[i] , 1); 
        boolean[] dp = new boolean[s.length() + 1];
        Arrays.fill(dp, false);
        dp[0] = true; 
        for (int i = 1; i <= s.length(); i++){ 
            for ( int j = i-1; j >= 0; j--){
                dp[i] = dp [i] || (dp[j] && mp.containsKey(s.substring(j,i))); 
               }
            }
        return dp [s.length()]; 
    }
    public static void main (String[] args){ 
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt(); 
    while (t --!= 0){ 
    int sn = sc.nextInt(); 
    int n = sc.nextInt(); 
    String s = sc.next(); 
    String [] arr = new String[n]; 
    for ( int i = 0; i < n; i++){
        arr [i] = sc.next(); 
    } 
    if (check(s,arr)) System.out.println("Yes");
    else System.out.println("No");
        }
      }
   }


// import java.util.*; 
//     class Main{ 
//     public static int help(int indexT, String target, String [] arr, int[] dp){ 
//         if (indexT == target.length()){ 
//             return 1; 
//         } 
//     if(dp[indexT] != -1){ 
//       return dp[indexT]; 
//         } 
//     for(int i = 0; i < arr.length; i++){
//         String word = arr [i]; 
//         int k = indexT; 
//         for (int j = 0; j < word.length() && k < target.length(); j++){ 
//             if (word.charAt(j)!= target.charAt(k)){
//                 break; 
//             }else{
//                 k++; 
//             } 
//           if (j == word.length() - 1){
//               if (help(k,target,arr,dp)==1){
//                   return dp[indexT] = 1; 
                   
//                         } 
//                   }
//               }
//           } 
//           dp[indexT] = 0; 
//           return 0;
//         }
//         public static void main (String[] args){
//             Scanner sc = new Scanner(System.in); 
//             int t = sc.nextInt(); 
//             while(t --> 0){ 
//             int l = sc.nextInt(); 
//             int n = sc.nextInt(); 
//             String str = sc.next();
//             String[] dic = new String[n]; 
//             for (int i = 0; i < n; i++) dic[i] = sc.next(); 
//             int []dp = new int[l+1];
//             for (int i = 0; i <= l; i++){ 
//                 dp[i] = -1; 
//             }
//             if (help(0, str, dic, dp) == 1){ System.out.println("Yes");} 
//             else{System.out.println("No"); 
                
//                   }
//               } 
            
//             }
//         }  
           
           
