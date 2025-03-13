fun main(){

    println("Digite um número e descubra qual é maior")
    var num1 = readln().toInt()
    println("Agora digite outro número")
    var num2 = readln().toInt()

    if(num1 > num2){
        println("Esse número , $num1,  é maior que esse , $num2 ")
    }
    else{
        println("Esse número , $num2,  é maior que esse , $num1")
    }
}
