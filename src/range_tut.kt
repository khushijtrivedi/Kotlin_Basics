fun main() {
    val temp =34
//[RANGE]
    val tobuy = when(temp){
        in 0 .. 10 ->"jackets"
        in 10..20 ->"boots"
        in 20..30 ->"shirts"
        else ->"shorts"
    }
    println(tobuy)

    //closed range
    val numbers = 0..5
    //0 1 2 3 4 5
    println("close range")
    for(digit in numbers)
    {
        println(digit)
    }

    //half open range
    val counts=0 until 5
    //0 1 2 3 4
    //not include the final variable
    println("half open")
    for(digit in counts)
    {
        println(digit)
    }




}