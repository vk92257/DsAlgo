package recursion.multipleRecursion


/**
 * find all the unique combination from the candidate(input Array) where the candidate sum is
 * equal to the target sum
 * */


fun main() {
    val inputArray: ArrayList<Int> = arrayListOf<Int>(10, 1, 2, 7, 6, 1, 5)
    val target: Int = 8
    val currentIndex: Int = 0
    val outPutArray: ArrayList<Int> = ArrayList()
    inputArray.sort()
    combinationSumNonRepeat(inputArray, outPutArray, currentIndex, target)
}


fun combinationSumNonRepeat(inputArray: ArrayList<Int>, outPutArray: ArrayList<Int>, currentIndex: Int, target: Int) {

    /** this commented method will print the all possible candidate which sum's to the target
     * but the reparative sub-sequences will be there
     * */
    /*   if (currentIndex == inputArray.size) {
           if (target == 0) {
               outPutArray.forEach {
                   print(" $it ")
               }
               println()
               println()

           }
           return
       }

       if (inputArray[currentIndex] <= target) {
           outPutArray.add(inputArray[currentIndex])
           combinationSumNonRepeat(inputArray, outPutArray, currentIndex + 1, target - inputArray[currentIndex])
           outPutArray.remove(inputArray[currentIndex])
       }
       combinationSumNonRepeat(inputArray, outPutArray, currentIndex + 1, target)
   */



    if (target == 0) {
        outPutArray.forEach {
            print(it)
        }
        println()
        println()
        return
    }


    for (loopIndex in currentIndex until inputArray.size) {

        if (loopIndex > currentIndex && inputArray[loopIndex] == inputArray[loopIndex - 1]) continue
        if (inputArray[loopIndex] > target) break
        outPutArray.add(inputArray[loopIndex])
        combinationSumNonRepeat(inputArray, outPutArray, loopIndex + 1, target - inputArray[loopIndex])
        outPutArray.remove(inputArray[loopIndex])
    }


}
