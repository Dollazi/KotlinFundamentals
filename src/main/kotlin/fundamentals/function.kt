package fundamentals

fun main(){
    println("Hello World")
    println(returnName())
    sayhi(returnName(), idade = 29)
    sayhi(idade = 29, name = returnName())
}

fun returnName(): String{
    return "Luis"
}

fun sayhi(name: String, idade: Int){
    println("Hi! ${name}, parabéns pelos seus ${idade} anos")
}

