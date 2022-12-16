const val pi = 3.1415 // O kotlin infere que isso aqui é um float
const val x: Double = 123.123 // Estou forçando o kotlin a compilar isso aqui como um Double

fun main () {

    println(pi)

    var y = 10
    println("y = $y.")

    y = 1
    println("y = $y.")

    y = 1_000_000
    println("y = $y.")

    y -= 1
    println("y = $y.")

    y += 2
    println("y = $y.")

    y *= 3
    println("y = $y.")

    val rate: Double  = 19.5
    val hours: Int = 10
    val total = rate*hours
    println(total)

    val texts = """
    Olá, Kotlin 
    Em 
    Múltiplas 
    Linhas
""".trimIndent()
    println(texts)
}