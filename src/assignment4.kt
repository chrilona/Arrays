fun main(){
takeStrings()
numbers()
    println(names().contentToString())
    towns()
}
fun takeStrings(){
  var items = arrayOf("chairs","desks","tables","students")
    println(items.contentToString())

}
fun towns(){
  var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    for (x in cities){
        println(x.capitalize())
    }

}
fun numbers(){
var number = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(number[1]+number[4])
    println(number.indexOf(158))
    var num=number.sortedArray()
    println(num.contentToString())
}
fun names(): Array<String> {
    var nouns = arrayOf("lona","kengaaju","ismail")
    return nouns

}