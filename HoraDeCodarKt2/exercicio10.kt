fun main(){

    println("Escolha uma opção:\n")
    println("1. Masculino\n")
    println("2. feminino\n")
    var opcao = readln().toInt()


    if (opcao == 1){
        masculino()
    }
    else if(opcao == 2){
        feminino()
    }
    else{
        println("opção invalida")
    }
}
fun masculino(){

    println("Digite a sua altura")
    var h = readln().toInt()
    println("O peso ideal para a sua altura é , ${(72.7 * h) - 58} ")
}
fun feminino(){

    println("Digite a sua altura: ")
    var h = readln().toInt()
    println("O peso ideal para a sua altura é: ${(62.1 * h) - 44.7}")
}