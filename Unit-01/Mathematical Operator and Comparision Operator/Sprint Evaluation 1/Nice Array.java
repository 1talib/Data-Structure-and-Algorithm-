/*
Description

You are given an array, stored in a variable with the namearray

The size of the array is stored in a variable with the nameN

You are also given another number stored in a variable with the nameK

Print the output according to the following conditions

1. If the count of even elements in the array is greater than the value stored in K, print "Nice Array", without quotes

2. Else, print "Bad Array", without quotes

Input
The first line of the input contains the value stored inN

The next line containsNspace numbers, denoting the values stored inarray

The last line of the input contains the value stored inK


Output
Print the output as per the conditions mentioned in the problem statement

Sample Input 1 

5
1 2 3 4 5
2
Sample Output 1

Bad Array
Sample Input 2 

5
1 2 3 4 5
1
Sample Output 2

Nice Array
Hint

In the first sample test case, the value stored inN = 5, the arrayarray = [1 2 3 4 5], and the value stored inK = 2

The number of even elements in the array are 2, which are2, and 4, which is not greater than the value stored inK = 2, so the answer isBad Array.
In the second sample test case, the value stored inN = 5, the arrayarray = [1 2 3 4 5], and the value stored inK = 1

The number of even elements in the array are 2, which are2, and 4, which is greater than the value stored inK = 1, so the answer isNice Array.*/
function niceArray(N, array, K) {
  //write code here
   var count=0;
    for (var i=0; i<=N; i++){
     if(array[i]%2===0){
     count++;}}
     if(count>K){
     console.log("Nice Array");}
     else{
         console.log("Bad Array");}
     }
  
