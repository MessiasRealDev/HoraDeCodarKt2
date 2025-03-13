fun main(){
    var soma = 0.0
    var media : Double

    println("Descubra a sua media")
    println("Digite o primeiro número ")
    var num1 = readln().toDouble()
    if (num1 >= 0.0 && num1 <= 10.0){
        soma += num1
    }else{
        println("O número informadi não é válido.")
    }
    println("Digite o segundo número ")
    var num2 = readln().toDouble()
    if (num2 >= 0.0 && num2 <= 10.0){
        soma += num2
    }else{
        println("O número informado não é válido.")
    }
    println("Digite o terceiro número ")
    var num3 = readln().toDouble()
    if (num1 >= 0.0 && num3 <= 10.0){
        soma += num3
    }else{
        println("O número informado não é válido.")
    }
    println("Digite o quarto número ")
    var num4 = readln().toDouble()
    if (num4 >= 0.0 && num4 <= 10.0){
        soma += num4
    }else{
        println("O número informado não é válido.")
    }
    media = soma / 4.0
    println("A média dos números informados é: $media")






}