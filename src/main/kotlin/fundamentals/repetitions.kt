package fundamentals

fun main(){
    println(printUpToTen())
    println(printDownToTen())
    println(printPairsUpToTen())
    println(printRange(start = 10, final = 20))
    whileLessThanTen()
    doWhileLessThanTen()
}

fun doWhileLessThanTen(){
    var x = 0
    do {
        println(x)
        x++
    }while (x < 10)
}

fun whileLessThanTen(){
    var x = 0
    while (x < 10){
        println(x)
        x++
    }
}

fun printUpToTen(){
    for(number in 1 .. 10){
        println(number)
    }
}

fun printDownToTen(){
    for (number in 10 downTo 1){
        println(number)
    }
}

fun printPairsUpToTen(){
    for(number in 2 .. 10 step 2){
        println(number)
    }
}

fun printRange(start: Int, final: Int){
    for (number in start .. final){
        println(number)
    }
}