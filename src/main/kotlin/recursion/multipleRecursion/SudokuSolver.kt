package recursion.multipleRecursion


data class Tree(val value: Int) {
    var left: Tree? = null
    var right: Tree? = null
}


/*
*                               20
*                           10          122
*                       2     11       54  123
*                     1   3          34
*
*
* */


fun traverseTree(root: Tree?, sum: Int) {
    if (root?.left == null && root?.right == null) {

        var number = 0
        root?.let {
            number = root.value
        }

        if (root!= null )
        println("${root.value}   ->>>>>>          ${sum + number}")
        return
    }

//    println("${root.value}    ->>>       ${root.left?.value}    -         ${root.right?.value}")

    traverseTree(root.left, sum + root.value)
    traverseTree(root.right, sum + root.value)


}

fun main() {

    val root: Tree = Tree(20);
    addNode(root, 10)
    addNode(root, 122)
    addNode(root, 2)
    addNode(root, 54)
    addNode(root, 34)
    addNode(root, 1)
    addNode(root, 11)
    addNode(root, 123)
    addNode(root, 3)

    traverseTree(root, 0)


}


fun addNode(root: Tree?, value: Int): Tree? {
    if (root == null) {
        return null
    }
    if (root.value < value) {
        if (addNode(root.right, value) == null) {
            root.right = Tree(value)
        }
    } else {
        if (addNode(root.left, value) == null) {
            root.left = Tree(value)

        }
    }
//    println("  ADDing the node   $value   =>>  ${root.value}    ->>>       ${root.left?.value}    -         ${root.right?.value}")

    return root
}


/*
fun main() {
    println("Inside the sudoku loop ")
    CoroutineScope(Dispatchers.Default).launch {
        println("Inside the sudoku loop ")
        print(printHello())
    }


}

suspend fun printHello(): String {
    val str = CompletableDeferred<String>()
    println("Inside the sudoku ldfsdfdoop ")
    CoroutineScope(Dispatchers.IO).launch {
        println("Inside the sudoku  ")
        for (i in 0..10) {
            println(i)
            if (i == 9) {
                str.complete("Hi i am good ")
            }
        }
    }
    return str.await()
}
*/


/*
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


    */
/*loop threw the whole row
    *
    * if find empty place than put the number
    *
    *
    *
    *
    * *//*

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
}*/
