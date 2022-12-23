package specificKotlinTypes.operators

fun main(args: Array<String>) {

    var n1 = 10
    var n2 = 20
    var n3 = 20
    var n4 = 30
    var n5 = 50

    // &&
    if (n2 == n3 && n1 < n2) {
        println("Verdadeiro")
    } else {
        println("Falso")
    }

    // ||
    if (n1 == n2 || n5 > n4) {
        println("Verdadeiro")
    } else {
        println("Falso")
    }
}