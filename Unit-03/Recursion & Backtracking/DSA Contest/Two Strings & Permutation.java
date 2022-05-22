/*
Description

You are given two strings S1 and S2 of equal number of characters. Your task is to comment if any permutation of one string can form other or not.

If it is possible, print "Yes" (without quotes)

If it is not possible, print "No" (without quotes)


Input
Input Format

Input contains 2 lines

First line contains string S1

Second line contains string S2

Constraints

Length of both string < 1000


Output
Output Yes/No based on condition met


Sample Input 1 

amit
mtia
Sample Output 1

Yes*/
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static boolean DoTheyArePermutation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < str1.length(); i++)
            if (ch1[i] != ch2[i])
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        if (DoTheyArePermutation(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
// import java.io.*;
// import java.lang.*; 
// import java.util.*; 
// class Main { 
//     public static void main (String [] args ){ 
//         Scanner s = new Scanner ( System.in ); 
//         String a = s.next(); 
//         String b = s.next(); 
//         HashMap < Character , Integer > map1 = new HashMap < >();
//         HashMap < Character , Integer > map2 = new HashMap < > ();
//         for ( int i = 0 ; i < a.length () ; i++) map1.put(a.charAt ( i ), map1.getOrDefault(a.charAt (i), 0) +1); 
//         for ( int i = 0 ; i < b.length () ; i ++ ) map2.put(b.charAt ( i ), map2.getOrDefault(b.charAt (i),0) +1); 
//         if(map1.equals(map2)) System.out.println("Yes") ; 
//         else{ 
//             System.out.println("No"); 
//             }
//         }
//     }
