package recursion.multipleRecursion


fun main() {

    val sizeOfChess: Int = 4
    val currentIndex: Int = 0
    val outPUtList = arrayListOf<Int>()
    val m = Array(4) { _ -> Array(4) { _ -> 0 } }

    m.forEach {
        it.forEach {
            print(it)
        }
        println()
    }

    println(m)
//    nQeenProblem(sizeOfChess, currentIndex, outPUtList)
}

fun nQeenProblem(sizeOfChess: Int, currentIndex: Int, outPUtList: ArrayList<Int>) {
    if (currentIndex == sizeOfChess) {
        outPUtList.forEach {
            print(it)
        }
        println()
        println()
        return
    }


    for (loopIndex in 0 until sizeOfChess) {

        toPlaceQueen(currentIndex, loopIndex, outPUtList)
    }


}

fun toPlaceQueen(currentIndex: Int, loopIndex: Int, outPUtList: java.util.ArrayList<Int>) {

    checkForLeft(currentIndex, loopIndex, outPUtList)
    checkForRight(currentIndex, loopIndex, outPUtList)
    checkForTop(currentIndex, loopIndex, outPUtList)
    checkForBottom(currentIndex, loopIndex, outPUtList)

    checkForDiagonalLeft(currentIndex, loopIndex, outPUtList)
    checkForDiagonalRight(currentIndex, loopIndex, outPUtList)
    checkForDiagonalTop(currentIndex, loopIndex, outPUtList)
    checkForDiagonalBottom(currentIndex, loopIndex, outPUtList)

}

fun checkForDiagonalBottom(currentIndex: Int, loopIndex: Int, outPUtList: ArrayList<Int>) {

}

fun checkForDiagonalTop(currentIndex: Int, loopIndex: Int, outPUtList: java.util.ArrayList<Int>) {
}

fun checkForDiagonalRight(currentIndex: Int, loopIndex: Int, outPUtList: java.util.ArrayList<Int>) {


}

fun checkForDiagonalLeft(currentIndex: Int, loopIndex: Int, outPUtList: ArrayList<Int>) {

}

fun checkForBottom(currentIndex: Int, loopIndex: Int, outPUtList: java.util.ArrayList<Int>) {
}

fun checkForTop(currentIndex: Int, loopIndex: Int, outPUtList: ArrayList<Int>) {

}

fun checkForRight(currentIndex: Int, loopIndex: Int, outPUtList: ArrayList<Int>) {

}

fun checkForLeft(currentIndex: Int, loopIndex: Int, outPUtList: java.util.ArrayList<Int>) {
//    for ()
}
