package fundamentals

fun main(){
//    evenOrOdd(number = 2)
//    evenOrOdd(number = 3)
    gradePointAverage(grade = 5)
    gradePointAverage(grade = 6)
    gradePointAverage(grade = 8)

    println(evenOrOdd(number = 2))
    println(evenOrOdd(number = 9))
}

//fun evenOrOdd(number: Int){
//    if(number%2 == 0){
//        println("Even")
//    }else{
//        println("Odd")
//    }
//}

fun evenOrOdd(number: Int): String {
    return if (number % 2 == 0)
        "Even"
    else
        "Odd"
}

//if the score >= 6 -> approved
//if the score > 4 -> summer school
//if the score < 4 -> fail

fun gradePointAverage(grade: Int){
    if (grade >= 6){
        println("Approved")
    }else if(grade >= 4){
        println("Summer school")
    }else{
        println("Fail")
    }
}