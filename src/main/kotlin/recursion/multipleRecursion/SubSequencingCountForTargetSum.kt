package recursion.multipleRecursion

fun main() {
    /*  var  list :  Array<Int>   = Array<Int>(3){
          return@Array it+1
      }
       list.forEach {
           println(it)
       }*/
    val inputArray: ArrayList<Int> = ArrayList()
    inputArray.add(1)
    inputArray.add(-1)
    inputArray.add(2)
    inputArray.add(3)
    val outputArray: ArrayList<Int> = ArrayList()
    val targetSum = 2
   println( " total subsequence is  -> "+subSequencingCountForTargetSum(inputArray, outputArray, 0, targetSum, 0))
}

fun subSequencingCountForTargetSum(
    inputArray: ArrayList<Int>, outputArray: ArrayList<Int>, currentIndex: Int, targetSum: Int, currentSum: Int
): Int {
    if (currentIndex >= inputArray.size) {
        if (currentSum == targetSum) {
            outputArray.forEach {
                print(it)
            }
            print(" === $targetSum")
            return 1
        }
        println("")
        return 0
    }


    /* Pic element for the subsequence*/
    var sum = currentSum
    outputArray.add(inputArray[currentIndex])
    sum += inputArray[currentIndex]
    val left = subSequencingCountForTargetSum(inputArray, outputArray, currentIndex + 1, targetSum, sum)

    /* not Pic element for the subsequence*/
    outputArray.remove(inputArray[currentIndex])
    sum -= inputArray[currentIndex]
    val right = subSequencingCountForTargetSum(inputArray, outputArray, currentIndex + 1, targetSum, sum)
    return left + right


}