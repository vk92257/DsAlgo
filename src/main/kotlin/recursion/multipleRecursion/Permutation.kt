package recursion.multipleRecursion

fun main() {
    val input = arrayListOf<Int>(1, 2, 3)
    val outPutList = arrayListOf<Int>()
    val verifyList = arrayListOf<Boolean>(false, false, false)
    val currentIndex = 0
    permutation(input, outPutList, verifyList)
}

fun permutation(input: ArrayList<Int>, outPutList: ArrayList<Int>, verifyList: ArrayList<Boolean>) {
    if (outPutList.size == input.size) {
        outPutList.forEach {
            print(it)
        }
        println()
        return
    }

    for (loopIndex in 0 until input.size) {
        if (!verifyList[loopIndex]) {
            outPutList.add(input[loopIndex])
            verifyList[loopIndex] = true
            permutation(input, outPutList, verifyList)
            outPutList.remove(input[loopIndex])
            verifyList[loopIndex] = false
        }

    }

}
