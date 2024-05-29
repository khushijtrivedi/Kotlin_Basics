fun main() {
    val num = arrayOf(1,2,3,4,5)

    println(num[0])
    println(num.size)

    num[0] = 10
    println(num[0])
    //for loop (for each loop)
    for(digit in num){
        println(digit)
    }
}