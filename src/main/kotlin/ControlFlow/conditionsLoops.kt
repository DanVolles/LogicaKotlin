package ControlFlow

fun main() {

    // ----------- If
    val age = 20
    if (age > 18) {
        println("abrir a tela 'maior de idade'.")
    } else {
        println("abrir a tela 'menor de idade")
    }

    val a = 10
    val b = 20
    val max = if (a > b) a else b

    val bankAccount = 2000
    val product = if(bankAccount > 1900) {
        "iPhone"
    } else if (bankAccount > 1500 ) {
        "Motorola"
    } else if (bankAccount > 1000 ){
        "Samsung"
    } else {
        "No Money"
    }

    println(product)

    // ----------- While

    var sum = 1
    while (sum < 1_000) {
        sum += 1
        println(sum)
        break
    }

}