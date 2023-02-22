package study.theory.controlFlow

fun main(args: Array<String>) {

// ----------- If

// --- Ex. 1
    var age = 20

    if (age >= 18) {
        println("Maior ou igual a 18 anos.")
    } else {
        println("Menor de 18 anos.")
    }
// --- Ex. 2
    val a = 10
    val b = 20
    val max = if (a > b) a else b
    println(max)

// --- Ex. 3
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

    val dia = true
    saudacao(dia)
    saudacao2(dia)

}

// --- Ex. 4
fun saudacao(dia:Boolean): String {
    return if (dia) {
        "Bom dia"
    } else {
        "Boa noite"
    }
}

// Ex. 4 em unica linha:
fun saudacao2 (dia: Boolean) = if(dia) {"Bom dia"} else {"Boa tarde"}