fun main(){
    printName("hello warga")
    divisionOfNumber(10,3)
    AddFourNumbers(60,40,50,30)
    factAboutMe("I play the piano")


}


fun printName(word:String){
    println(word)
}

fun divisionOfNumber(num1: Int, num2: Int) :Int{
    var div = num1/num2
    var sum= num1%num2
    println(sum)
    return sum
}
fun AddFourNumbers(num1: Int, num2:Int, num3: Int, num4: Int):Int{
    var sum = num1+num2+num3+num4
    println(sum)
    return sum
}
fun factAboutMe(word:String){
    println(word)


}