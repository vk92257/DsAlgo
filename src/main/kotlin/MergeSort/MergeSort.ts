const MergeSort = (input: number[]) => {
  if (input.length <= 1) {
    return;
  }

  let mid: number = input.length / 2;

  let leftArray: number[] = input.slice(0, mid);
  let rightArray: number[] = input.slice(mid, input.length);

  MergeSort(leftArray);
  MergeSort(rightArray);
  merge(input, leftArray, rightArray);
};

function merge(array: number[], leftArray: number[], rightArray: number[]) {
  let arrayIndex: number = 0;
  let leftArrayIndex: number = 0;
  let rightArrayIndex: number = 0;
  while (
    leftArrayIndex < leftArray.length &&
    rightArrayIndex < rightArray.length
  ) {
    if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
      array[arrayIndex] = leftArray[leftArrayIndex];
      leftArrayIndex++;
    } else {
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

let tempInput: number[] = [
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
console.log(`array without sorting ${tempInput}`);
MergeSort(tempInput);
console.log(`array after sorting ${tempInput}`);
