package study.controlFlow

fun main(args: Array<String>) {

    var numeros = arrayOf(1, 2, 3, 4, 5, 6, 100, 200, 300, 400, 500, 600)
    var i = 0

    for (i in 0..numeros.size - 1) {
        println(numeros[i])
    }
}