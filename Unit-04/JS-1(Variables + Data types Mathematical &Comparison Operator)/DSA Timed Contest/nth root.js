/*Description

You are given two integersnandmand you have to find the floor value of thenthroot ofm.


Input
Input Format

First-line contains T, no of test cases.

First-line of each test case contains two integers n and m.

Constraints

1 <= T <= 10

1 <= n <= 30

1 <= m <= 10^9


Output
For each test case print the floor value ofnthroot ofmin a new line.


Sample Input 1 

3
2 9
6 4096
3 126
Sample Output 1

3
4
5
Hint

For the first test case, we have to find the square root of 9 which is 3.

For the second test case, we have to find the 6th root of 4096 and as 4^6 is equal to 4096, therefore, the answer is 4.

For the third test case, the cube root of 126 is 5.... something whose floor value is 5.*/
function runProgram(input){
    input = input.split("\n");
    var t = +input[0];
    var line = 1;
    for (let i= 0; i<t; i++){
        var [ n,m] = input[line].trim().split(" ").map(Number);
        line++;
        var temp = Math.floor(m ** (1/n));
        var p = 1;
         for (let i= 0; i<n; i++){
             p*= temp+1
    }
    if ( p <= m){
        console.log(temp+1)
       } else{
           console.log(temp)
       }
    }
}
 if (process.env.USERNAME === "Talib") {
      runProgram(``);
  } else {
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read = "";
    process.stdin.on("data", function (input) {
      read += input;
    });
    process.stdin.on("end", function () {
      read = read.replace(/\n$/, "");
      read = read.replace(/\n$/, "");
      runProgram(read);
    });
    process.on("SIGINT", function () {
      read = read.replace(/\n$/, "");
      runProgram(read);
      process.exit(0) ;
    });
  }
