package study.theory.oop

class Receita {
    /*
    Pode ser que você precise declarar uma variável que no início ela seja nula,
     mas nunca mais ela precisaria ser... Nesse caso, podemos fazer uma inicialização
     tardia (lateinit)
            var inst: String? = null
     */
    lateinit var instrucoes: String

    fun geraReceita() {
        instrucoes = "Lave as mãos."
    }

    fun imprimeReceita(){
        if (this::instrucoes.isInitialized) {
            instrucoes = "Lave as mãos."
        }
    }
}

fun main() {
    var r = Receita()
    // Variáveis lateinit só são alocadas na memória uma vez que são inicializadas
}