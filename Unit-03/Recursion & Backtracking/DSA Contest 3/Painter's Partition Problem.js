/*Description

Given an array A of n wooden boards where the ith board has Ai length. We need to paint all the n boards and we have p painters available for the work and each takes 1 unit time to paint 1 unit of the board.

Two painters cannot share a board to paint. So for example, if the ith board is painted by some painter, then he will complete the painting. A board cannot be painted partially by one painter, and partially by another.

Any painter will only paint continuous sections of boards, i.e if the painter paints a range [l,r], then he paints all the boards within that interval. For example -

Consider 5 boards numbered from 1 to 5, then the painter can not paint the board [2,4,5].

Calculate the minimum time to complete this job.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains 2 integers n (1 ≤ n ≤ 100000) and p (1 ≤ p ≤ 1000).

The second line of each test case contains n integers (1 ≤ Ai ≤ 100000) - The elements of the array A.


Output
For each test case, print the answer: The minimum amount of time required to complete the job.


Sample Input 1 

2
2 2
1 10
4 10
1 8 11 3
Sample Output 1

10
11*/
function runProgram(input) {
  input = input.trim().split("\n");
  for (let i = 1; i < input.length; i++) {
    let [n, p] = input[i++].trim().split(" ").map(Number);
    let a = input[i].trim().split(" ").map(Number);
    const result = getTime(a, n, p);
    console.log(result);
  }
}
const getTime = (a, n, p) => {
  let lo = Math.max(...a),
    hi = a.reduce((acc, ele) => acc + ele, 0);
  while (lo < hi) {
    let mid = lo + Math.floor((hi - lo) / 2);
    let reqPainter = numOfPainters(a, n, mid);
    if (reqPainter <= p){
      hi = mid;
    }else{
      lo = mid + 1;
    }
  }
  return lo;
};
const numOfPainters = (a, n, maxLen) => {
  let total = 0,
    numPainters = 1;
  for (let i = 0; i < n; i++) {
    total += a[i];

    if (total > maxLen) {
      total = a[i];
      numPainters++;
    }
  }
  return numPainters;
};
if (process.env.USERNAME === "Talib") {
      runProgram(`2
2 2
1 10
4 10
1 8 11 3`);
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
