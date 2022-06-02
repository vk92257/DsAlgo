package recursion.multipleRecursion


fun main() {
    val inputArray: IntArray = intArrayOf(2, 3, 6, 7)
//    val inputArray: IntArray = intArrayOf(2, 3, 5)
    val outPutArray: ArrayList<Int> = ArrayList()
    val ansPutArray: ArrayList<ArrayList<Int>> = ArrayList()
    val targetSum = 7
    val currentIndex = 0
    combinationSum(
        inputArray, outPutArray, targetSum, currentIndex, ansPutArray
    )

}

fun combinationSum(
    inputArray: IntArray,
    outPutArray: ArrayList<Int>,
    targetSum: Int,
    currentIndex: Int,
    ansPutArray: ArrayList<ArrayList<Int>>
) {


    /**
     *
     * BASE-Condition -> if the current index is greater than the size of the input array and
     *                  the target sum is 0 than print the subsequences
     *
     *   1 pic all the integer grater than the target value at the same index
     *   2 if not pic than increase the current index
     *
    * */



    if (currentIndex == inputArray.size) {
        if (targetSum == 0) {
            ansPutArray.add(outPutArray)
            outPutArray.forEach {
                print(it)
            }
            println()
            println("---------")
        }
        println("")
        return
    }

    if (inputArray[currentIndex] <= targetSum ) {
        outPutArray.add(inputArray[currentIndex])
        combinationSum(inputArray, outPutArray, targetSum - inputArray[currentIndex], currentIndex, ansPutArray)
//        outPutArray.removeAt(outPutArray.size - 1)
        outPutArray.remove(inputArray[currentIndex])
    }
    combinationSum(inputArray, outPutArray, targetSum, currentIndex + 1, ansPutArray)
}