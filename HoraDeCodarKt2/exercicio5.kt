fun main(){

    var media = 0

    println("Digite 6 números e descubra a media deles")

    println("Digite o primeiro números")
    var num1 = readln().toInt()
    println("Digite o segundo nuúmero")
    var num2 = readln().toInt()
    println("digite o terceiro números")
    var num3 = readln().toInt()
    println("Digite o quarto número")
    var num4 = readln().toInt()
    println("Digite o quinto número")
    var num5 = readln().toInt()
    println("digite o sexto número")
    var num6 = readln().toInt()

    media = (num1 + num2 + num3 + num4 + num5 + num6) / 2
    println("Os números digitados são: $num1, $num2, $num3, $num4, $num5, $num6, ")
    println("O valor da média dos números digitados são: $media")
}