package fundamentals

class Person(var name: String, var age: Int) {
    override fun toString(): String {
        return "Class: Person. Name: ${name}, Age: ${age}"
    }
}

fun main(){
    var Luis = Person("Luis",29)
    println(Luis)
}