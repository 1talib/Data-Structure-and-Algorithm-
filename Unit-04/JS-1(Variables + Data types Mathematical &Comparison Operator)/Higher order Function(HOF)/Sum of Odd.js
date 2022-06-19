var arr = [1, 2, 3, 4];
var oddSum = arr.filter(function (el) {
    return el % 2 !== 0;
})
.reduce((acc, el) => acc + el, 0);
 console.log(oddSum);
