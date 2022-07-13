package fundamentals

class myclass(
    var name:String,
    var address:String,
    var age:Int
){
    companion object{
        fun createClass():myclass{
            return  myclass("Luis","Rua test",29)
        }
    }
}

class secondClass(
    var name:String,
    var address:String,
    var age:Int
){
    fun createClass():secondClass{
        return secondClass("Luis","Rua test",29)
    }
}

fun main(){
    var secondClass = secondClass("name", "address",29 ).createClass()

    var myclass = myclass.createClass()
}