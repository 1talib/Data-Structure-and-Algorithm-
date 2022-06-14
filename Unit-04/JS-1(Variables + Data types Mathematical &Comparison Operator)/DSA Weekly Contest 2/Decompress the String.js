/*Description

Given a string of lowercase characters and integers, decompress the string under the following rules:

- If an integer is encountered, the character just before it gets added to a final string as many times as the number

For instance, if the string is "a3b2" => the output should be "aaabb" because *a* is followed by 3, and *b* is followed by 2

Write a program that decompresses the string based on rules above


Input
Input Format

Input contains one string

Constraints

Length of string <= 100


Output
Output the decompressed string


Sample Input 1 

a3b2
Sample Output 1

aaabb*/
const runProgram = (input) => {
  input = input.trim().split("\n");
  let str = input[0].trim();
  let res = "";
  for (let i = 0; i < str.length; i++) {
    if (!isNaN(+str[i])) {
      for (let j = 0; j < +str[i]; j++) res += str[i - 1];
    }
  }
  console.log(res);
};
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
