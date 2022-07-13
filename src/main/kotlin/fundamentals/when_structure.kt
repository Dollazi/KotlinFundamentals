package fundamentals

fun main(){
    val x = 5

    when(x){
        5, -5 -> println("x == 5") // five or - five
        8 -> println("x == 8")
        10 -> {
            println("x == 10")
            println("x is a dozen")
        }
        in 11..15 -> println("x between 11 and 15")
        !in 16..20-> println("the number is not between 16 and 20")
        else -> println("Numero nao mapeado")
    }

    println(startWithHello("Hello, are you fine?"))

    when{
        startWithHello(5) -> println("5")
        startWithHello("Hello, are you fine?") -> println("Hello, i´m good")
    }
}

fun startWithHello(x:Any):Boolean{
    return when(x){
        is String -> x.startsWith( prefix = "Hello")
        else -> false
    }
}