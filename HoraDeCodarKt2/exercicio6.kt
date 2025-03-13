fun main(){

    var maior = 0

    println("Digite alguns números e descubra o primeiro o ultomo e o maior deles")
    println("Digite o primeiro número")
    var num1 = readln().toInt()
    println("Digite o segundo número")
    var num2 = readln().toInt()
    println("Digite o terceiro número")
    var num3 = readln().toInt()
    println("Digite o quarto número")
    var num4 = readln().toInt()

    if(num1 > num2 && num3 > num1 && num4 > num3){
        maior = num4
    }else if(num1 > num2 && num3 > num1){
        maior = num3
    }
    else if(num2 > num1 && num2 > num3){
        maior = num2
    }else{
        maior = num1
    }
    println("O primeiro número é: $num1, o ultimo número é: $num4 e o maior número é $maior")
}