/*Description

You are given an array A of size N, and Q queries to deal with. For each query, you are given an integer X, and you're supposed to find out if X is present in the array A or not.


Input
Input Format

The first line contains two integers, N and Q, denoting the size of array A and number of queries.

The second line contains N space separated integers, denoting the array of elements Ai.

The next Q lines contain a single integer X per line.

Constraints

1 <= N, Q <= 10^5

1 <= Ai <= 10^9

1 <= X <= 10^9


Output
Output Format

For each query, print YES if the X is in the array, otherwise print NO.


Sample Input 1 

5 10
50 40 30 20 10
10
20
30
40
50
60
70
80
90
100
Sample Output 1

YES
YES
YES
YES
YES
NO
NO
NO
NO
NO*/
function compare(a, b){
    return a - b;
  }
 let ans = [];
 function binarySerach(arr, n) {
    let low = 0;
    let high = arr.length - 1;
    while (low <= high) {
        let mid = low + Math.floor((high - low) / 2);
        if (arr[mid] == n) {
            ans.push("YES");
            return;
        }else if (arr[mid] > n) high = mid - 1;
        else low = mid + 1;
     }
    ans.push("NO");
    return;
}
function runProgram(input) {
    let newInput = input.split("\n");
    let nq = newInput[0].trim().split(" ").map(Number);
    let arr = newInput[1].trim().split(" ").map(Number);
    arr.sort(compare);
    let q = nq[1];
    for (let i = 2; i < 2 + q; i++) {
        let n = Number(newInput[i]);
        binarySerach(arr, n);
    }
    console.log(ans.join("\n"));
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
        process.exit(0);
    });
}
