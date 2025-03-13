fun main(){

    println("Agora você irá digitar 3 números e descobrir qual é o maior")
    var num1 = readln().toInt()
    println("Digite o segundo número")
    var num2 = readln().toInt()
    println("Digite o terceiro número")
    var num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        println("O número maior é $num1")
    }
    else if(num2 > num1 && num2 > num3){
        println("Omaior número é $num2")
    }
    else{
        println("O maior deles é o $num3")
    }


}