/*Description

Masai School will be hosting its Prom Night on 29th Feb.There would be M boys and N girls at the prom tonight. Each boy wants a girl who is strictly shorter than him. A girl can dance with only one boy and vice-versa.

Given the heights of all the boys and girls comment whether it is possible for all boys to get a girl.


Input
The first line contains T denoting the number of test cases.

Each test case contains three lines.

The first line contains M and N.

The second line contains M integers each denoting the height of boy.

The third contains N integers each denoting the height of girl.

Constraints

1<=T<=10

1<=N, M<=10000

1<=Height<=200


Output
Print YES if it is possible for each boy to get a girl else print NO.


Sample Input 1 

1
4 5
2 5 6 8
3 8 5 1 7
Sample Output 1

YES*/
function danceNight(B, G, arrB, arrG){
    arrB.sort((a,b)=> a-b);
    arrG.sort((a, b)=> a-b);
    let count = 0;
    for(var i = 0; i < arrB.length; i++){
        if(arrB[i] > arrG[i]){
            count++;
        }
    }
    if(count == arrB.length){
        return "YES";
    }else{
        return "NO";
    }
  }
function runProgram(input) {
   var input = input.trim().split("\n");
   var testCases = +input[0];
   var line = 1;
   for(var i = 0; i < testCases; i++){
        var [B, G] = input[line].trim().split(" ").map(Number);
        line++;
        var arrB = input[line].trim().split(" ").map(Number);
        line++;
        var arrG = input[line].trim().split(" ").map(Number);
        line++;
     console.log(danceNight(B, G, arrB, arrG));
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
