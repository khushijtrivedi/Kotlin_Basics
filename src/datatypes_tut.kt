fun main() {
    //everything is object there is no primitive datatype
    val x:Int = 20 // we are spceiffying that x is integer
    val y:Long = 1234L
    val z:Double = 5.6
    val a:Float = 3.4F
    val s:Boolean = true

    //[TYPE CONVERSION]
    //to convert on type to other we can use function already present
    x.toString();
    x.toDouble();

    //[TYPE INFERENCE]
    //WITHOUT SPECIFYING KOTLIN CAN VERIFY WHICH DATA TYPE IT IS no need to specify explicitley
    val xint = 12
    val xstr = "twelve"
}