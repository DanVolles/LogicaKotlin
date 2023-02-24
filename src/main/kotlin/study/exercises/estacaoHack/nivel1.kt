package study.exercises.estacaoHack

/*
Desenvolva algoritmos que:
1. Retorne o valor ao quadrado de um número.
2. Retorne o dobro de um número:
3. Retorne o antecessor e o sucessor de um número
4. Calcule o total de dias em 7 meses, considerando que cada mês tenha 30 dias
5. Calcule a média entre cinco valores
6. Calcule o desconto na venda de um produto
 */

fun ex1Math(n: Int): Int {
    return n*n
}

fun ex1() {

    println(" --- ex 1 --- ")
    println("Input a whole number")
    val wholeNumber = readln().toInt()
    val resultEx1 = ex1Math(wholeNumber)
    println("The square of $wholeNumber is $resultEx1")
}

fun ex2Math(n: Int): Int {
    return n*2
}

fun ex2() {

    println(" --- ex 2 --- ")
    println("Input a whole number")
    val wholeNumber = readln().toInt()
    val double = ex2Math(wholeNumber)
    println("The double of $wholeNumber is $double.")
}

fun ex3Math(n: Int): Array<Int> {

    val antecessor = n - 1
    val sucessor = n + 1

    return arrayOf(antecessor, sucessor)
}


fun ex3() {

    println(" --- ex 3 --- ")
    println("Input a whole number")
    val wholeNumber = readln().toInt()
    val between = ex3Math(wholeNumber)
    println("The antecessor of $wholeNumber is ${between[0]} and the sucessor is ${between[1]}")
}

fun ex4() {

}

fun main() {

    ex1()

    ex2()

    ex3()


}