package SpecificKotlinTypes

fun main () {

// Variáveis

    // Inteiros
    val byte: Byte = 1 // 1 byte
    val short: Short = 1 // 2 bytes
    val int: Int = 1 // 4 bytes
    val long: Long = 1 // 8 bytes

    // Reais
    val float: Float = 1.0f // 1 byte --> 6 digits
    val double: Double = 1.0 // 1 byte --> 15 digits

    // Any --> A referencia de memória aceita qualquer coisa | Aumenta o nível de abstração da linguagem
    val numberAny: Any = 10 // <- numero
    val textAny: Any = "10" // <- texto

    // Unity --> Tipo de função | Especifica funções que não tem retorno específico
    // Funções são, por padrão, Unit
    // Unit está para o void do Java
    fun add (): Unit {
        val result = 2+2
        println(result)
    }

    // Essa função não é do tipo Unit, ela é do tipo Int pois retorna um valor desse tipo
    fun add2(x: Int, y: Int): Int {
        val result = x + y
        return result
    }

    //Nothing --> Função que é uma rotina infinita, um looping infinita
}
