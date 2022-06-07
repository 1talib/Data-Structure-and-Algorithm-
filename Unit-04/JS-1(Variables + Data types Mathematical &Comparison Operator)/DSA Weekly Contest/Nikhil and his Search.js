/*Description

Nikhil and his friend Sachin are on a quest to find the answer to Life.

In order to complete it, they need to answer Q queries on an array A having N integers. The queries can be of the following two types:

0 x: Find the number of numbers in A which are not less than x.

1 x: Find the number of numbers in A which are greater than x.

Help them complete the quest.


Input
Input Format

The first line consists of a single integer denoting N.

The second line consists of N space separated integers denoting the array A.

The third line consists of a single integer denoting Q.

Each of the following Q lines consists of a query of one of the given two types.

Constraints

1<= N <= 100000

1<=Q<=300000

1<= elements of array, x < 1000000000




Output
For each query print the required answer in a new line.


Sample Input 1 

4
1 2 3 4
3
0 5
1 3
0 3
Sample Output 1

0
1
2*/
function upperBoundEqual(arr, x) {
    let index = -1;
    let low = 0;
    let high = arr.length - 1;
    while (low <= high){
        let mid = low + Math.floor((high - low) / 2);
        if (arr[mid] >= x) {
            index = mid;
            high = mid - 1;
       }else low = mid + 1;
    }
    if (index == -1) return 0;
    else{
    return arr.length - index;
    }
}
function upperBoundGreater(arr, x) {
    let index = -1;
    let low = 0;
    let high = arr.length-1;
    while (low <= high) {
        let mid = low + Math.floor((high - low) / 2);
        if (arr[mid] > x) {
            index = mid;
            high = mid - 1;
        }else low = mid + 1;
     }
    if (index == -1) return 0;
    else{
    return arr.length - index;
    }
}
function compare(a, b){
    return a - b;
}
function runProgram(input) {
    let newInput = input.split("\n");
    let arr = newInput[1].trim().split(" ").map(Number);
    let q = Number(newInput[2]);
    arr.sort(compare);
    let ans = [];
    for (let i = 3; i < 3 + q; i++) {
        let op = newInput[i].trim().split(" ").map(Number);
        let query = op[0];
        let x = op[1];
        if (query === 0) ans.push(upperBoundEqual(arr, x));
        else if (query == 1) ans.push(upperBoundGreater(arr, x));
    }
    console.log(ans.join("\n"));
}
if (process.env.USERNAME === "Talib") {
    runProgram(`4
    1 2 3 4
    3
    0 5
    1 3
    0 3`);
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
