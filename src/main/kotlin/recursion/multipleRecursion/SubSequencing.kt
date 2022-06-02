package recursion.multipleRecursion

fun main() {
    /*  var  list :  Array<Int>   = Array<Int>(3){
          return@Array it+1
      }
       list.forEach {
           println(it)
       }*/


    val inputArray: ArrayList<Int> = ArrayList()
    inputArray.add(1)
    inputArray.add(2)
    inputArray.add(3)
    val outPutArray: ArrayList<Int> = ArrayList()
    subSequencingArray(inputArray, outPutArray, 0)
}

fun subSequencingArray(inputArray: ArrayList<Int>, outputArray: ArrayList<Int>, currentIndex: Int) {
    if (currentIndex >= inputArray.size) {
        outputArray.forEach {
            print("   array item -> $it")
        }
        println("")
        println("")
        return
    }
    outputArray.add(inputArray[currentIndex])
    subSequencingArray(inputArray, outputArray, currentIndex + 1)
    outputArray.remove(inputArray[currentIndex])
    subSequencingArray(inputArray, outputArray, currentIndex + 1)


}