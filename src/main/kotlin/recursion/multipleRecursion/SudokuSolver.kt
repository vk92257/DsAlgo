package recursion.multipleRecursion


fun main() {
    var sudokuBoard: Array<Array<Int>> = arrayOf(
        arrayOf(8, 0, 0, 0, 0, 0, 0, 0, 0),
        arrayOf(0, 0, 3, 6, 0, 0, 0, 0, 0),
        arrayOf(0, 7, 0, 0, 9, 0, 2, 0, 0),
        arrayOf(0, 5, 0, 0, 0, 7, 0, 0, 0),
        arrayOf(0, 0, 0, 0, 4, 5, 7, 0, 0),
        arrayOf(0, 0, 0, 1, 0, 0, 0, 3, 0),
        arrayOf(0, 0, 1, 0, 0, 0, 0, 6, 8),
        arrayOf(0, 0, 8, 5, 0, 0, 0, 1, 0),
        arrayOf(0, 9, 0, 0, 0, 0, 4, 0, 0)
    )



    sudokuSolver(sudokuBoard)


    sudokuBoard.forEach {
        it.forEach {
            print(it)
            print(" ")
            print(" ")
        }
        println()
        println()
    }


}


fun sudokuSolver(sudokuBoard: Array<Array<Int>>): Boolean {


    /*loop threw the whole row
    *
    * if find empty place than put the number
    *
    *
    *
    *
    * */
    for (i in sudokuBoard.indices) {
        for (j in 0 until sudokuBoard[0].size) {
            if (sudokuBoard[i][j] == 0) {
                for (put in  1 until  sudokuBoard.size) {
                    sudokuBoard[i][j] = put
                    if (isValid(sudokuBoard, i, j, put)) {
                        return true
                    } else {
                        sudokuBoard[i][j] = 0
                    }
                }
            } else {
                return false
            }

        }
    }
    return true
}

fun isValid(sudokuBoard: Array<Array<Int>>, i: Int, j: Int, put: Int): Boolean {

    for (loopIndex in sudokuBoard.indices) {
        if (sudokuBoard[loopIndex][j] ==  put){
            return false
        }
        if (sudokuBoard[i][loopIndex] ==  put){
            return false
        }

        if (sudokuBoard[3 * (i / 3) + loopIndex / 3 ][3 * (j / 3 )+ loopIndex % 3] ==  put){
            return false
        }

        return true

    }
     return true
}