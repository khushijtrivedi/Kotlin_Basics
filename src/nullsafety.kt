fun main() {
    //[NULL POINTER EXCEPTION]
    //USE ? TO MAKE IT NULL APPLICABLE
    var name:String?="khushi"
    name = null // this will not throw error because we have made it null safe

    var name2:String = "trivedi"
    //name2 = null // this will throw error

    //now when we try to apply function already defined in kotlin for null applicable variable it will throw error of not null safe.
    //println(name.length) //not allowed will throw above error
    println(name2.length)// allowed cause it is not null applicable


    println(name?.length) // this is called safe calls that we are making null variable safe by explicitly making it null safe


    var car:String?=null
    //traditional way
    if(car!=null)
    {
        println("car name is $car")
    }
    else
    {
        println("car name is null")
    }

    //using elvis operator
    //if condition is true the statement on left of ?: will be printed
    // if false than on right side will be printed
    car = "hondacity"
    println(car?:"null")

    var name3:String?="harry"
    println(name3?.length?:0)
}