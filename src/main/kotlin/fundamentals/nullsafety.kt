package fundamentals

fun main(){
    var name:String = "Luis" //this variable is typed and cannot be null

    var nameTwo:String? = null //this variable is typed and can be null because of ? after String

    println(name?.length) //? will prevent null point exception

    var nameTree:String? = "Luis"

    //elvis operator ?:
    var nlenght:Int = name?.length ?: 0 //if anything other than left non-null returns zero or can return anything

    var listNullable:List<Int>? = null //this list accepts numbers null
}