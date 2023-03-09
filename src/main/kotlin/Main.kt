fun main() {
    println(girlNames("Janet","Diana"))
    println(numbers(34, 28,57))
    day("Thursay")
    println(cars("mercedez-benz","rav4","prado"))

    var calculator=Calculator()
    calculator.addition(56,9)
    calculator.subtract(78,8)
    calculator.division(89,56)
    calculator.multiplication(24,8)



}
fun girlNames(name1: String,name2: String): String{
    var girls = name1 + name2
    return girls
}
fun numbers(num1: Int,num2: Int,num3: Int): Int{
    var numberArray= arrayOf(num1,num2,num3)
    return numberArray.max()
    return numberArray.min()
//    return numberArray.sortedArray()
}
fun day(name: String){
    var dayOfWeek = name
    println(dayOfWeek)
}
fun cars(x: String , y: String , z: String){
    var carArray = arrayOf(x,y,z)
    return carArray.sort()
}
class Calculator(){
    fun addition(num1: Int,num2: Int){
        var sum = num1 + num2
        println(sum)
    }
    fun subtract(num3: Int,num4: Int){
        var minus=num3-num4
        println(minus)
    }
    fun division(num5: Int,num6: Int){
        var remainder=num5/num6
        println(remainder)
    }
    fun multiplication(num7: Int,num8: Int){
        var product =num7*num8
        println(product)
    }

}
