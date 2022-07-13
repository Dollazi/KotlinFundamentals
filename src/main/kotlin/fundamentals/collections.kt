package fundamentals

fun main(){
    var listL = listOf(1, 2, 3) //non-mutable list
    val par = listL.filter { it % 2 == 0}
    println(par)
    val parFirst = listL.filter { it % 2 == 0}.first()
    println(parFirst)

    var parForeach = listL.forEach{
        println("-------------")
        println(it)
    }

    println("-------------")

    var listL2 = listOf(1, 2, 3, 4, 5, 6)

    for (number in listL2){
        println(number)
    }

    println(listL2[0])
    println(listL2.get(1))
    println(listL2.indexOf(6))

    var listMutable = mutableListOf(1, 2, 3, 4, 6, 3, 20, 15)

    println(listMutable)

    listMutable.add(8)

    println(listMutable)

    listMutable[0] =20

    println(listMutable)

    listMutable.sort()

    println(listMutable)

    var listNames = mutableListOf("Luis", "Rafaela", "Kiara")

    println(listNames)

    listNames.sort()

    println(listNames)

    var setNumbers = setOf(1, 2 ,3, 2) //don´t recive duplicate numbers

    println(setNumbers)

    var setNumbersMutable = mutableSetOf(1, 2, 3, 2)

    println(setNumbersMutable)

    var mapNameAge = mapOf("Luis" to 29, "Rafaela" to 28)

    println(mapNameAge)

    var mapNameAgeTwo = mutableMapOf("Luis" to 29, "Rafaela" to 28)

    mapNameAgeTwo.put("Kiara",1)

    println(mapNameAgeTwo)
}