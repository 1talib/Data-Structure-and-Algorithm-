/*Description

Virat and Rohit don't like each other though they have many similarities. You are given 2 texts (strings) written by Virat and Rohit. Your task is to write a program that calculates the length of the longest similar characters in the text written by both.

If string written by Virat is “AGGTAB” and that by Rohit is “GXTXAYB”, then the longest set of similar characters is “GTAB”, which is of length 4.

Please note that the longest set of similar characters need not be continuous.


Input
Input Format :

First line contains text/string written by Virat

Second line contains text/string written by Rohit

Constraints :

Length of string <= 20


Output
Print the length as per conditions given in problem statement



Sample Input 1 

AEDFHR
ABCDGH
Sample Output 1

3  */
import java.util.*; 
import java.lang.*; 
import java.io.*; 
class Main{ 
static LinkedHashSet<String> set1 = new LinkedHashSet<>(); 
static LinkedHashSet<String> set2 = new LinkedHashSet<>(); 
   public static String makeString(List<Character> list){
          StringBuffer str = new StringBuffer (); 
              for (int i=0;i<list.size();i++){ 
              str.append(list.get(i));
            }
            return str.toString();
        }
       public static void subsequence2(char[] arr,List<Character> list, int cur){
             if (list.size() != 0){ 
            String a = makeString(list); 
            set2.add(a); 
             }
            if (cur == arr.length) return ;
            for (int i=cur;i<arr.length;i++){ 
                list.add(arr[i]);
               subsequence2 (arr, list,i+1); 
              list.remove(list.size() - 1); 
            }
       }
        public static void subsequence(char[] arr, List<Character> list, int cur){
            if (list.size() != 0){ 
                String a = makeString(list); 
                set1.add(a);
              }
                if (cur == arr.length) return;
                for (int i=cur;i<arr.length;i++){ 
                    list.add(arr[i]); 
            subsequence(arr,list,i+1);
            list.remove(list.size() - 1); 
                }
             }
         public static void main(String[] args){ 
             Scanner s = new Scanner(System.in); 
             String a = s.next(); 
             String b = s.next(); 
             char[] arr1 =a.toCharArray();
             char[] arr2 =b.toCharArray(); 
             List<Character> list1 = new ArrayList<>(); 
             List<Character> list2 = new ArrayList<>(); 
             subsequence(arr1,list1,0);
             subsequence2(arr2,list2,0); 
             int ans = 0;
               for(String i : set1){
            if (set2.contains(i)){
                ans = Math.max(ans, i.length());
                 }
               }
            System.out.println(ans); 
         }
    }
// import java.util.*; 
// class Main{
//     public static int solve (char[]a,char[]b,int n,int m){
//         if(n==0 || m==0) return 0;
//     else if (a[n-1]==b[m-1]) return 1+solve(a,b,n-1,m-1); 
//     else return Math.max(solve(a,b,n,m-1),solve(a,b,n-1,m)) ;
//     }
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in); 
//         String virat = sc.next(); 
//         char [] v = new char [virat.length()]; 
//         for(int i=0; i<virat.length();i++){ 
//             v[i]=virat.charAt(i);
//         }
//             String rohit = sc.next(); 
//             char [] r = new char [rohit.length()]; 
//             for (int i=0; i<rohit.length();i++){ 
//                 r[i]=rohit.charAt(i); 
//             }
//                 int n=virat.length(); 
//                 int m=rohit.length(); 
//                 System.out.print(solve(v,r,n, m));
//     }
// }
