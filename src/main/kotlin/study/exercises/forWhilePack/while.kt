package study.exercises.forWhilePack

/*
1. considere uma caixa de água de 2'000L. Quantos balões de 7L cabem?
2. Imrpima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo
    a. nº divisível por 3 --> Imprimir BUZZ
    b. nº divisível por 5 --> Imprimir FIZZ
    c. nº divisível por 3 e por 5 --> Imprimir FIZZBUZZ
3. Escreva um programa capaz de receber um texto e imprimí-lo invertido
4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade
de caracteres "x" e "o" e retorna true ou false. Caso não exista nem "x" nem "o", retornar false.

 */

fun ex4(text: String): Boolean {

    text.lowercase()

    var numberOfOs = 0
    var numberOfXs = 0

    var pointer = 0

    while (pointer < text.length) {

        if (text[pointer] == 'x') {
            numberOfXs++
        } else if (text[pointer] == 'o') {
            numberOfOs++
        }

        pointer++
    }

    return (numberOfOs == numberOfXs && numberOfOs != 0)

}

fun ex1(volCaixa: Int, volBalao: Int) {
    var volPreenchido = 0
    var contador = 0
    while (volPreenchido + volBalao <= volCaixa) {
        volPreenchido += volBalao
        contador++
    }
    println(contador)
}

fun ex2() {
    var i = 1
    while (i <= 50) {

        if (i % 3 == 0 && i % 5 == 0) {
            print("$i FizzBuzz ")
        } else if (i % 5 == 0) {
            print("$i Fizz ")
        } else if (i % 3 == 0) {
            print("$i Buzz ")
        } else {
            print("$i ")
        }
        i++
    }
    println() // pular linha
}

fun ex3(text: String) {
    var i = text.length - 1 // O tamanho da string é dado a partir de 0, mas a função .length é a partir de 1
    while (i >= 0) {
        print(text[i])
        i--
    }
}

fun main() {

    println(" --- ex 1 --- ")
    ex1(2000, 7)

    println(" --- ex 2 --- ")
    ex2()

    println(" --- ex 3 --- ")
    ex3("Danilo Volles Araujo")

    val text = readln()
    println(ex4(text))
}