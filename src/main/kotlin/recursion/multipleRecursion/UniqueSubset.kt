package recursion.multipleRecursion

/**
 * 1 -> Printing all the unique subsequence of the list
 * */
fun main() {

    val inputList: ArrayList<Int> = arrayListOf(1, 2, 2)
    val outputList: ArrayList<Int> = arrayListOf()

    val ansList: ArrayList<ArrayList<Int>> = arrayListOf()
    val currentIndex: Int = 0

    uniqueSubset(inputList, currentIndex, outputList, ansList)
    println(ansList)
}


fun uniqueSubset(
    inputList: ArrayList<Int>, currentIndex: Int, outputList: ArrayList<Int>, ansList: ArrayList<ArrayList<Int>>
) {

    for (i in outputList) {
        print(i)
    }
    println()
    println()

    var loopIndex: Int = currentIndex
    while (loopIndex < inputList.size) {

        if (loopIndex != currentIndex && inputList[loopIndex] == inputList[loopIndex - 1]) {
            loopIndex++
            continue
        }

        outputList.add(inputList[loopIndex])
        uniqueSubset(inputList, loopIndex + 1, outputList, ansList)
        outputList.remove(inputList[loopIndex])
        loopIndex++

    }
  /*  ansList.add(ArrayList(outputList))
    for (loopIndex in currentIndex until inputList.size) {
        if (loopIndex != currentIndex && inputList[loopIndex] == inputList[loopIndex - 1]) continue
        outputList.add(inputList[loopIndex])
        uniqueSubset(inputList, loopIndex + 1, outputList, ansList)
        outputList.remove(inputList[loopIndex])
    }*/

}
