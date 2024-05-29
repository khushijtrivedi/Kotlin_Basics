//singleton class here we do not need to create an object

object MySinngleton {
var x = 10
    fun anyFun(){
        println("anyFun")
    }
}

fun main(){
    MySinngleton.x = 100
    MySinngleton.anyFun()
}