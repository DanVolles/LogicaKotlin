package study.exercises.estacaoHack

import study.exercises.forWhilePack.sum

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

fun ex5MathArrays(n: IntArray): Float {
    val sum = n.sum()
    return (sum/5).toFloat()
}

fun ex5Math(n1:Int, n2:Int, n3:Int, n4:Int, n5:Int): Float {
    return ((n1 + n2 + n3 + n4 + n5) / 5).toFloat()
}
fun ex5() {

    println(" --- ex 5 --- ")

    print("Input the first number")
    val n1 = readln().toInt()

    print("\nInput the second number")
    val n2 = readln().toInt()

    print("\nInput the third number")
    val n3 = readln().toInt()

    print("\nInput the fourth number")
    val n4 = readln().toInt()

    print("\nInput the fifth number")
    val n5 = readln().toInt()

    val average = ex5Math(n1, n2, n3, n4, n5)

    println("The average of $n1, $n2, $n3, $n4 and $n5 is $average.")

    println(" --- now, the same but with arrays: --- ")
    val array: IntArray = intArrayOf(n1, n2, n3, n4, n5)

    val averageWithArray = ex5MathArrays(array)
    println("The average of $n1, $n2, $n3, $n4 and $n5 is $averageWithArray.")

}

fun main() {

//    ex1()
//    ex2()
//    ex3()

    ex5()

}