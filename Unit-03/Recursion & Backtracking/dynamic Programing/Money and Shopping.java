/*
Description

Alice is in a shopping mall to buy books, shirts and shoes. The mall has exactly N different shops and each shop contains all these three items at different prices. Alice has a plan which she will be following. As per her plan, she won't buy the same item from the current shop if she had already bought that item from the shop adjacent to the current shop.

Alice wants to follow her strategy strictly but at the same time she wants to minimize the total money she spends on shopping. You are provided description about all N shops i.e costs of all three items in each shop. You need to help Alice find minimum money that she needs to spend such that she buys exactly one item from every shop.


Input
Input Format

First line contain number of test cases T. Each test case in its first line contain N denoting the number of shops in shopping mall.

Then each of next N lines contains three space separated integers denoting cost of books, shirts and shoes in that particular shop.

Constraints

1 ≤ T ≤ 10

1 ≤ N ≤ 100000

Cost of each item (book/shirt/shoe) does not exceed 10000


Output
Output Format

For each test case, output the minimum cost of shopping taking the mentioned conditions into account in a separate line.


Sample Input 1 

1
3
1 50 50
50 50 50
1 50 50
Sample Output 1

52
*/
import java.util.* ;
public class Main{
    final static int SHIRT = 0; 
    final static int PANT = 1;
    final static int SHOE = 2; 
 public static void main(String args[] ) throws Exception { 
     Scanner s = new Scanner(System.in); 
     int numberofTestcases = s.nextInt (); 
     for(int i=1;i<=numberofTestcases;i++){ 
         int numberofshops = s.nextInt (); 
         int arr[][] = new int[numberofshops][3]; 
         for(int j=0;j<numberofshops; j++){
             arr[j][SHIRT] = s.nextInt ();
             arr[j][PANT] = s.nextInt(); 
             arr[j][SHOE] = s.nextInt();
           }
             System.out.println(getMinPrice(arr, numberofshops));
         }
      }
             public static int getMinPrice(int[][]shops, int shopNumbers) { 
             for (int i=1;i<shopNumbers;i++) { 
                shops[i][SHIRT] += Math.min(shops[i-1][PANT], shops[i-1][SHOE ]); 
                shops[i][PANT] += Math.min(shops[i-1][SHIRT], shops[i-1][SHOE]);
                shops[i][SHOE] += Math.min(shops[i-1][SHIRT], shops[i-1][PANT]); 
               }
                return Math.min(shops[shopNumbers-1][SHIRT], Math.min(shops[shopNumbers-1][PANT], shops[ shopNumbers - 1][SHOE]));
            }
      }
