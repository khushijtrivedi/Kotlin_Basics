//child
class Apple:Fruit() {

}
fun main(){
    val apple = Apple()
    apple.name = "apple"
    apple.color="red"
    apple.taste = "sweet"

    apple.provideFruit()
}