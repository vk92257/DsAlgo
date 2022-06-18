package recursion.multipleRecursion


fun main() {

    val sizeOfChess: Int = 4
    val currentIndex: Int = 0
    val loopIndex: Int = 0
    val outPUtList = arrayListOf<Int>()
    val matrix2D = Array(4) { _ -> Array(4) { _ -> 0 } }

    /*  m[1][3]=65
  matrix2D.forEach {
          it.forEach {
              print(" ")
              print(" ")
              print(" ")
              print(it)
          }
          println()
      }*/

    /*  println(m)*/
    nQueenProblem(sizeOfChess, currentIndex, matrix2D)
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
        if (isSafeToPlaceQueen(currentIndex, index, outPUtList, sizeOfChess)) {
            outPUtList[index][currentIndex] = 1
            nQueenProblem(sizeOfChess, currentIndex + 1, outPUtList)
            outPUtList[index][currentIndex] = 0
        }
    }


}

fun isSafeToPlaceQueen(currentIndex: Int, loopIndex: Int, outPUtList: Array<Array<Int>>, sizeOfChess: Int): Boolean {


    /*  outPUtList.forEach {
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
      println()
      println()
      println()
      println()*/

    /*Checking the left side for the queen*/
    var tempRow = loopIndex
    var tempCol = currentIndex

    /* while (tempCol >= 0) {
         if (outPUtList[tempRow][tempCol] == 1) {
             return false
         }
         tempCol--
     }*/


    for (index in tempCol..0) if (outPUtList[tempRow][tempCol] == 1) return false

    /*Checking the right side for the queen*/
    tempRow = currentIndex
    tempCol = loopIndex

    /* while (tempCol < sizeOfChess ) {
         if (outPUtList[tempRow][tempCol] == 1) {
             return false
         }
         tempCol++
     }*/

    for (index in tempCol until outPUtList.size) if (outPUtList[tempRow][tempCol] == 1) return false

//    Checking the top side for the queen

    tempRow = currentIndex
    tempCol = loopIndex

    /* while (tempRow >= 0) {
         if (outPUtList[tempRow][tempCol] == 1) {
             return false
         }
         tempRow--
     }*/


    for (index in tempRow..0) if (outPUtList[tempRow][tempCol] == 1) return false

//    Checking the downside for the queen

    tempRow = currentIndex
    tempCol = loopIndex

    /* while (tempRow < sizeOfChess) {
         if (outPUtList[tempRow][tempCol] == 1) {
             return false
         }
         tempRow++
     }*/
    for (index in tempRow until outPUtList.size) if (outPUtList[currentIndex][index] == 1) return false


    /**
     * Checking the diagonally
     * */



//    Checking the left topside for the queen
    tempRow = loopIndex
    tempCol = currentIndex
    while (tempRow >= 0 && tempCol >= 0) {
        if (outPUtList[tempRow][tempCol] == 1) {
            return false
        }
        tempRow--
        tempCol--

    }


//    Checking the left downside for the queen
    tempRow = loopIndex
    tempCol = currentIndex
    while (tempCol >= 0 && tempRow < sizeOfChess) {
        if (outPUtList[tempRow][tempCol] == 1) return false
        tempRow++
        tempCol--
    }


//    Checking the right downside for the queen
    tempRow = loopIndex
    tempCol = currentIndex
    while (tempRow < sizeOfChess && tempCol <sizeOfChess) {
        if (outPUtList[tempRow][tempCol] == 1) return false
        tempRow++
        tempCol++
    }

//    Checking the right topSide for the queen
    tempRow = loopIndex
    tempCol = currentIndex

    while (tempCol < sizeOfChess && tempRow >= 0) {
        if (outPUtList[tempRow][tempCol] == 1) return false
        tempRow--
        tempCol++
    }

    return true
}

