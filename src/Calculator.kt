class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }
}
fun main(){
    val cal = Calculator()
    val output = cal.add(2,3)
    println("output is $output")

}
