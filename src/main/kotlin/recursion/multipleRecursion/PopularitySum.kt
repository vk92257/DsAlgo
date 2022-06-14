package recursion.multipleRecursion

fun main() {
//    val inputList = arrayListOf<Int>(1, 2, 3, 1000)
    val inputList = arrayListOf<Int>(1, 2, 3,4, 1000)
    val outPutList = arrayListOf<Int>()
    val sumList = arrayListOf<Int>()
    val currentIndex = 0
    val maxLength = 4
    findPopularitySum(inputList, outPutList, sumList, currentIndex)
        sumList.sortDescending()


    for (loopIndex in 0 until maxLength){
        print(sumList[loopIndex])
        println()
        println()
    }
}

fun findPopularitySum(
    inputList: ArrayList<Int>, outPutList: ArrayList<Int>, sumList: ArrayList<Int>, currentIndex: Int
) {
    if (currentIndex == inputList.size) {
        var sum = 0
        outPutList.forEach {
            print(it)
            sum += it
        }
        sumList.add(sum)
        println()
        println()
        return
    }
    outPutList.add(inputList[currentIndex])
    findPopularitySum(inputList, outPutList, sumList, currentIndex + 1)
    outPutList.remove(inputList[currentIndex])
    findPopularitySum(inputList, outPutList, sumList, currentIndex + 1)

}
