//parent
open class Fruit {
    var name:String=" "
    var color:String=" "
    var taste: String=""

    fun provideFruit(){
        println("Fruit name is $name")
        println("Fruit color is $color")
        println("Fruit taste is $taste")
    }
}
//we use keyword open to make it non final so we can inherit it in child class