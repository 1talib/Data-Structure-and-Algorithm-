/*
Description

Ayush is running a marathon. There a number of start points in this marathon. At each start point x, you have an energy drink which gives you y amount of energy. With 1 unit of energy, you can travel 1 km distance. Therefore, if you start at x and have an energy drink of y, you will be able to travel for y kms from x. Your task is to find out the number of points from the given list of points, starting from which with 0 energy, ayush will be able to reach the end. The end is always located at 100000.


Input
Input Format

First line contains T, the number of test cases

First line of each test case has a single integer n, the number of points

The second line of each test case contains n space separated integers which represent the starting points

The third line of each test case contains n space separated integers which represent respective energy drink values for each starting point

Input Constraints

1 <= t <= 10

1 <= n <= 1e5

1 <= x <= 1e5,1 <= y <= 1e3


Output
For each test case, print on a new line, the number of points from the given list of points starting from which ayush will be able to complete the race.


Sample Input 1 

2
3
99991 99994 99997
3 3 3
3
1 4 7
3 3 3
Sample Output 1

3
0 */
import java.util.*; 
public class Main { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while(t-->0){  
        int n = sc.nextInt();
        int arr[] =  new int[n]; 
        for (int i = 0; i < n; i++) { 
        arr[i] = sc.nextInt(); 
        }
        int value[] = new int [n]; 
        for (int i = 0; i < n; i++) { 
            value[i] = sc.nextInt(); 
         }
         int need = (100000 - arr[n - 1]) - value[n - 1];
         int ans = (need <= 0) ? 1 : 0; 
         for (int i = n - 2; i >= 0; i--) { 
             need += (arr[i + 1] - arr[i]) - value[i]; 
             if (need <=0){
                 ans++;
               need = 0;
                   }
                }
               System.out.println(ans);
        }
    }
}
