package study.exercises.ifElsePack

/*
Escreva um programa caaz de ler dois numeros inteiros que representam os lados de uma figura geométrica.
Informe se formam um quadrado (lados iguais)
 */

fun main() {

    println("In this program we will determinate if a quadrilateral is a square!\n" +
            "Please, input the height of this quadrilateral:")
    val height = readLine()

    println("Please, input the width of this quadrilateral:")
    val width = readLine()

    if (height == width) {
        println("This is a Square")
    } else {
        println("This is not a Square")
    }
}