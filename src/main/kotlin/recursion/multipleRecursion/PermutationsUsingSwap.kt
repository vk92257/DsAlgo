package recursion.multipleRecursion


fun main() {
    val inputList = arrayListOf<Int>(1, 2, 3)
    val currentIndex = 0

    permutationsUsingSwap(inputList, currentIndex)
}

fun permutationsUsingSwap(inputList: ArrayList<Int>, currentIndex: Int) {
    if (currentIndex == inputList.size) {
        inputList.forEach {
            print(it)
        }
        println()
        println()
        return
    }
    for (loopIndex in currentIndex until inputList.size) {
        swapValue(loopIndex, currentIndex, inputList)
        permutationsUsingSwap(inputList, currentIndex + 1)
        swapValue(currentIndex, loopIndex, inputList)
    }

}

fun swapValue(loopIndex: Int, currentIndex: Int, inputList: ArrayList<Int>) {
    val temp = inputList[loopIndex]
    inputList[loopIndex] = inputList[currentIndex]
    inputList[currentIndex] = temp
}
