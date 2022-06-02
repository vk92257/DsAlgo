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
    val targetSum = 5
    subSequencingTargetSum(inputArray, outputArray, 0, targetSum, 0)
}

fun subSequencingTargetSum(
    inputArray: ArrayList<Int>, outputArray: ArrayList<Int>, currentIndex: Int, targetSum: Int, currentSum: Int
): Boolean {
    if (currentIndex >= inputArray.size) {
        if (currentSum == targetSum) {
            outputArray.forEach {
                print(it)
            }
            print(" === $targetSum")
            return true
        }
        println("")
        return false
    }


    /* Pic element for the subsequence*/
    var sum = currentSum
    outputArray.add(inputArray[currentIndex])
    sum += inputArray[currentIndex]
    if (subSequencingTargetSum(inputArray, outputArray, currentIndex + 1, targetSum, sum)) {
        return true
    }

    /* not Pic element for the subsequence*/
    outputArray.remove(inputArray[currentIndex])
    sum -= inputArray[currentIndex]
    if (subSequencingTargetSum(inputArray, outputArray, currentIndex + 1, targetSum, sum)) return true
    return false

}