package fundamentals

 fun returnNumberInFull(number:Int):String{

     if(number == 5){
         return "Cinco"
     }else if(number == 6){
         return "Seis"
     }

     return "Numero nao mapeado"
 }

fun main(){
    println(returnNumberInFull(number = 6))
}