/*Description

You are given a sorted arrayAof sizeN, and another integerK
You have to find if there exists a pair of integers with indexiandj, such thati != j, andA[i] - A[j] = k
If such a pair exists, printYes, else printNo

Input
The first line of the input containsT, the number of test cases.

The first line of each test case contains N and K, the size of the array and the value of K.

The next line contains N space separated integers denoting the elements of the array

Constraints

1 <=T<= 10

1 <=N<= 1000000

-10^9 <=A[i]<= 10^9

0 <= K <= 10^9


Output
For each test case, print "Yes", if the pair as described in the problem exists, else print "No", on a new line.


Sample Input 1 

2
5 3
1 2 3 4 5
5 8
1 2 3 4 5 
Sample Output 1

Yes
No
Hint

In the sample test case, in the first test case, the value ofN = 5, and that ofK = 3. Upon observation, you can see the pairs with values(2, 5)or(1,4)have a difference of 3. Therefore, the output is Yes.

In the second test case, no pair exists such that the difference between them is 8. Therefore, the output is No.*/
function pairsPresent(arr, k) {
    var set = new Set();
    for (var i = arr.length - 1; i >= 0; i--) {
        if (set.has(arr[i] + k))
            return "Yes";
        set.add(arr[i]);
    }
    return "No";
}
function runProgram(input) {
    var newInput = input.trim().split("\n");
    var t = Number(newInput[0]);
    for (var i = 1; i < t * 2; i += 2) {
        var nk = newInput[i].split(" ").map(Number);
        var k = nk[1];
        var arr = newInput[i + 1].split(" ").map(Number);
        console.log(pairsPresent(arr, k));

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
        process.exit(0);
    });
}
