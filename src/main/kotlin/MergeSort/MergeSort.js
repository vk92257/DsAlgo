var MergeSort = function (input) {
    if (input.length <= 1) {
        return;
    }
    var mid = input.length / 2;
    var leftArray = input.slice(0, mid);
    var rightArray = input.slice(mid, input.length);
    MergeSort(leftArray);
    MergeSort(rightArray);
    merge(input, leftArray, rightArray);
};
function merge(array, leftArray, rightArray) {
    var arrayIndex = 0;
    var leftArrayIndex = 0;
    var rightArrayIndex = 0;
    while (leftArrayIndex < leftArray.length &&
        rightArrayIndex < rightArray.length) {
        if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
            array[arrayIndex] = leftArray[leftArrayIndex];
            leftArrayIndex++;
        }
        else {
            array[arrayIndex] = rightArray[rightArrayIndex];
            rightArrayIndex++;
        }
        arrayIndex++;
    }
    while (leftArrayIndex < leftArray.length) {
        array[arrayIndex] = leftArray[leftArrayIndex];
        leftArrayIndex++;
        arrayIndex++;
    }
    while (rightArrayIndex < rightArray.length) {
        array[arrayIndex] = rightArray[rightArrayIndex];
        rightArrayIndex++;
        arrayIndex++;
    }
}
var tempInput = [
    10,
    323,
    3,
    4,
    ,
    343,
    343,
    42,
    3232,
    1,
    121,
    53,
    5,
    76,
    8,
    642,
    323,
    121,
    2,
    55,
    78,
    90,
    43,
    34,
    23,
    22,
    34,
];
console.log("array without sorting ".concat(tempInput));
MergeSort(tempInput);
console.log("array after sorting ".concat(tempInput));
