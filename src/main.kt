fun main(){
    friends (arrayOf("Austine","John","Champion","Ashavin"))
    cities()
    Num()
    var winnie=Rafiki(arrayOf("Viola","Diana","Emma"))
    println(winnie)
}


fun friends(name:Array<String>){
    println(name.contentToString())

}
fun cities(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { city ->
        println(city.capitalize())
    }

}
fun Num(){
    var Num = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=Num[1].plus (Num[4])
    println(sum)
    var index= Num.indexOf(158)
    println(index)
    var sortedNum= Num.sortedArray()
    println(sortedNum.contentToString())
}
fun Rafiki(name:Array<String>):String{
    var Esther=name.contentToString()
    return Esther
}