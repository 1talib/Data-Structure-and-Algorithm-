/*Description

Let's talk about Shinchan's childhood

He had two types of notebooks, when he was a kid.

* 10 problems could be solved in one page, in the first notebook.

* 12 problems could be solved in one page, in the second notebook.

Shinchan remembered how in order to maintain symmetry, if he was given with n problems in total to solve, he tore out pages from both notebooks, so no space was wasted. EVER!

Given n number of questions, print the minimum number of pages he needs to tear out from the combination of both the notebooks, so that no space is wasted.


Input
Input Format :

The first line will contain t - number of test cases.

The second will contain an integer n - number of questions.

Constraints :

t <= 100

n <= 113


Output
Corresponding to the input, print the minimum number of pages Shinchan needs to tear out from the combination of both the notebooks. If it is NOT possible, print "-1".


Sample Input 1 

2
23
32
Sample Output 1

-1
3
Hint

Sample1 Explanation :

For 32: 2 pages from the notebook, where 10 can be solved; 1 page from the notebook, where 12 can be solved.*/
import java.util . * ; 
public class Main { 
    public static void main ( String args [] ){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt() ; 
        int dp[] = new int [114]; 
        for ( int i = 0; i <= 11; i++) {
            dp [i] = -1;
        } 
        dp [10] = 1; 
        dp [0] = 0; 
        for ( int i = 12 ; i <= 113 ; i++){ 
         if ( dp[i-10] != - 1 && dp [i-12] != -1)
        dp [i] = 1 + Math.min (dp [i - 10] , dp [i - 12]); 
        else if (dp[i-10] != -1) 
        dp[i] = 1 + dp[i-10]; 
        else if ( dp[i-12]!= -1) 
        dp [i] = 1 + dp [i-12] ; 
        else dp [i] = -1;
        } 
        for ( int i = 0 ; i < t ; i ++ ) {
            System.out.println (dp[sc.nextInt ()]); 
        }
    }
}
