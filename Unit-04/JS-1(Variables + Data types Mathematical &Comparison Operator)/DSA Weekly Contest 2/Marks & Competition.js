/*Description

You have the marks of students in the form of an array, where arr[i] represents the marks of the ith student.

Since you are a curious kid, you want to find all the marks that are not smaller than those on its right side in the array.


Input
Input Format :

The first line of input will contain a single integer n denoting the number of students.

The next line will contain n space separated integers representing the marks of students.



Constraints :

1 <= n <= 1000000

0 <= arr[i] <= 10000


Output
Output all the integers separated in the array from left to right that are not smaller than those on its right side.


Sample Input 1 

6
16 17 4 3 5 2
Sample Output 1

17 5 2
Hint

Output Explanation :

*/
function marksCompetition(arr) {
    let i, j;
    var res = "";
    for (i = 0; i < arr.length; i++) {
        for (j = i; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                break;
            }
        }
        if (j == arr.length) {
            res += arr[i] + " ";
        }
    }
    return res;
}
function runProgram(input) {

    var newInp = input.split("\n");
    var arr = newInp[1].split(" ").map(Number);
    var ans = marksCompetition(arr);
    console.log(ans);
}
if (process.env.USERNAME === "Talib") {
    runProgram(``);
} else {
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    var read = "";
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
