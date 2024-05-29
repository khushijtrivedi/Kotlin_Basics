fun main() {
    //strings to define combination of character
    val av = "hulk"
    println(av.length) // to find length
    println(av[0]) // index

    val quote = "ah i am hulk"

   // val res = av + quote
    val res = "my name is $av and i say $quote"
    println(res)

    // multiline string
    val sent = """
        this is a multi line string
        this is fun
        used to write in continuous 
        in many line
        like this
    """.trimIndent()
    println(sent)

    //PAIRS AND TRIPLES
    // to store multiple varibale at a time
    val studdeta = Pair<String, Int>("harry", 10)
    println(studdeta.first);
    println(studdeta.second);

    val datedet = Triple<String,String,String>("Day","month","Year")
    val datvalue = Triple(8,12,2002)

    println("${datedet.first}= ${datvalue.first}")
    println("${datedet.second}= ${datvalue.second}")
    println("${datedet.third}= ${datvalue.third}")

    //ANY
    //IT IS PARENT FOR ALL THE TYPE, ROOT OF KOTLIN HEIRARCHY

    val a:Any = 5

    //UNIT
    //SIMILAR TO VOID TYPE JAVA, WHEN THERE IS NO RETURN TYPE
    //by default it will be set if there is no return type
    add()

}

fun add():Unit{
    val ress = 1+1
    println(ress)
}