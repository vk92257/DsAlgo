package recursion.multipleRecursion


fun main() {

    val input = arrayListOf<Int>(2, 3)
//    val input = arrayListOf<Int>(5,2,1)
    val outArrayList: ArrayList<Int> = ArrayList()
    val currentIndex: Int = 0
    val sum: Int = 0
    subSetSum(input, currentIndex, sum, outArrayList)
    outArrayList.sort()
    println(outArrayList)

}


/*fun subSetSum(input: ArrayList<Int>, currentIndex: Int,  sum: Int) {

  *//**
 * this is the approach for getting the sum of the all candidate sub-sequences
 * *//*


    if (currentIndex == input.size) {
        println(sum)
        return
    }
    var currentSum = sum
    currentSum += input[currentIndex]
    subSetSum(input,currentIndex+1,currentSum)
    currentSum -= input[currentIndex]
    subSetSum(input, currentIndex+1, currentSum)

}*/


fun subSetSum(input: ArrayList<Int>, currentIndex: Int, sum: Int, outArrayList: ArrayList<Int>) {

    /**
     * this is the approach 1 for getting the sum of the all candidate sub-sequences using a extra arrayList
     * */
    if (currentIndex == input.size) {
        println(sum)
        outArrayList.add(sum)
        return
    }
    var currentSum = sum

    /**
     * Pic the element
     * */
    currentSum += input[currentIndex]
    subSetSum(input, currentIndex + 1, currentSum, outArrayList)

    /**
     * Do not - Pic the element
     * */
    currentSum -= input[currentIndex]
    subSetSum(input, currentIndex + 1, currentSum, outArrayList)

}