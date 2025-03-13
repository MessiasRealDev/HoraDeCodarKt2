fun main(){

    println("Digite o ano que você está: ")
    var ano_atual = readln().toInt()

    println("Agora digite o ano que você nasceu: ")
    var ano = readln().toInt()

    var idade = ano_atual - ano

    if(idade >= 16){
        println("Você está liberado para votar")
    }
    else{
        println("Você não ainda não pode votar")
    }
}