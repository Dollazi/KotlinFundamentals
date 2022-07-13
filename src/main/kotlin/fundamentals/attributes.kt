package fundamentals

//the variable val is immutable
//the varieble var is mutable

class car (var color: String, val yearFabrication: Int, val owner: owner){
}

class owner (var name: String, var age: Int){
}

fun main(){
    var car1 = car("Branco", 2021, owner("Luis",29))

    println(car1.color)

    car1.color = "Preto"
    println(car1.color)

    println(car1.owner.name)
}