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

2
Hint

Output Explanation :

In this case, 4 is bigger than both its neighbour 3 and 2.

Similarly 6 is bigger than both its neighbour 5 and 1.

So, the answer is 2.

*/
function runProgram(input){
    var input_arr = input.trim().split(/[\r\n]+/)
    var array = input_arr[1].split(" ")
    var count = 0
    for(var i = 0 ; i < array.length; i++)
    {
        array[i] = Number(array[i])
    }
    if(array[0] > array[1])
    {
        count += 1;
    }
    if(array[array.length-1] > array[array.length-2])
    {
        count += 1;
    }
    for(var i = 0 ; i < array.length; i++)
    {
        if(array[i] > array[i+1] && array[i] > array[i-1])
        {
            count += 1;
        }
    }
    console.log(count)
}
process.stdin.resume();
process.stdin.setEncoding("ascii");
let read = "";
process.stdin.on("data", function (input) {
    read += input;
});
process.stdin.on("end", function () {
    read = read.replace(/\n$/,"")
   runProgram(read);
});
process.on("SIGINT", function () {
    read = read.replace(/\n$/,"")
    runProgram(read);
    process.exit(0);
});
