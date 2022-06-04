/*Description

You are given two integers, stored in the variable with the following names

L, W
Also, you are given another two integers, stored in the variable with the following names

length & width

If the value stored in length is greater than the value stored in L and the value stored in width, is greater than the value stored in W, printUpload

Else If the value stored in length is less than the value stored in L, printIncrease Length

Else if the value stored in width, is less than the value stored in W, printIncrease Width


Input
Input Format:

First line contains 2 space separated integers which are L and W

Second line contains length and width of uploaded pic

Constraints:

L,H<100


Output
Output one of the strings based on condition met


Sample Input 1 

12 14
8 19
Sample Output 1

Increase Length
Hint

In the sample test case, the value stored inL = 12 and W = 14

The value stored inlength = 8 and width = 19

In this case, the value stored in L, is greater than the value stored in length. Hence, the output isIncrease Length*/
function profilePic(L, W, length, width) {
 if (length > L && width > W){
     console.log("Upload");
 }else if(length < L){
     console.log("Increase Length");
 } else if(width < W){
     console.log("Increase Width");
 }
}
