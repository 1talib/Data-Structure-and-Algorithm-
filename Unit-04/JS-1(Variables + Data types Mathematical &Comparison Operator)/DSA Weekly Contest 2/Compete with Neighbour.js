/*Description

You are provided an array A which has N elements. Your task is to find the count of such occurrence where the element is larger than its neighbour.


Input
Input Format :

First line of input contains N which is the number of elements present in the array.

Second line contains N integer which are the elements of the array A.

Constraints :

N<100

There will always be at least 2 elements


Output
Output one integer which is the count of such occurences.


Sample Input 1 

8
1 2 3 4 2 1 6 5
Sample Output 1

2*/

function runProgram(input) {
   input = input.split("\n");
   var n = +input[0];
   var arr = input[1].split(" ").map(Number);
   competewithNeighbour(n, arr);
}
function competewithNeighbour(n, arr){
    var c = 0;
  for(var i=0;i<n;i++){
     if (i === 0){
         if (arr[i] > arr[i+1]){ 
         c++;
         }
     }
     else if (i == n - 1){
         if (arr[i] > arr[i-1]) {
         c++;
         }
     }
     else{ 
         if (arr[i]>arr[i+1] && arr[i] > arr[i-1]){ 
         c++;
         }
      }
   }
    console.log(c);
} 
if (process.env.USER === "Talib") {
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
        runProgram(read);
    });

    process.on("SIGINT", function () {
        read = read.replace(/\n$/, "");
        runProgram(read);
        process.exit(0);
    });
}
