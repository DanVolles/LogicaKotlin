package study.controlFlow

fun main(args: Array<String>) {

    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 100, 200, 300, 400, 500, 600)
    var i = 0

    for (i in 0 until numeros.size) {
        println(numeros[i])
    }

    anotherWay1()

}

fun anotherWay1 () {

    for (i in 1..10) {
        println("$i ")
    }

    for (j in 0..20 step 2) {
        println("$j ")
    }

    for (k in 20 downTo 0 step 5) {
        println("$k ")
    }

    for (l in 10 downTo 0) {
        println("$l ")
    }

    val string = "Danilo Volles Araujo"
    for (char in string) {
        print("$char")
    }
}