fun main(){

    println("Bem-vindo a mini calculadora \n")
    println("Escolha uma opção:\n")
    println("1. fazer uma adição\n")
    println("2. Fazer uma subtração\n")
    println("3. Fazer uma divisão\n")
    println("4. fazer uma multiplicação\n")
    var opcao = readln().toInt()

    if(opcao == 1){
        adicao()
    }
    else if(opcao == 2){
        subtracao()
    }
    else if(opcao == 3){
        divisao()
    }
    else{
        multiplicacao()
    }
}
fun adicao(){
    println("Digite um número: ")
    var num1 = readln().toInt()
    println("digite o segundo número: ")
    var num2 = readln().toInt()

    var soma = num1 + num2

    println("A soma entre os dois números é  $soma")

}
fun subtracao(){
    println("Digite um número: ")
    var num1 = readln().toInt()
    println("digite o segundo número: ")
    var num2 = readln().toInt()

    var sub = num1 - num2

    println("A soma entre os dois números é $sub")

}
fun divisao(){
    println("Digite um número: ")
    var num1 = readln().toInt()
    println("digite o segundo número: ")
    var num2 = readln().toInt()

    var div = num1 / num2

    println("A soma entre os dois números é $div")
}
fun multiplicacao(){
    println("Digite um número: ")
    var num1 = readln().toInt()
    println("digite o segundo número: ")
    var num2 = readln().toInt()

    var mult = num1 * num2

    println("A soma entre os dois números é $mult")

}