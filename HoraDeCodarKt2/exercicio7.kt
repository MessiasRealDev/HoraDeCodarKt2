fun main(){
    var soma = 0

    println("Digite 6 números e todos os números menores que 72 devem ser somados ")
    println("Digite o primeiro número: ")
    var num1 = readln().toInt()
    if(num1 < 72){
        soma = soma + num1
    }
    println("Digite o segundo número: ")
    var num2 = readln().toInt()
    if(num2 < 72){
        soma = soma + num2
    }
    println("Digite o terceiro número: ")
    var num3 = readln().toInt()
    if(num3 < 72){
        soma = soma + num3
    }
    println("Digite o quarto número: ")
    var num4 = readln().toInt()
    if(num4 < 72){
        soma = soma + num4
    }
    println("Digite o quinto número: ")
    var num5 = readln().toInt()
    if(num5 < 72){
        soma = soma + num5
    }
    println("Digite o sexto número: ")
    var num6 = readln().toInt()
    if(num6 < 72){
        soma = soma + num6
    }
    println("Números informados:  $num1, $num2, $num3, $num4, $num5, $num6")
    println("A soma dos números menores que 72: $soma")


}