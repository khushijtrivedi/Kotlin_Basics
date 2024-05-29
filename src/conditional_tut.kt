fun main() {
    //[IF CONDITION]
    //there is no ternary operation
    //declaring as condition
    val x= 10
    if(x >0)
    {
        println(x)
    }
    else
    {
        println("negative")
    }

    //declaring as expression
    val number = 4
    val result = if(number%2==0){
        "even"
    }
    else{
        "odd"
    }
    println(result)
    val temp = 34
    //[WHEN EXPRESSION]
    val clothes = when{
        temp > 0 && temp <=10 -> "woolen"
        temp>10 && temp <=20 -> "synthetic"
        temp>20 && temp <=30 -> "sem-cotton"

        else -> "cotton"
    }
    println(clothes)


}