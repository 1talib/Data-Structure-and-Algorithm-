/*
Description

Givennnon-negative integers representing an elevation map where the width of each bar is 1, calculate how much rain water will be trapped after it rains.


Input
Input Format

First line contains T the number of test cases

Second line contains N the size of the array

Third line contains N space separated integers

Constraints

1 <= T <= 10

1 <= N <= 10e5

0 <= a[i] <= 1000


Output
Print a single integer, the amount of rain water trapped


Sample Input 1 

2
5
3 2 0 4 6
7
7 0 3 6 2 3 5
Sample Output 1

4
14*/
function runProgram(input) {
    input = input.split("\n");
    var t = +input[0];
    var line = 1;
    for (let i = 0; i < t; i++) {
        var n = +input[line];
        line++;
        var arr = input[line].trim().split(" ").map(Number);
        line++;
        output(n, arr);
    }
}
function output(n, arr) {
    var maxWater = 0;
    var l = 0, r = n - 1;
    var maxLeft = arr[l];
    var maxRight = arr[r];
    while (l < r) {
        if (arr[l] <= arr[r]) {
            maxLeft = Math.max(maxLeft, arr[l]);
            maxWater +=   (maxLeft - arr[l]);
            l++;
        } else {
            maxRight = Math.max(maxRight, arr[r]);
            maxWater += (maxRight - arr[r]);
            r--;
        }
    }
    console.log(maxWater);
}
if (process.env.USERname === "Talib") {
    runProgram(`2
    5
    3 2 0 4 6
    7
    7 0 3 6 2 3 5`);
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
