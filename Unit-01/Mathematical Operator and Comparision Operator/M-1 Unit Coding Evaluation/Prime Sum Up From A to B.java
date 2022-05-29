/*Description

You are given two numbers, stored in a variable with the nameA and B. Find out the sum of all prime numbers in the range of [A to B], including the value stored inA and B


Input
The first and the only line of the input contains the value stored inA and B


Output
Print the sum of all prime numbers in the range of[A,B], includingA and Bitself


Sample Input 1 

1 5
Sample Output 1

10
Sample Input 2 

2 9
Sample Output 2

17
Hint

In the first sample test case, the value stored inA =1 and B=5. Therefore, all the prime numbers, in the range of[A,B]are

2
3
5
Therefore, the sum of prime numbers becomes,2 + 3 + 5 =10, which is the required answer



In the second sample test case, the value stored inA =2 and B=9. Therefore, all the prime numbers, in the range of[A,B]are

2
3
5
7
Therefore, the sum of prime numbers becomes,2 + 3 + 5 +7=17, which is the required answer*/
 public static void primeSumUp(int a,int b){
    //write your code here
   int sum=0;
   for( int i=a; i<=b; i++){
       int count = 0;
      for( int j=2; j<=i/2; j++){ 
          if(i%j==0){
             count++;
              break;}}
         if(count==0 && i!=1){
             sum+=i;
         }
       }
       System.out.print(sum);
  }
