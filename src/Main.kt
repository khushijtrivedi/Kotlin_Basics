class Laptop(brandVal:String,ramVal:Int,yearVal:String) {
    var brand:String =brandVal
    var ram:Int = ramVal
    var builtYear:String = yearVal

    fun provideInfo()
    {
        println("Laptop Brand ${brand}")
        println("Laptop ram ${ram}")
        println("Laptop year ${builtYear}")
    }
}

