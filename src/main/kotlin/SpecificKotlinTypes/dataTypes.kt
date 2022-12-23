package SpecificKotlinTypes

fun main () {

// ----- Variáveis

    // ----- Inteiros

    val byte: Byte = 1 // 1 byte
    println("Byte MIN ${Byte.MIN_VALUE}, MAX ${Byte.MAX_VALUE}")

    val short: Short = 1 // 2 bytes
    println("Short MIN ${Short.MIN_VALUE}, MAX ${Short.MAX_VALUE}")

    val int: Int = 1 // 4 bytes
    println("Int MIN ${Int.MIN_VALUE}, MAX ${Int.MAX_VALUE}")

    val long: Long = 1 // 8 bytes
    println("Long MIN ${Long.MIN_VALUE}, MAX ${Long.MAX_VALUE}")

    // ----- Reais

    val float: Float = 1.0f // 1 byte --> 6 digits
    println("Float MIN ${Float.MIN_VALUE}, MAX ${Float.MAX_VALUE}")

    val double: Double = 1.0 // 1 byte --> 15 digits
    println("Double MIN ${Double.MIN_VALUE}, MAX ${Double.MAX_VALUE}")

    // ----- Any --> A referencia de memória aceita qualquer coisa | Aumenta o nível de abstração da linguagem
    val numberAny: Any = 10 // <- numero
    val textAny: Any = "10" // <- texto

    // ----- Booleans
    val verdadeiro = true
    val falso = false

    // ----- Unity --> Tipo de função | Especifica funções que não tem retorno específico
    // Funções são, por padrão, Unit
    // Unit está para o void do Java
    fun add (): Unit {
        val result = 2+2
        println(result)
    }

    // ----- Essa função não é do tipo Unit, ela é do tipo Int pois retorna um valor desse tipo
    fun add2(x: Int, y: Int): Int {
        val result = x + y
        return result
    }

    // ----- Nothing --> Função que é uma rotina infinita, um looping infinita
}
