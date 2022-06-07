/*Description

You have a circular dining table and N angry people.You need to place them on the table.Each person has a anger value.

You can place them in any order on the circular table.Once you place them you need to calculate the Danger value of your arrangement.

The danger value of the arrangement is the maximum difference of anger values of all the adjacent seated persons.You need to keep this danger value as low as possible.


Input
Input Format

The first line contains N.

The second line contains the anger values of N persons.

Constraints

3<=N<=1000

1<=Hunger Value<=1000




Output
Output format

Print the minimum possible danger value.


Sample Input 1 

4
5 10 6 8
Sample Output 1

4
*/
function angryPeople(N, arr){
    arr.sort((a,b)=>{return a-b});
    for(var i = 1; i < N; i+=2){
      arr.unshift(+arr.splice(i, 1).join(""));
    }
    let ans = 0;
    for(var i = 0; i < N; i++){
      let value = Math.abs(arr[i]-arr[i+1%N]);
      if(ans < value){
        ans = value;
      }
    }
    console.log(ans);
}
function runProgram(input) {
   var input = input.trim().split("\n");
   var N = +input[0];
   var arr = input[1].trim().split(' ').map(Number);
   angryPeople(N, arr);
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
