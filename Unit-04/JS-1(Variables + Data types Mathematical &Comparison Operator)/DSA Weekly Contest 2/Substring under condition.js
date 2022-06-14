/*Description

Given a string S, you need to find the count of all contiguous substrings starting and ending with same character.


Input
Input Format :

First and the only line contains a string S

Constraints:

Length of S <= 1000


Output
Output the count


Sample Input 1 

abcab
Sample Output 1

7*/
function runProgram(input) {
    var count = 0;
    for (var i = 0; i < input.length; i++)
        for (var j = i + 1; j < input.length + 1; j++) {
            var s = input.substring(i, j);
            if (s[0] == s[s.length - 1])
                count++;
        }
    console.log(count);
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
