fun main(){
    var maior = 0
    var maior2 = 0
    var soma = 0

    println("Digite o primeiro valor")
    var num1 = readln().toInt()
    println("Digite o segunto valor")
    var num2 = readln().toInt()
    println("Digite  o terceiro valor")
    var num3 = readln().toInt()

    if (num1 > num2){
        maior = num1
        maior2 = num2
    }
    else{
        maior = num2
        maior2 = num1
    }

    if(num3 > maior){
        maior2 = maior
        maior = num3
    }
    else if(num3 > maior2)
    {
        maior2 = num3
    }
    soma = maior + maior2
    println("A soma dos dois maiores números são: $soma")
}
