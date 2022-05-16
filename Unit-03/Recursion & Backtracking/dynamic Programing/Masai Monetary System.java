/*
Description

In Masai, they have a very strange monetary system.

Each Masaian gold coin has an integer number written on it. A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. But these numbers are all rounded down (the banks have to make a profit).

You can also sell Masaian coins for Indian Rupees. The exchange rate is 1:1. But you can not buy Masaian coins.

You have one gold coin. What is the maximum amount of Indian Rupees you can get for it?


Input
Input Format

The input will contain several test cases (not more than 10). Each test case is a single line with a numbern. It is the number written on your coin.

Constraints

0 <=n<= 1 000 000 000




Output
For each test case output a single line, containing the maximum amount of Indian Rupees you can make.


Sample Input 1 

12
2
Sample Output 1

13
2*/
import java.util.*;
public class Main{ 
    static HashMap<Integer, Long> map = new HashMap<Integer, Long>(); 
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in); 
        while(true){ 
        try{ 
            int n = sc.nextInt(); 
        System.out.println(m1(n));
        }
        catch(Exception e){ 
            break;
        }
      }
    }
            public static long m1(int n){
            if (n <= 11) return n; 
            if (n == 1) return 1; 
            if (!map.containsKey(n)) { 
                map.put(n, m1(n/2) + m1(n/3) + m1(n/4));
                } 
                return map.get(n);
            }
    }
