package specificKotlinTypes

fun main () {

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

    forever()

}

//Nothing --> Função que é uma rotina infinita, um looping infinito
fun forever (): Nothing {
    val text = "Eu te amo"
    while (true) {
        Thread.sleep(500)
        println(text)
    }
}