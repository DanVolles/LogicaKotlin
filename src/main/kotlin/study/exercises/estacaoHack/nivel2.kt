package study.exercises.estacaoHack

/*
Desenvolva algoritmos que:
1. Determine se uma pessoa é maior de idade ou não
2. Identifique se um determinado número inteiro é par ou ímpar
3. Conte a quantidade de vogais em uma palavra
4. Calcule o IMC de uma pessoa, imprima o valor do IMC e sua classificação
5. Imprima qualquer tabuada
6. Simule um sistema de login
 */

fun main() {

    println(" --- ex 1 --- ")

    print("Digite a sua idade: ")
    val inputIdade = readln().toInt()
    val resposta1 = maioridade(inputIdade)
    println("Essa pessoa é maior: $resposta1")
    maioridadeAlternativa(inputIdade)

    println(" --- ex 2 --- ")

    print("Digite um número: ")
    val inputN = readln().toInt()
    val resposta2 = parOuImpar(inputN)
    println("O número $inputN é par: $resposta2")
    parOuImparAlternativa(inputN)
//
//    println(" --- ex 4 --- ")
//    print("Digite o seu peso em Kg")
//    val peso = readln().toFloat()
//    print("Digite a sua altura em metros")
//    val altura = readln().toFloat()
//    imc(peso, altura)

}


fun maioridade(idade: Int):Boolean {
    return idade >= 18
}

fun maioridadeAlternativa(idade: Int) {
    if (idade >= 18) println("Pessoa é maior.") else println("Pessoa é menor")
}

fun parOuImpar(n: Int): Boolean {
    val even = n % 2
    return even == 0
}

fun parOuImparAlternativa(n: Int) {

    val resto = n % 2
    if (resto == 0) {
        println("O número é par")
    } else {
        println("O número é ímpar")
    }
}

//fun imc(peso: Float, altura: Float): String {
//
//    val imc = peso / altura*altura
//    val mensagem = "Seu IMC é $imc e você está"
//
//    return if (imc < 17) {
//        "$mensagem muito abaixo do peso"
//    } else if (imc < 18.5) {
//        "$mensagem abaixo do peso"
//    } else if (imc < 25) {
//        "$mensagem com peso normal"
//    } else if (imc < 30) {
//        "$mensagem no sobrepeso"
//    } else if (imc < 35) {
//        "$mensagem obeso"
//    } else {
//        "$mensagem obeso de risco"
//    }
}