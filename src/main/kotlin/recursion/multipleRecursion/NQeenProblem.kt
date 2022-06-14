package recursion.multipleRecursion


fun main() {

    val sizeOfChess: Int = 4
    val currentIndex: Int = 0
    val loopIndex: Int = 0
    val outPUtList = arrayListOf<Int>()
    val m = Array(4) { _ -> Array(4) { _ -> 0 } }

    /*m.forEach {
        it.forEach {
            print(it)
        }
        println()
    }*/

    /*  println(m)*/
    nQueenProblem(sizeOfChess, currentIndex, m)
}

fun nQueenProblem(sizeOfChess: Int, currentIndex: Int, outPUtList: Array<Array<Int>>) {
    if (currentIndex == sizeOfChess) {
        outPUtList.forEach {
            it.forEach {
                print(" ")
                print(" ")
                print(" ")
                print(it)
            }
            println()
        }
        println()
        println()
        return
    }


    for (index in 0 until sizeOfChess) {
        if (toPlaceQueen(currentIndex, index, outPUtList)) {
            outPUtList[index][currentIndex] = 1
            nQueenProblem(sizeOfChess, currentIndex + 1, outPUtList)
            outPUtList[index][currentIndex] = 0
        }
    }


}

fun toPlaceQueen(currentIndex: Int, loopIndex: Int, outPUtList: Array<Array<Int>>): Boolean {

    /*Checking the left side for the queen*/
    var tempRow = loopIndex
    var tempCol = currentIndex


    while (tempRow >= 0) {
        if (outPUtList[tempRow][tempCol] == 1) {
            return false
        }
        tempRow--
    }


//    for (index in currentIndex..0) if (outPUtList[index][loopIndex] == 1) return false

    /*Checking the right side for the queen*/
    tempRow = currentIndex
    tempCol = loopIndex

    while (tempRow < outPUtList.size) {
        if (outPUtList[tempRow][tempCol] == 1) {
            return false
        }
        tempRow++
    }

//    for (index in currentIndex until outPUtList.size) if (outPUtList[index][loopIndex] == 1) return false

    /*Checking the top side for the queen*/

    tempRow = currentIndex
    tempCol = loopIndex

    while (tempCol >= 0) {
        if (outPUtList[tempRow][tempCol] == 1) {
            return false
        }
        tempCol--
    }


//    for (index in loopIndex..0) if (outPUtList[currentIndex][index] == 1) return false

    /*Checking the downside for the queen*/

    tempRow = currentIndex
    tempCol = loopIndex

    while (tempCol < outPUtList.size) {
        if (outPUtList[tempRow][tempCol] == 1) {
            return false
        }
        tempCol++
    }


    for (index in loopIndex until outPUtList.size) if (outPUtList[currentIndex][index] == 1) return false


    /*Checking the left topside for the queen*/
    tempRow = loopIndex
    tempCol = currentIndex
    while (tempRow >= 0 && tempCol >= 0) {

        if (outPUtList[tempRow][tempCol] == 1) {
            return false
        }
        tempRow--
        tempCol--

    }


    /*Checking the left downside for the queen*/
    tempRow = loopIndex
    tempCol = currentIndex
    while (tempRow >= 0 && tempCol < outPUtList.size) {
        if (outPUtList[tempRow][tempCol] == 1) return false
        tempRow--
        tempCol++
    }


    /*Checking the right downside for the queen*/
    tempRow = loopIndex
    tempCol = currentIndex
    while (tempRow < outPUtList.size && tempCol < outPUtList.size) {
        if (outPUtList[tempRow][tempCol] == 1) return false

        tempRow++
        tempCol++
    }

//    Checking the right topSide for the queen
    tempRow = loopIndex
    tempCol = currentIndex

    while (tempRow < outPUtList.size && tempCol >= 0) {
        if (outPUtList[tempRow][tempCol] == 1) return false
        tempRow++
        tempCol--
    }


    return true
}

