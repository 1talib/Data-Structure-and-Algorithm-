/*Description

You are given two arraysAandB, each of size N.
The first array A, is sorted in ascending order, while the second array is sorted in descending order.
You have to find the number of elements common in both the arrays.
Try to solve this without using any extra space.


Input
The first line of the input containsT, the number of test cases.

The first line of each test case, contains N, the number of elements in the arrayAandB

The next line of the test case, containsNspace separated integers, denoting the number of elements of the arrayA

The next line containsNspace separated integers, denoting elements of the arrayB.

Constraints

1 <=T<= 10

1 <=N<= 1000000

1 <=A[i]<= 1000


Output
For each test case, print the number of elements common in both the arrays, on a new line.


Sample Input 1 

1
6
1 2 2 3 4 5
4 4 3 2 1 1
Sample Output 1

4
Hint

In the sample test case, the number of elements common in both the arrays are {1,2,3,4}. Therefore, the required output is 4.*/

function findCommon(arr1, arr2) {
    let left = 0;
    let right = arr2.length - 1;
    let count = 0;
    while (left < arr1.length && right >= 0) {
        if (arr1[left] == arr2[right]){
            count++;
            left++;
            right--;
        } else if (arr1[left] > arr2[right]) {
            right--;
        } else left++;
    }
    return count;
}

function runProgram(input) {
    let newInput = input.split("\n");
    let t = Number(newInput[0]);
    for (let i = 1; i < t * 3; i += 3) {
        let arr1 = newInput[i + 1].trim().split(" ").map(Number);
        let arr2 = newInput[i + 2].trim().split(" ").map(Number);
        console.log(findCommon(arr1, arr2));
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
